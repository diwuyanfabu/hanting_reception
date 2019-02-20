package com.accp.reception.biz.lw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.reception.dao.lw.ServicesDao;
import com.accp.reception.pojo.Services;

@Service
public class ServicesBiz {
	
	@Autowired
	private ServicesDao dao;
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addservices(Services service) {
		Integer count = dao.addservies(service);
		return count;
	}
	
}
