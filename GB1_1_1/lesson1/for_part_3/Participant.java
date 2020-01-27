package GB1_1_1.lesson1.for_part_3;

public interface Participant {
    int run();

    int jump();

    default boolean doAction(Obstacle obstacle) {
        return obstacle.passObstacleBy(this);
    }
}
