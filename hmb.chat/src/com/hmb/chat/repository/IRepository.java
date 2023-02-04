package com.hmb.chat.repository;

public interface IRepository<T> {
	void add(T entity);
	void delete(String id);
	void update(T entity);
	T get(String id);
	boolean exist (String id);
}
