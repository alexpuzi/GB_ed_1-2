package GB1_1_1.lesson1;

public class Men {
    String run;
    String jump;
    public static int height;
    public static int weight;

    public Men(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Men(String run, String jump) {
        this.run = run;
        this.jump = jump;
    }

    public void jump() {
        System.out.println("Men " + jump);
    }

    public void run() {
        System.out.println("Men " + run);
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
