package GB1_1_1.lesson1;

public class Cat {
    String run;
    String jump;
    int height;
    int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Cat(String jump, String run) {
        this.jump = jump;
        this.run = run;
    }

    public void run() {
        System.out.println("Cat " + run);
    }

    public void jump() {
        System.out.println("Cat " + jump);
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
