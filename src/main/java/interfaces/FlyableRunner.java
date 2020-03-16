package interfaces;

interface Flyable{
    String fly();
}

class Bird implements Flyable{

    @Override
    public String fly() {
        return "with wings";
    }

}

class Aeroplane implements Flyable{

    @Override
    public String fly() {
        return "with fuel";
    }

}

public class FlyableRunner {

    public static void main(String[] args) {
        Flyable[] flyingObjects = { new Bird(), new Aeroplane()};
        for(Flyable object : flyingObjects) {
            object.fly();
        }
    }

}
