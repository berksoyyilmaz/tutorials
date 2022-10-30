package oop.aggregation;

import java.util.List;

class Department {
  private final List<Student> students;
  // Attributes of Department class
  String name;

  Department(String name, List<Student> students) {
    // this keyword refers to current instance itself
    this.name = name;
    this.students = students;
  }

  // Method of Department class
  public List<Student> getStudents() {
    // Returning list of user defined type
    // Student type
    return students;
  }
}