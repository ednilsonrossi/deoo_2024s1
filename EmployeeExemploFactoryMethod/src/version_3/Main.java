package version_3;

import version_3.model.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeFactory factory = new EmployeeFactory();

        Employee emp1 = factory.factoryMethod("Antonio", 20, 18.0);
        Employee emp2 = factory.factoryMethod("Breno", 3000.0);
        Employee emp3 = factory.factoryMethod("Carlos", 8, 25.0);

        List<Employee> employees = List.of(emp1, emp2, emp3);

        double sum = 0;
        for(Employee e : employees){
            e.applyReadjustment();
            sum += e.getSalary();
        }

        System.out.println("Folha de pagamento: R$ " + sum);
    }
}
