package GB1_1_1.lesson1;

public class MainForLesson2 extends MainForLesson1 {
    public MainForLesson2() {
        System.out.println("Begin part 2: ");
        Wall wall = new Wall(31);
        Road road = new Road(123456);
        Robot robot = new Robot(55, 234);
        Cat cat = new Cat(34, 123488);
        Men men = new Men(12, 34455);
        Cat cat1 = new Cat("Jump", "Run");
        Men men1 = new Men("not Run", "Jump");
        Robot robot1 = new Robot("Run", "Jump");
        int a = road.road();
        int b = wall.wall();

        if (men.jump1() >= b) {
            men1.jump();
        } else {
            System.out.println("Men can't " + men1.jump2());
        }
        if (men.run1() >= a) {
            men1.run();
        } else {
            System.out.println("Men can't " + men1.run2());
        }
        if (cat.run1() >= a) {
            cat1.run();
        } else {
            System.out.println("Cat can't " + cat1.run2());
        }
        if (cat.jump1() >= b) {
            cat1.jump();
        } else {
            System.out.println("Cat can't " + cat1.jump2());
        }
        if (robot.run1() >= a) {
            robot1.run();
        } else {
            System.out.println("Robot can't " + robot1.run2());
        }
        if (robot.jump1() >= b) {
            robot1.jump();
        } else {
            System.out.println("Robot can't " + robot1.jump2());
        }
        System.out.println("------------The End-------------");
    }
}