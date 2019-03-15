package com.ocloudwork.spring.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ocloudwork.spring.demo.model.Account;
import com.ocloudwork.spring.demo.service.ITestService;
import com.ocloudwork.spring.demo.service.ITestXmlService;
import com.ocloudwork.spring.demo.utils.HttpServletUtils;

@Controller
@RequestMapping("/")
public class TestController {
    private Logger logger = Logger.getLogger(TestController.class);
    @Autowired
    private ITestService testService;

    @Autowired
    private ITestXmlService testXmlService;

    @RequestMapping("/test")
    public void test(HttpServletRequest request, HttpServletResponse response) {
        List<Account> accountList = this.testService.findAccountsById(1);

        logger.info(accountList);
        HttpServletUtils.responseAccessData(response,accountList);
    }
    @RequestMapping("/testXml")
    public void testXml(HttpServletRequest request, HttpServletResponse response) {
        List<Account> accountList = this.testXmlService.findAccountsById(3);
        logger.info(accountList);
        HttpServletUtils.responseAccessData(response,accountList);
    }
}
