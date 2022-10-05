package com.geekbrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        // создаем конигурацонный файл
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                // прописываем сущьность с которой будем работать
                .addAnnotatedClass(Product.class)

                .buildSessionFactory();
// инициализируем сессию
        Session session = null;

        // CRUD



//            // CREATE
            // запрашиваем отдельную сессию
//            session = factory.getCurrentSession();
//            Product product = new Product();
//            product.setTitle("Appal");
//            product.setId(1);
//            product.setPrice(35);
//            // любая операция с бд выполняется в рамках транзакции
//            session.beginTransaction();
//            session.save(product);
//            // после коммита нужно запрашивать новую сессию
//            session.getTransaction().commit();




          //         READ
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product1 = session.get(Product.class, 1);
//            session.getTransaction().commit();
//            System.out.println(product1);

        //                    Read list
//        session = factory.getCurrentSession();
//        session.beginTransaction();
//        List<Product> allproduct = session.createQuery("from Product").getResultList();
//        System.out.println(allproduct);
//        session.getTransaction().commit();


        //            UPDATE
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product = session.get(Product.class, 1);
//            product.setTitle("Milk");
//            session.getTransaction().commit();
//            System.out.println(product);

//                      DELETE
//        session = factory.getCurrentSession();
//           session.beginTransaction();
//            Product product = session.get(Product.class, 1);
//            session.delete(product);
//            session.getTransaction().commit();

        factory.close();

    }
}
