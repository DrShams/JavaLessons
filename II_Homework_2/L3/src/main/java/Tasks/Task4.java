package Tasks;

import Employee.Employee;
import Other.Address;
import Other.Office;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) throws IOException {
        /*
            Создать список из 100 офисов, в каждом из которых работает по 10 работников и сериализовать его в xml.
        */

        int offices = 100;
        int employees = 10;
        String [] fn =  {"Ivan", "Ruslan", "Arnold"};
        String [] sn = {"Sharz", "Сергеевич", "Шамсиев"};
        String [] pn = {"Ivanov", "Ruslanov", "Arnoldov"};
        Random random = new Random();
        List <Object> officesList = new ArrayList<>();
        for(int i = 0; i < offices; i++) {

            List<Employee> workerList = new ArrayList<>();
            for(int emp = 0; emp < employees; emp++){
                Employee empe = new Employee(
                        fn[random.nextInt(fn.length)],
                        sn[random.nextInt(fn.length)],
                        pn[random.nextInt(fn.length)],
                        30+emp,
                        10,
                        100);
                workerList.add(empe);
            }

            Office office = new Office(new Address("Russia", "Ufa", "Zhukov", 10, 1, 1 + i), workerList);
            officesList.add(office);
        }

        ObjectMapper mapper = new XmlMapper();
        FileWriter fileWriter = new FileWriter("src/offices.xml");

        mapper.writeValue(fileWriter, officesList);
        FileReader fileReader = new FileReader("src/offices.xml");
        officesList = mapper.readValue(fileReader, List.class);
        System.out.println(officesList.toString());

    }
}
