package com.project.dao;

import com.project.model.SmallScale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmallScaleDao {
    @Autowired
    SmallScaleRepository smallScaleRepository;

    public void smallScaleRegister(SmallScale smallScale){
        smallScaleRepository.save(smallScale);
    }

}
