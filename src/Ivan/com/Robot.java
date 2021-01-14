package Ivan.com;

public class Robot implements Run, Jump {
    private int id;

    Robot (int id) {
        this.id = id;
    }
    @Override
    public void run () {
        System.out.println("Robot " + this.id + " is running");
    }
    @Override
    public void jump () {
        System.out.println("Robot " + this.id + " is jumping");
    }
}
