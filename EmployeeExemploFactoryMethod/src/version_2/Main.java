package version_2;

import version_2.model.Employee;
import version_2.model.EmployeeFactory;
import version_2.model.TeacherFactoryImpl;
import version_2.model.TechnicianFactoryImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeFactory factoryTeacher = new TeacherFactoryImpl();
        EmployeeFactory factoryTechnician = new TechnicianFactoryImpl();

        Employee emp1 = factoryTeacher.factoryMethod("Antonio", 20, 18.0);
        Employee emp2 = factoryTechnician.factoryMethod("Breno", 3000.0);
        Employee emp3 = factoryTeacher.factoryMethod("Carlos", 8, 25.0);

        List<Employee> employees = List.of(emp1, emp2, emp3);

        double sum = 0;
        for(Employee e : employees){
            e.applyReadjustment();
            sum += e.getSalary();
        }

        System.out.println("Folha de pagamento: R$ " + sum);
    }
}
