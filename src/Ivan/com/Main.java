package Ivan.com;

public class Main {

    public static void main(String[] args) {
	Human Ivan = new Human("Ivan");
	Cat cat = new Cat("Tom");
	Robot robot = new Robot(123);
	cat.run();
	Ivan.jump();
	robot.jump();
    }
}
