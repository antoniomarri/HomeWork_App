package Lesson2;

public class Main {
    public static void main(String[] args) {

    }
    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     что их сумма лежит в пределах от 10 до 20 (включительно),
     если да – вернуть true, в противном случае – false.
     */
    public static boolean sumIn10to20 (int x1, int x2) {
        int sum = x1 + x2;
        if (sum > 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    /* 2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */
    public static void isPositiveOrNegative (int a) {
        if (a >= 0) {
            System.out.println("Число" + a + "положительное");
        } else {
            System.out.println("Число" + a + "отрицательное");
        }
    }

    /* 3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    public static boolean isNegative (int a) {
        if (a < 0) {
            return true;
        }
            return false;
        }

    /* 4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void printWordNTimes () {
        String word = "Something";
        int times;
        for (times = 0; times < 7; times++) {
            System.out.println(word);
        }
    }
    }





