package com.project.saveoEclipse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.CorporateDao;
import com.project.model.Corporate;

import java.util.Date;

@RestController
public class CorporateController {
	@Autowired
	CorporateDao corporateDao;
	
	@RequestMapping("/corporateRegister")
	public void corporateRegister() {
		Corporate corporate = new Corporate("apollo123","apollo","hyd",9939485866l,"apollo@hyd.com",new Date(),"apollo");
		corporateDao.corporateRegister(corporate);
		
		
	}
	
	

}
