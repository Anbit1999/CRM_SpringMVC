package com.cybersoft.repository.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cybersoft.model.Status;
import com.cybersoft.repository.StatusRepository;

@Repository
@Scope("prototype")
@Transactional(rollbackOn = Exception.class)
public class StatusRepositoryImpl extends BaseRepositoryImpl<Status, Integer> implements StatusRepository {

	public StatusRepositoryImpl(SessionFactory sessionFactory) {
		super(sessionFactory, Status.class);
		// TODO Auto-generated constructor stub
	}

//	private SessionFactory sessionFactory;
//
//	public StatusRepositoryImpl(SessionFactory sessionFactory) {
//		super();
//		this.sessionFactory = sessionFactory;
//	}
//
//	public List<Status> findAll() {
//		Session session = sessionFactory.getCurrentSession();
//		Query<Status> query = session.createQuery("FROM Status", Status.class);
//		return query.getResultList();
//	}
//
//	public void save(Status entity) {
//		Session session = sessionFactory.getCurrentSession();
//		session.saveOrUpdate(entity);
//	}
//
//	public Status findById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		return session.find(Status.class, id);
//	}
//
//	public void deleteById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		session.remove(findById(id));
//	}

}
