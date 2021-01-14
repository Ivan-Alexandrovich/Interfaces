package Ivan.com;

public class Cat implements Run, Jump {
    private String name;

    Cat (String name) {
        this.name = name;
    }

    @Override
    public void run () {
        System.out.println("Cat " + this.name + " is running");
    }
    @Override
    public void jump () {
        System.out.println("Cat " + this.name + " is jumping");
    }
}
