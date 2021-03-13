package com.cybersoft.repository.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cybersoft.model.User;
import com.cybersoft.repository.UserRepository;

@Repository
@Scope("prototype")
@Transactional(rollbackOn = Exception.class)
public class UserRepositoryImpl extends BaseRepositoryImpl<User, Integer> implements UserRepository{

	public UserRepositoryImpl(SessionFactory sessionFactory) {
		super(sessionFactory, User.class);
		// TODO Auto-generated constructor stub
	}

	
//	private SessionFactory sessionFactory;
//
//	public UserRepositoryImpl(SessionFactory sessionFactory) {
//		super();
//		this.sessionFactory = sessionFactory;
//	}
//	
//	public List<User> findAll() {
//		Session session = sessionFactory.getCurrentSession();
//		Query<User> query = session.createQuery("FROM User", User.class);
//		return query.getResultList();
//	}
//
//	public void save(User entity) {
//		Session session = sessionFactory.getCurrentSession();
//		session.saveOrUpdate(entity);
//	}
//
//	public User findById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		return session.find(User.class, id);
//	}
//
//	public void deleteById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		session.remove(session.find(User.class, id));
//	}

}
