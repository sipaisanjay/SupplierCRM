/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crmapp.repository;

import com.cibt.crmapp.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sanjay07
 */
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{
    
}
