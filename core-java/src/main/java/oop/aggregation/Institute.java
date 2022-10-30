package oop.aggregation;

import java.util.List;

class Institute {

  private final List<Department> departments;
  // Attributes of Institute
  String instituteName;

  // Constructor of institute class
  Institute(String instituteName, List<Department> departments) {
    // This keyword refers to current instance itself
    this.instituteName = instituteName;
    this.departments = departments;
  }

  // Method of Institute class
  // Counting total students of all departments
  // in a given institute
  public int getTotalStudentsInInstitute() {
    int noOfStudents = 0;
    List<Student> students;

    for (Department dept : departments) {
      students = dept.getStudents();

      for (Student s : students) {
        noOfStudents++;
      }
    }

    return noOfStudents;
  }
}