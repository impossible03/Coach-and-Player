package 运动员和教练;

public abstract class Player extends Person {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
