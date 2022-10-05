package hibernte_dz;

import javax.persistence.*;
// связь нашей сущьности с обектом в таблице
@Entity
// хотим хранить сущьность в таблице products
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


// обязательно должен быть пустой конструктор
    public Product() {
    }

    public Product(int id, String title, int price){
        this.id = id;
        this.title = title;
        this.price = price;
    }



    @Override
    public String toString() {
        return "Product [" + id + " " + title + " " +price + "]";
    }

}
