package hw1;

import hw1.abilities.Able;
import hw1.entities.Cat;
import hw1.entities.Person;
import hw1.entities.Robot;
import hw1.obstacles.Obstacle;
import hw1.obstacles.RunningTrack;
import hw1.obstacles.Wall;

public class Main {

    public static void main(String[] args) {
        Able[] participants = {new Cat(), new Person(), new Robot()};
        Obstacle[] obstacles = {new Wall(2), new RunningTrack(1000),
                new Wall(3), new RunningTrack(1500), new Wall(15)};

        for (Obstacle obstacle : obstacles) {
            System.out.println(obstacle);
            for (int i = 0; i < participants.length; i++) {
                if (participants[i] != null) {
                    boolean isSuccessor = obstacle.createObstacle(participants[i]);
                    if (!isSuccessor) {
                        participants[i] = null;
                    }
                }
            }
            System.out.print("Other participants :");
            printParticipants(participants);
        }
    }

    public static void printParticipants(Able[] participants) {
        for (Able participant : participants) {
            if (participant != null) {
                System.out.print(" " + participant);
            }
        }

    }
}