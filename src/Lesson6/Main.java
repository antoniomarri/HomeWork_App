package Lesson6;

public class Main {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Бобик", 500, 10);
        Dogs dog2 = new Dogs("Песик", 500, 10);
        Dogs dog3 = new Dogs("Барбос", 500, 10);

        Cats cat1 = new Cats("Мурзик", 200, 0);
        Cats cat2 = new Cats("Фирзик", 200, 0);

        dog1.swim(8);
        dog2.run(300);
        cat1.swim(5);
        cat2.run(250);

        System.out.println(Animals.count);
        System.out.println(Cats.count);
        System.out.println(Dogs.count);
    }
}
