package hibernte_dz;

import org.hibernate.Session;

import java.util.List;

public class ProductDaoImp implements ProductDao{
    private SessionFactoryUtil sessionFactoryUtil;
    public ProductDaoImp(SessionFactoryUtil sessionFactoryUtil){
        this.sessionFactoryUtil =sessionFactoryUtil;
    }
    @Override
    public void createProduct(Product product) {
        try (Session session =sessionFactoryUtil.getSession()){
            // при работе с бд открываем  транзакцию
            session.beginTransaction();
            // сохрнаем в бд обект
            session.save(product);
            //
            session.getTransaction().commit();
        }

    }

    @Override
    public Product findByID(int id) {
        try
                (Session session = sessionFactoryUtil.getSession()) {

            session.beginTransaction();
            Product product1 = session.get(Product.class, id);
            session.getTransaction().commit();
            System.out.println(product1);
           return product1;
        }
    }

    @Override
    public List<Product> findAll() {
        try (Session session = sessionFactoryUtil.getSession()) {

            session.beginTransaction();
            List<Product> allproduct = session.createQuery("from Product").getResultList();
            System.out.println(allproduct);
            session.getTransaction().commit();
            return allproduct;
        }
    }

    @Override
    public void updateNameById(int id, String name) {
        try (Session session = sessionFactoryUtil.getSession()) {

            session.beginTransaction();
            Product product = session.get(Product.class, id);
            product.setTitle(name);
            session.getTransaction().commit();
            System.out.println(product);

        }

    }

    @Override
    public void updatePriceByName(String name, int price) {
        try (Session session = sessionFactoryUtil.getSession()) {

            session.beginTransaction();
// вытаскиваем из бд обект с именем product.title = :title пишем так если имя подставим потом .setParameter("title",name)
            Product product = session.createQuery("select product from Product product where product.title = :title",Product.class)
                    .setParameter("title",name)
            .getSingleResult();
            // меняем цену
            product.setPrice(price);
            // после коммита применяются измпенения
            session.getTransaction().commit();
            System.out.println(product);

        }

    }



    @Override
    public void deleteById(int id) {
        try (Session session = sessionFactoryUtil.getSession()) {
            session.beginTransaction();
            Product product = session.get(Product.class, id);
            session.delete(product);
            session.getTransaction().commit();

        }
    }
}
