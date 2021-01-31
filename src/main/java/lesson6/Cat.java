package lesson6;

public class Cat extends Animals {

    static int count = 0;

    public Cat (){
        super();
        count++;
    }

    public Cat(String name){
        super(name);
        count++;
    }

    @Override
    public void run(int length) {
        if (length<=200){
            System.out.println(this.name + " пробежал(а) " + length + " метров.\n");
        } else {
            System.out.println(this.name + " пробежал(а) " + 200 + " метров." + " Затем сел и начал вылизываться. Фиг ты заставишь пробежать " + length + " метров это ленивое животное.\n");
        }
    }

    @Override
    public void swim(int length) {
        if(length>0) {
            System.out.println("буль буль\n");
        } else {
            System.out.println("Ты отделался распаласованным лицом\n");
        }
    }
}
