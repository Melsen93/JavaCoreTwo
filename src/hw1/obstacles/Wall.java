package hw1.obstacles;

import hw1.abilities.Able;
import hw1.abilities.Jumpable;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean createObstacle(Able a) {
        if (!(a instanceof Jumpable)) {
            return false;
        } else {
            return ((Jumpable) a).jump(height);
        }
    }

        @Override
        public String toString () {
            return "\n************************\n"
                    + "Wall of " + height + " meters" +
                    "\n************************";
        }
    }
