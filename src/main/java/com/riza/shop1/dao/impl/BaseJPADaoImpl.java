package com.riza.shop1.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseJPADaoImpl <T extends Serializable>{
	
	 private Class< T > clazz;
	 
	 @PersistenceContext
	 EntityManager entityManager;

	 public final void setClazz( Class< T > clazzToSet ){
        this.clazz = clazzToSet;
	 }
	 
	 public T findById( long id ){
        return entityManager.find( clazz, id );
	 }
	   
    public List< T > getAll(){
        return entityManager.createQuery( "from " + clazz.getName() )
            .getResultList();
    }
	 
    public void save( T entity ){
        entityManager.persist( entity );
    }
	 
    public void update( T entity ){
        entityManager.merge( entity );
    }
	 
    public void delete( T entity ){
        entityManager.remove( entity );
    }
	   
    public void deleteById( long entityId ){
        T entity = findById( entityId );
            delete( entity );
    }
	    
	  
}
