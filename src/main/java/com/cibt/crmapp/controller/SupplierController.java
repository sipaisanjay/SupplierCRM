/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crmapp.controller;

import com.cibt.crmapp.controller.core.AdminController;
import com.cibt.crmapp.controller.core.SiteController;
import com.cibt.crmapp.entity.Supplier;
import com.cibt.crmapp.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sanjay07
 */
@Controller
@RequestMapping("/admin/suppliers")
public class SupplierController extends AdminController<Supplier>{
    
    @Autowired
    private SupplierRepository repository;

    public SupplierController() {
        this.viewPath="admin/supplier";
    }
    
    
    
}
