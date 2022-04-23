package 运动员和教练;

public class BasketballCoach extends Coach {
    public BasketballCoach() {

    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }

    public void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }
}
