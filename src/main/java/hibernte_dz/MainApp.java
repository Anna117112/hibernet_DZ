package hibernte_dz;

public class MainApp {
    public static void main(String[] args) {
        SessionFactoryUtil sessionFactoryUtil = new SessionFactoryUtil();
        sessionFactoryUtil.init();
        try {
            ProductDao productDao = new ProductDaoImp(sessionFactoryUtil);
           // productDao.createProduct(new Product(3,"Bread",35));
           // productDao.findByID(2);
            //productDao.findAll();
            //productDao.updateNameById(2, "Milk");
           // productDao.deleteById(2);
            productDao.updatePriceByName("Bread",45);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sessionFactoryUtil.shutdown();
        }
    }
}
