package com.hmb.chat.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import com.hmb.chat.entity.BaseEntity;

public class InMemoryRepository<TEntity extends BaseEntity> implements Repository<TEntity> {
	private List<TEntity> entities;
	public static int idCounter = 1;
	public InMemoryRepository() {
		entities = new ArrayList<>();
	}
	
	

	@Override
	public List<TEntity> get(Predicate<TEntity> filter) {
		List<TEntity> result = new ArrayList<>(entities);
		if (filter != null) {
			result.removeIf(filter.negate());
		}
		return result;
	}

	@Override
	public TEntity find(Predicate<TEntity> predicate) {
		return entities.stream().filter(predicate).findFirst().orElse(null);
	}

	@Override
	public boolean insert(TEntity entity) {

		if (entity == null) {
			return false;
		}
		entity.setId(idCounter);
		idCounter++;
		entities.add(entity);
		return true;
	}

	@Override
	public void delete(TEntity entityToDelete) {
		entities.remove(entityToDelete);
	}
	
	@Override
	public void deleteAll() {
		entities.clear();
	}
	

	@Override
	public TEntity getFirst(Predicate<TEntity> predicate) {
		Optional<TEntity> entity = entities.stream().filter(predicate).findFirst();
		return entity.isPresent() ? entity.get() : null;
	}

	@Override
	public TEntity getById(int id) {
		Optional<TEntity> entity = entities.stream().filter(e -> e.getId() == id).findFirst();
		return entity.get();
	}

	@Override
	public void update(TEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TEntity> getAll() {
		// TODO Auto-generated method stub
		return this.entities;
	}

	@Override
	public boolean checkExistById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
