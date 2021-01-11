package com.project.saveoEclipse;

import com.project.dao.SmallScaleDao;
import com.project.dao.SmallScaleRepository;
import com.project.model.Corporate;
import com.project.model.SmallScale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SmallScaleController{
    @Autowired
    SmallScaleDao smallScaleDao;

    @RequestMapping("/smallScaleRegister")
    public void smallScaleRegister(){
        SmallScale smallScale = new SmallScale("adrm123","adrm","hyd",9939485822l,"ADRM@hyd.com","adrm");
        smallScaleDao.smallScaleRegister(smallScale);
    }

}
