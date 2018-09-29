/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incredible.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pro
 */
@PropertySource("app.properties") //path injection
@Repository
public class DataDao {

    @Value("${external.db.url}") //value injection
    private String dburl;

    public String getDburl() {
        return dburl;
    }

}
