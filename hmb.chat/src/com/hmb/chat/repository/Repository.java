package com.hmb.chat.repository;

import java.util.List;
import java.util.function.Predicate;

public interface Repository<TEntity> {

	boolean insert(TEntity entity);
	
	TEntity find(Predicate<TEntity> predicate);
	List<TEntity> get(Predicate<TEntity> filter);
	TEntity getFirst(Predicate<TEntity> predicate);
	TEntity getById(int id);
	List<TEntity> getAll();
	boolean checkExistById (String id);
	
	void update(TEntity entity);
	void delete(TEntity entityToDelete);
	void deleteAll();
}
