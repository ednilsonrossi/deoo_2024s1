package version_4.model;

public class EmployeeFactory {

    public Employee factoryMethod(EmployeeType type, Object... args){
        switch (type){
            case TEACHER -> {
                return new Teacher(
                        (String) args[0],
                        (int) args[1],
                        (double) args[2]
                );
            }
            case TECHNICIAN -> {
                return new Technician(
                        (String) args[0],
                        (double) args[1]
                );
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}
