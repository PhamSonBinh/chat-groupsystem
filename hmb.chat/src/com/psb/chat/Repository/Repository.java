package com.psb.chat.Repository;

import java.util.List;

public interface  Repository<T> { 
	public void add(T t);
	List<T> getAll();
	List<T> findBySpecification(Specification specification);
	void update(T oldT, T newT);
	void remove(long id);
}
