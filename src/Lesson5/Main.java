package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] personArr = new Employee[5];
        personArr[0] = new Employee("Ivan Ivanov", "Engineer", "ivanov@gmail.com",
                "+79991234567", 50000, 35);
        personArr[1] = new Employee("Petr Petrov", "QA Engineer", "petrov@gmail.com",
                "+79999876543", 80000, 43);
        personArr[2] = new Employee("Alex Simonov", "Engineer", "alex@gmail.com",
                "+79991236789", 100000, 49);
        personArr[3] = new Employee("Nick Kolodov", "Engineer", "nick@gmail.com",
                "+79993215465", 55000, 29);
        personArr[4] = new Employee("Gordon Levinov", "QA Engineer", "gordon@gmail.com",
                "+79999876543", 60000, 28);

        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i].getAge() > 40) {
                personArr[i].printInfo();
            }
        }




    }
}
