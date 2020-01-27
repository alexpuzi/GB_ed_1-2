package GB1_1_1.lesson1.for_part_3;

public class Person implements Participant {
    private final String name;
    private final int jumpHeight;
    private final int maxRunLendht;

    public Person(String name, int jumpHeight, int maxRunLendht) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxRunLendht = maxRunLendht;
    }

    @Override
    public int run() {
        return maxRunLendht;
    }

    @Override
    public int jump() {
        return jumpHeight;
    }
    public String toString(){
        return "Person{ " + "name" + '\'' + ", jumpHeight=" + jumpHeight + ", maxRunLenght=" + maxRunLendht + '}';
    }
}
