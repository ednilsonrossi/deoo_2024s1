package version_2.model;

public class TeacherFactoryImpl implements EmployeeFactory {

    @Override
    public Employee factoryMethod(Object... args) {
        return new Teacher(
                (String) args[0],
                (int) args[1],
                (double) args[2]
        );
    }
}
