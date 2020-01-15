package com.luban.dao;

import org.springframework.stereotype.Component;

@Component
public class OrderTabDaoImpl implements OrderTabDao {
	@Override
	public void update(String sql) {
		System.out.println("target------");
	}
}
