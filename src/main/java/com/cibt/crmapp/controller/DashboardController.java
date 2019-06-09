/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crmapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sanjay07
 */
@Controller
@RequestMapping("/admin/dashboard")
public class DashboardController{

    @GetMapping
    public String index(){
        return "admin/index";
    }
    
    
    
}
