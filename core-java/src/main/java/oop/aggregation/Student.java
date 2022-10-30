package oop.aggregation;

class Student {

  // Attributes of student
  String name;
  int id;
  String dept;

  // Constructor of student class
  Student(String name, int id, String dept) {

    // This keyword refers to current instance itself
    this.name = name;
    this.id = id;
    this.dept = dept;
  }
}