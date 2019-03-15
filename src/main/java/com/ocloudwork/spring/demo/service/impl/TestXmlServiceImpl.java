package com.ocloudwork.spring.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ocloudwork.spring.demo.dao.ITestXmlDAO;
import com.ocloudwork.spring.demo.model.Account;
import com.ocloudwork.spring.demo.service.ITestXmlService;

@Service("testXmlService")
public class TestXmlServiceImpl implements ITestXmlService {

	Logger logger = LoggerFactory.getLogger(TestXmlServiceImpl.class);

	@Resource
	private ITestXmlDAO testXmlDAO;
	public void test() {
	}

	public int insertAccount(Account account){
		return this.testXmlDAO.insertAccount(account);
	}

	public Account findAccountById(int i) {
		
		return this.testXmlDAO.getAccountById(i);
	}

	public List<Account> findAccountsById(int i) {
		List<Account> accounts = this.testXmlDAO.findAccountsById(i);
		return accounts;
	}

}
