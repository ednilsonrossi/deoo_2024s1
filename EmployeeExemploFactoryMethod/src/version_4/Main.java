package version_4;

import version_4.model.Employee;
import version_4.model.EmployeeFactory;
import version_4.model.EmployeeType;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeFactory factory = new EmployeeFactory();

        Employee emp1 = factory.factoryMethod(EmployeeType.TEACHER,"Antonio", 20, 18.0);
        Employee emp2 = factory.factoryMethod(EmployeeType.TECHNICIAN,"Breno", 3000.0);
        Employee emp3 = factory.factoryMethod(EmployeeType.TEACHER, "Carlos", 8, 25.0);

        List<Employee> employees = List.of(emp1, emp2, emp3);

        double sum = 0;
        for(Employee e : employees){
            e.applyReadjustment();
            sum += e.getSalary();
        }

        System.out.println("Folha de pagamento: R$ " + sum);
    }
}
