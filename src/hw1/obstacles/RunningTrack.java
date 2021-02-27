package hw1.obstacles;

import hw1.abilities.Able;
import hw1.abilities.CapableOfRunning;

public class RunningTrack implements Obstacle {

    private int distance;
    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean createObstacle(Able a) {
        if(!(a instanceof CapableOfRunning)) {
            return false;
        } else {
            return ((CapableOfRunning)a).run(distance);
            }
        }

        @Override
    public String toString() {
        return "\n************************\n"
                + "RunningTrack of "+distance+" meters" +
                    " \n************************";
    }
}


