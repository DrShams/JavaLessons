import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect//обьект этого класса можно сериализовать, java -> json
public class Orange extends Product{
    public boolean withBones;
    public Orange() {

    }
    public Orange(int price, String title, int weight, boolean withBones) {
        super(price, title, weight);
        this.withBones = withBones;
    }

    @Override
    public String toString() {
        return "Products.Orange{" +
                "withBones=" + withBones +
                ", weight=" + weight +
                ", price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}