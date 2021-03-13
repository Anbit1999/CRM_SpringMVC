package com.cybersoft.repository;

import java.util.List;

public interface BaseRepository<T, K> {
	List<T> findAll();
	void save(T entity);
	T findById(K id);
	void deleteById(K id);
}
