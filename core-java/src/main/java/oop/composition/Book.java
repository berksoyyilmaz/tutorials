package oop.composition;

class Book {

  // Attributes of book
  public String title;
  public String author;

  // Constructor of Book class
  Book(String title, String author) {

    // This keyword refers to current instance itself
    this.title = title;
    this.author = author;
  }
}