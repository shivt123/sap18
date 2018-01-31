package com.sapient.client;

import java.util.List;
import java.util.stream.Stream;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.IDao;
import com.sapient.vo.Emp;

public class ClientA {

	public static void main(String args[]) {
		
		IDao dao=DaoFactory.getDaoInstance();
		List<Emp> lst=dao.getEmployee();
		Stream<Emp> s=lst.stream().sorted((e1,e2)->((Double)e2.getSal()).compareTo(e1.getSal()));
		s.forEach(Emp::display);
	}
}
