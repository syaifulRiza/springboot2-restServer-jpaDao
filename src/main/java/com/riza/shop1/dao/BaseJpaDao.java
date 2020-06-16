package com.riza.shop1.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseJpaDao <T extends Serializable> {

	public T findById( long id );
	    	
	public List<T> getAll();
	
	public void save (T t);
	
	public void update(T t);
	
	public void delete(T t);
	
	public void deleteById( long id );
}
