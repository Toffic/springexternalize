/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incredible;

import com.incredible.service.Manipulate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Pro
 */
@ComponentScan("com.incredible")

public class user {

    public static void main(String[] args) {
        ApplicationContext acx = new AnnotationConfigApplicationContext(user.class);
        Manipulate manipulateBusineess = acx.getBean(Manipulate.class);
        String from = manipulateBusineess.appendToDb(acx);
        manipulateBusineess.theUnknownImpl(acx);

        System.out.println(from);

    }
}
