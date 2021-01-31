package lesson6;

public class Dog extends Animals{

    static int count = 0;

    public Dog (){
        super();
        count++;
    }

    public Dog(String name){
        super(name);
        count++;
    }

    @Override
    public void run(int length) {
        if (length<= 500){
            System.out.println(this.name + " пробежал(а) " + length + "метров.\n");
        } else
            {System.out.println(this.name + " пробежал(а) 500м, а потом упала без сил и ползла еще "
                + (length - 500) +" метров.\nСобаки не могут бежать больше 500м.\n");
            }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {System.out.println(this.name + " проплыл(а) " + length + " метров\n");
        } else {
            System.out.println("Ваша " + this.name + " утонул(а)\n");
        }
    }
}
