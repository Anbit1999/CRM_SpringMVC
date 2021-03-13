package com.cybersoft.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cybersoft.repository.BaseRepository;

@Transactional(rollbackOn = Exception.class)
public class BaseRepositoryImpl<T, K> implements BaseRepository<T, K> {

	private SessionFactory sessionFactory;
	private Class<T> clazz;
	
	
	
	public BaseRepositoryImpl(SessionFactory sessionFactory, Class<T> clazz) {
		super();
		this.sessionFactory = sessionFactory;
		this.clazz = clazz;
	}

	public List<T> findAll() {
		Session session = sessionFactory.getCurrentSession();
		Query<T> query = session.createQuery("From " + clazz.getSimpleName(), clazz);
		return query.getResultList();
	}

	public void save(T entity) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
	}

	public T findById(K id) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(clazz, id);
	}

	public void deleteById(K id) {
		Session session = sessionFactory.getCurrentSession();
		T entity = session.find(clazz, id);
		session.remove(entity);
	}

}
