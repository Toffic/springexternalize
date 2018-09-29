/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incredible.service;

import com.incredible.data.DataDao;
import com.incredible.service.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Pro
 */
@Component
@Controller
@Configuration

public class Manipulate {
    
    public String appendToDb( ApplicationContext acx ){
       DataDao db =  acx.getBean(DataDao.class); // get the object  or bean
       
       return db.getDburl() + "pass through business logic";
    }
    
    public void theUnknownImpl(ApplicationContext acx){
        
        BinarySearchImpl binaryImpl = acx.getBean(BinarySearchImpl.class);
        
        int value =binaryImpl.binarySearch(new int[]{3,5,3,4}, 5);
        
        System.out.println("value from unknown algorithm "+ value);
    }
    
}
