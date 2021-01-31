package lesson6;

public abstract class Animals {
    static int count = 0;
    String name;

    public Animals(String name){
        this.name = name;
        count++;
    }

    public Animals(){
        this.name = "noname";
        count++;
    }

    public abstract void run(int heignt);

    public abstract void swim(int length);

}
