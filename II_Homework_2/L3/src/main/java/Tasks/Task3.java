package Tasks;

import Employee.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 {

    public static void main(String[] args) throws IOException {
        /*
            Cоздать работника, сериализовать его в файл worker.xml, десериализовать из файла worker.xml и вывести в консоль результат десериализации.
        */
        Employee employee = new Employee("Ruslan","Shamsiev", "Rinatovich", 30, 10, 100);
        ObjectMapper mapper = new XmlMapper();
        FileWriter fileWriter = new FileWriter("src/worker.xml");
        mapper.writeValue(fileWriter, employee);
        FileReader fileReader = new FileReader("src/worker.xml");
        employee = mapper.readValue(fileReader, Employee.class);
        System.out.println(employee.toString());

    }
}
