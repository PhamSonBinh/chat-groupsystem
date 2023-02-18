package com.hmb.chat.repository;

import java.util.List;
import java.util.function.Predicate;

public interface Repository<T> {
	void add(T t);
	void delete(String id);
	void update(T entity);
	List<T> getAll();
	T getElement(String id);
	boolean exist (String id);
	
	T getFirst(Predicate<T> predicate);
}
