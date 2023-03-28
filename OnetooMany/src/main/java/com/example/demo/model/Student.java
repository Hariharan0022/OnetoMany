package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="studentDetails")
public class Student {
 @Id
 private int id;
 private String name;
 @OneToMany(cascade=CascadeType.ALL)
 @JoinColumn(name="fk_add_id")
 private List<Address> address;
	
 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public List<Address> getAddress() {
  return address;
 }

 public void setAddress(List<Address> address) {
  this.address = address;
 }
 public Student(int id, String name, List<Address> address) {
  super();
  this.id = id;
  this.name = name;
  this.address = address;
 }

 public Student() {
  
 }
}