package obiekty;

public class MyUser extends ObiektBazowy {

    public MyUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return super.getName();
    }
}
