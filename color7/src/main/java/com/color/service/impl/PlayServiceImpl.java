package com.color.service.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.color.domain.PlayGroup;
import com.color.service.PlayService;

@Service("playService")
public class PlayServiceImpl implements PlayService {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(PlayGroup playGroup) {
		sessionFactory.getCurrentSession().save(playGroup);
		System.out.println("-----------success----------------");
	}

}
