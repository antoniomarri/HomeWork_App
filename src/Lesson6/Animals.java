package Lesson6;

public abstract class Animals {
    private String name;
    private int limitSwim;
    private int limitRun;

    public Animals(String name, int limitRun, int limitSwim) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimitSwim() {
        return limitSwim;
    }

    public void setLimitSwim(int limitSwim) {
        this.limitSwim = limitSwim;
    }

    public int getLimitRun() {
        return limitRun;
    }

    public void setLimitRun(int limitRun) {
        this.limitRun = limitRun;
    }

    public static int count = 0;

    public abstract void swim(int dist);

    public abstract void run(int dist);

}
