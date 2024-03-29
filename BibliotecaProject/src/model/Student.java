package model;

public class Student extends User{

    public Student(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public int getDaysBorrow() {
        return 5;
    }
}
