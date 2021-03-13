package com.cybersoft.repository.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cybersoft.model.Role;
import com.cybersoft.repository.RoleRepository;

@Repository
@Scope
@Transactional(rollbackOn = Exception.class)
public class RoleRepositoryImpl extends BaseRepositoryImpl<Role, Integer> implements RoleRepository{

	public RoleRepositoryImpl(SessionFactory sessionFactory) {
		super(sessionFactory, Role.class);
		// TODO Auto-generated constructor stub
	}

	
	
//	private SessionFactory sessionFactory;
//	
//	
//	
//	public RoleRepositoryImpl(SessionFactory sessionFactory) {
//		super();
//		this.sessionFactory = sessionFactory;
//	}
//
//	public List<Role> findAll() {
//		Session session = sessionFactory.getCurrentSession();
//		Query<Role> query = session.createQuery("FROM Role", Role.class);
//		return query.getResultList();
//	}
//
//	public void save(Role entity) {
//		Session session = sessionFactory.getCurrentSession();
//		session.saveOrUpdate(entity);
//	}
//
//	public Role findById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		return session.find(Role.class, id);
//	}
//
//	public void deleteById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		session.remove(findById(id));
//	}

}
