/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crmapp.controller.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sanjay07
 */
public abstract class AdminController<T> extends SiteController{
    
    @Autowired
    protected JpaRepository<T,Integer> repo;
    
    
    @GetMapping
    public String index(Model model){
        model.addAttribute("records", repo.findAll());
        return viewPath+"/index";
    }
    
    
    
    
    
}
