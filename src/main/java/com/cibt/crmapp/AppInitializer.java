/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crmapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Sanjay07
 */
@SpringBootApplication
@EnableAutoConfiguration
public class AppInitializer {
    public static void main(String[] args) {
        
        SpringApplication.run(AppInitializer.class, args);
    }
}
