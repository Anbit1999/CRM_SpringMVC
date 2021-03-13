package com.cybersoft.repository.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cybersoft.model.Task;
import com.cybersoft.repository.TaskRepository;

@Repository
@Scope("prototype")
@Transactional(rollbackOn = Exception.class)
public class TaskRepositoryImpl extends BaseRepositoryImpl<Task, Integer> implements TaskRepository {

	public TaskRepositoryImpl(SessionFactory sessionFactory) {
		super(sessionFactory, Task.class);
		// TODO Auto-generated constructor stub
	}

//	private SessionFactory sessionFactory;
//
//	public TaskRepositoryImpl(SessionFactory sessionFactory) {
//		super();
//		this.sessionFactory = sessionFactory;
//	}
//
//	public List<Task> findAll() {
//		Session session = sessionFactory.getCurrentSession();
//		Query<Task> query = session.createQuery("FROM Task", Task.class);
//		return query.getResultList();
//	}
//
//	public void save(Task entity) {
//		Session session = sessionFactory.getCurrentSession();
//		session.saveOrUpdate(entity);
//	}
//
//	public Task findById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		return session.find(Task.class, id);
//	}
//
//	public void deleteById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		session.remove(session.find(Task.class, id));
//	}

}
