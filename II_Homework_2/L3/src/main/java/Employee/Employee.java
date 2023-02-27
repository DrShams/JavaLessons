package Employee;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/*
Задание 1
Создать класс работник (состоит из полей имя, фамилия, отчество, возраст, опыт работы, зарплата,
id (который прибавляется в конструкторе создания каждый раз на единицу)),
создать работника, сериализовать его в файл worker.xml,
десериализовать из файла worker.xml и вывести в консоль результат десериализации.
 */
@JacksonXmlRootElement(localName = "Employee")
public class Employee {

    public Employee() {

    }

    public static int count;
    public int id;
    public String name;
    public String surname;
    public String patronymic;
    public int age;
    public int exprerience;
    public int salary;

    public Employee(String name, String surname, String patronymic, int age, int exprerience, int salary) {
        count++;
        this.id = count;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.exprerience = exprerience;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", exprerience=" + exprerience +
                ", salary=" + salary +
                '}';
    }
}
