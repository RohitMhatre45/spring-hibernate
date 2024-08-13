package com.ro.Dao;
import java.util.*;


import com.ro.model.Emp;

public interface DaoAg {
	
	public int saveEmp(Emp emp);
	
	public Emp getEmpById(int id);
	
	public List<Emp> getAllEmp();
	
	public void update(Emp emp);
	
	public void deleteEmp(int id);
}
