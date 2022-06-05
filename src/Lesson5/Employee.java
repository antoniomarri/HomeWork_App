package Lesson5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String fio, String position, String email,
                    String phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void printInfo () {
        System.out.println("[" + fio + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age + "]");
    }

}

