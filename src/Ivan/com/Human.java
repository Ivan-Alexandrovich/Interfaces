package Ivan.com;

public class Human implements Run, Jump{
    private String name;

    Human (String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name + " is running");
    }
    @Override
    public void jump () {
        System.out.println(this.name + " is running");
    }
}
