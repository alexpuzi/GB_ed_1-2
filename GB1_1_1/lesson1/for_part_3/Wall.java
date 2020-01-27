package GB1_1_1.lesson1.for_part_3;

public class Wall implements Obstacle {
    public final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.jump() > height) {
            System.out.println("Участник " + participant + " успешно прыгнул на");
            return true;
        } else {
            System.out.println("Участник " + participant + "Не смог прыг-скок");
            return false;
        }
    }
}
