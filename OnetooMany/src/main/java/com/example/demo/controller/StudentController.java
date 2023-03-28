package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@RestController
public class StudentController {
 @Autowired
 private StudentRepo stuRepo;
	
 @PostMapping("/om")
    public ResponseEntity<String> saveEmployees(@RequestBody Student stuData) {
        stuRepo.save(stuData);
        return ResponseEntity.ok("Data saved");
    }
	
 @GetMapping("/showinfo")
 public List<Student> getDetails() {
  return stuRepo.findAll();
 }
	
	
}