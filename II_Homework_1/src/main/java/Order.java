import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
@JsonAutoDetect
public class Order {
    public int id;//номер заказа

    public Delivery_address address;
    public List<Product> productList;//список продуктов

    public Order() {
        //Exception in thread "main" com.fasterxml.jackson.databind.exc.InvalidDefinitionException:
        //Cannot construct instance of `Order` (no Creators, like default constructor, exist): cannot
        //deserialize from Object value (no delegate- or property-based Creator)
        //at [Source: (FileReader); line: 1, column: 2]
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", address=" + address +
                ", productList=" + productList +
                '}';
    }

    public Order(int id, Delivery_address address,List<Product> productList) {//тип данных
        this.id = id;
        this.address = address;
        this.productList = productList;

    }
}