package 运动员和教练;

public class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {

    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("乒乓球教练教如何发球和接球");
    }

    public void eat() {
        System.out.println("乒乓球教练吃小白菜，喝大米粥");
    }

    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
