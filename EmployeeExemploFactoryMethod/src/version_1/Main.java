package version_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Teacher("Antonio", 20, 18);
        Employee emp2 = new Technician("Breno", 3000.0);
        Employee emp3 = new Teacher("Carlos", 8, 25);

        List<Employee> employees = List.of(emp1, emp2, emp3);

        double sum = 0;
        for(Employee e : employees){
            e.applyReadjustment();
            sum += e.getSalary();
        }

        System.out.println("Folha de pagamento: R$ " + sum);
    }
}
