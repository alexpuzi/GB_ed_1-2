package GB1_1_1.lesson1.for_part_3;

import static GB1_1_1.lesson1.persons.Men.height;

public class Track implements Obstacle {
    private final int lenght;

    public Track(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.run() > lenght) {
            System.out.println("EУчастник " + participant + " успешно перепрыгнул стену");
            return true;
        } else {
            System.out.println("Участник " + participant + "не смог перепрыгнуть стену " + height);
            return false;
        }
    }
}
