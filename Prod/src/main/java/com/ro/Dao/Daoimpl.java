package com.ro.Dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ro.model.Emp;

@Repository
@Transactional(readOnly = false)
public class Daoimpl implements DaoAg {
	
	
	private HibernateTemplate hv;
	
	@Autowired
	public void setHibernateTemplate(HibernateTemplate hv) {
		this.hv = hv;
	}

	@Override
	@Transactional
	public int saveEmp(Emp emp) {
		return (Integer) hv.save(emp);
	}

	@Override
	public Emp getEmpById(int id) {
		return hv.get(Emp.class, id);
	}

//	@Override
//	public List<Emp> getAllEmp(); {
//		return hv.loadAll(Emp.class);
//	}

	@Override
	@Transactional
	public void update(Emp emp) {
		hv.update(emp);
	}

	@Override
	@Transactional
	public void deleteEmp(int id) {
		Emp emp = hv.get(Emp.class, id);
		hv.delete(emp);
	}

	@Override
	@Transactional
	public List<Emp> getAllEmp() {
		// TODO Auto-generated method stub
		return hv.loadAll(Emp.class);
	}
	
	

}
