package GB1_1_1.lesson1.for_part_3;

import javax.swing.text.StringContent;

public class Robot implements Participant {
    private final String name;
    private final int jumpHeight;
    private final int maxRunLenght;

    public Robot(String name, int jumpHeight, int maxRunLenght) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxRunLenght = maxRunLenght;
    }

    @Override
    public int run() {
        return maxRunLenght;
    }

    @Override
    public int jump() {
        return jumpHeight;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name=' " + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", maxRunLenght=" + maxRunLenght +
                '}';
    }
}
