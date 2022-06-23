package Lesson6;

public class Cats extends Animals{

    public Cats(String name, int limitRun, int limitSwim) {
        super(name, limitRun, limitSwim);
        count++;
    }
    public static int count = 0;


    public int dist;


    @Override
    public void swim(int dist) {
        if (dist > 0)
            System.out.println(getName() + " не умеет плавать((");
    }

    @Override
    public void run(int dist) {
        if (dist <= 200)
        System.out.println(getName() + " пробежал " + dist+"м");
        else System.out.println(getName() + " столько не пробежт");
    }


}
