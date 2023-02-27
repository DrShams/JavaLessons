package Other;

import Employee.Employee;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Office {

    public Office() {

    }

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Employee")

    public Address address;
    public List<Employee> employees;

    public Office(Address address, List<Employee> employees) {
        this.address = address;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Office{" +
                "address=" + address +
                ", employees=" + employees +
                '}';
    }
}