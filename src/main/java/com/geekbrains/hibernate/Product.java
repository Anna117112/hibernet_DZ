package com.geekbrains.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Author getAuthor_id() {
//        return author_id;
//    }
//
//    public void setAuthor_id(Author author_id) {
//        this.author_id = author_id;
//    }

    public Product() {
    }

    //(fetch = FetchType.LAZY)

//    @ManyToMany(mappedBy="readers")
//    @JoinTable(
//            name = "books_readers", // название таблицы
//            joinColumns = @JoinColumn(name = "book_id"),  // то что связываем
//            inverseJoinColumns = @JoinColumn(name = "reader_id") // то на что связываем
//    )
////    @ManyToMany(mappedBy="books")
//    private List<Reader> readers;


    //   @ManyToOne
    // (fetch = FetchType.LAZY)
//    @OneToOne
//    @JoinColumn(name = "author_id")
//    private Author author_id;
//
//    public Author getAuthor_id() {
//        return author_id;
//    }

//    public List<Reader> getReaders() {
//        return readers;
//    }
////
//    public void setReaders(List<Reader> readers) {
//        this.readers = readers;
//    }

//    public void setAuthor_id(Author author_id) {
//        this.author_id = author_id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }

//    @Override
//    public String toString() {
//        return "Book [" + id + " " + title + "]";
//    }

    @Override
    public String toString() {
        return "Product [" + id + " " + title + " " +price + "]";
    }
//    @Override
//    public String toString() {
//        String allReaders = "";
//        for (Reader r : readers) {
//            allReaders += r.getName() + " ";
//        }
//        return "Book [" + id + " " + title + " " + author_id.getName() + " " + allReaders + " ]";
//    }
}
