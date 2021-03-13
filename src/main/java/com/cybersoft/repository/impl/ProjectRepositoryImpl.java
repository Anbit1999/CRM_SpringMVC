package com.cybersoft.repository.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cybersoft.model.Project;
import com.cybersoft.repository.ProjectRepository;

@Repository
@Transactional(rollbackOn = Exception.class)
@Scope("prototype")
public class ProjectRepositoryImpl extends BaseRepositoryImpl<Project, Integer> implements ProjectRepository{

	public ProjectRepositoryImpl(SessionFactory sessionFactory) {
		super(sessionFactory, Project.class);
		
	}

	

//	public List<Project> findAll() {
//		Session session = sessionFactory.getCurrentSession();
//		Query<Project> query = session.createQuery("FROM Project", Project.class);
//		return query.getResultList();
//	}
//
//	public void save(Project entity) {
//		Session session = sessionFactory.getCurrentSession();
//		session.saveOrUpdate(entity);
//		
//	}
//
//	public Project findById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		return session.find(Project.class, id);
//	}
//
//	public void deleteById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		session.remove(session.find(Project.class, id));
//	}

}
