/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.controller;

import com.mycompany.test.model.Student;
import com.mycompany.test.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UMBOON
 */
@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentrepo;

    @RequestMapping(value = "/savestudent", method = RequestMethod.POST)
    public void saveStudent(@RequestBody Student student) {
        studentrepo.save(student);

    }
    
    

}
