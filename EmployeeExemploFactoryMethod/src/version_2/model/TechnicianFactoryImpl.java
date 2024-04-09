package version_2.model;

public class TechnicianFactoryImpl implements EmployeeFactory {

    @Override
    public Employee factoryMethod(Object... args) {
        return new Technician(
                (String) args[0],
                (Double) args[1]
        );
    }
}
