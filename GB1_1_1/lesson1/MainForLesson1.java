package GB1_1_1.lesson1;

import GB1_1_1.lesson1.persons.Cat;
import GB1_1_1.lesson1.persons.Men;
import GB1_1_1.lesson1.persons.Robot;

public class MainForLesson1 {
    public MainForLesson1() {
        System.out.println("Begin part 1: ");
        Cat cat = new Cat("Jump", "Run");
        Men men = new Men("not Run", "Jump");
        Robot robot = new Robot("Run", "Not Jump");
        cat.jump();
        cat.run();
        men.jump();
        men.run();
        robot.jump();
        robot.run();
        System.out.println("------------The End-------------");
    }
}
