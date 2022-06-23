package Lesson6;

public class Dogs extends Animals {

    public Dogs(String name, int limitRun, int limitSwim) {
        super(name, limitRun, limitSwim);
        count++;
    }

    public int dist;
    public static int count = 0;

    @Override
    public void swim(int dist) {
        if (dist <= 10)
        System.out.println(getName() + " проплыл " + dist+"м");
        else System.out.println(getName() + " столько не проплывет(");
    }

    @Override
    public void run(int dist) {
        if (dist <= 500)
            System.out.println(getName() + " пробежал " + dist+"м");
        else System.out.println(getName() + " столько не пробежт");
    }
}
