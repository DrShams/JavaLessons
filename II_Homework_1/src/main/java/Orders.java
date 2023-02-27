import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Orders {

    public static void main(String[] args) throws IOException {//компилятор говорит о том, что в этом месте возможна проблема ввода-вывода
        int num_iterations = 100;//количество итераций адресов+список продуктов
        List<Order> orderList = new ArrayList<>();//создаем список заказов
        List<Product> productList = new ArrayList<>();//создаем список продуктов, который будет позже наполнять

        Orange orange = new Orange(1, "Сочные апельсины", 100, true);//price = 1 USD for 1 KG
        Apple apple = new Apple(1, "Вкусные яблоки", 100, "green");//price = 1 USD for 1 KG

        productList.add(orange);
        productList.add(apple);

        for (int id = 0; id < num_iterations; id++) {
            Delivery_address address = new Delivery_address("Russia", "Ufa", "Korolev", 6, 4, 1+id);//the owner of the house ))
            Order order = new Order(id, address, productList);
            orderList.add(order);
        }
        ObjectMapper mapper = new ObjectMapper();// -> создать обьект json
        //Сериализация -> записать в файл
        FileWriter fileWriter = new FileWriter("src/order.json");
        mapper.writeValue(fileWriter, orderList);
        //Десериализация <- прочитать с файла
        FileReader fileReader = new FileReader("src/order.json");
        orderList = mapper.readValue(fileReader, ArrayList.class);//ArrayList.list ? загуглить
        System.out.println(orderList.toString());//
    }
}
