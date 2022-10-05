package hibernte_dz;

import java.util.List;

public interface ProductDao {
    void createProduct(Product product);
    Product findByID(int id);
    List<Product> findAll();


    void updateNameById(int id, String name);
    void updatePriceByName(String name, int price);

    void deleteById(int id);



}
