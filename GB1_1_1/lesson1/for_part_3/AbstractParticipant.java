package GB1_1_1.lesson1.for_part_3;

public class AbstractParticipant implements Participant {
    protected final String name;
    protected final int jumpHeight;
    protected final int maxRunLenght;

    public AbstractParticipant(String name, int jumpHeight, int maxRunLenght) {
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
}
