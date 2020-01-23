package GB1_1_1.lesson1;

public class Robot {
    String run;
    String jump;
    int height;
    int weight;

    public Robot(String run, String jump) {
        this.jump = run;
        this.run = run;
    }

    public Robot(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void run() {
        System.out.println("Robot " + run);
    }

    public void jump() {
        System.out.println("Robot " + jump);
    }

    public int jump1() {
        return height;
    }

    public int run1() {
        return weight;
    }

    public String run2() {
        return run;
    }

    public String jump2() {
        return jump;
    }
}
