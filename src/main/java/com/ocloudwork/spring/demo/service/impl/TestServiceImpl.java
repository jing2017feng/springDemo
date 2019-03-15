package com.ocloudwork.spring.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ocloudwork.spring.demo.dao.ITestDAO;
import com.ocloudwork.spring.demo.model.Account;
import com.ocloudwork.spring.demo.service.ITestService;

@Service("testService")
public class TestServiceImpl implements ITestService {

	Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

	@Resource
	private ITestDAO testDAO;
	public void test() {
	}

	public boolean transfer(float money, int from, int to) throws Exception {
		
		this.testDAO.minusMoney(from, money);
		//int i = 1/0;
		this.testDAO.addMoney(to, money);
		return true;
	}
	
	public int insertAccount(Account account){
		return this.testDAO.insertAccount(account);
	}

	public Account findAccountById(int i) {
		
		return this.testDAO.getAccountById(i);
	}

	public List<Account> findAccountsById(int i) {
		return this.testDAO.findAccountsById(i);
	}

}
