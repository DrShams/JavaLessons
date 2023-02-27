import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value= Apple.class, name="apple"),
        @JsonSubTypes.Type(value= Orange.class, name="orange")
})
@JsonAutoDetect

/*
Создать базовый класс продукта: состоит из цены(price), названия(title), веса(weight) (поле должно быть игнорируемым), а также наследников
    Яблоко(Apple): содержит дополнительное поле цвет(color),
    Апельсин(Orange): содержит дополнительное поле наличие косточек(withBones),
сериализовать объект каждого из классов в json файл, десериализовать из файла в объект.
 */
public class Product {
    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", price=" + price +
                ", title='" + title + '\'' +
                '}';
    }

    @JsonIgnore
    public int weight;
    public int price;
    public String title;

    public Product(int price, String title, int weight) {
        this.price = price;
        this.title = title;
        this.weight = weight;
    }
}