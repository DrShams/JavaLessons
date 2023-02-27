import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Delivery_address {//Создаем класс адреса доставки (состоит из полей страна, город, улица, дом, этаж, квартира).
    //
    public String country, city, street;
    public int home, level, room;

    public Delivery_address() {
        //пустой конструктор
    }

    public Delivery_address(String country, String city, String street, int home, int level, int room) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.home = home;
        this.level = level;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Delivery_address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", home=" + home +
                ", level=" + level +
                ", room=" + room +
                '}';
    }

}