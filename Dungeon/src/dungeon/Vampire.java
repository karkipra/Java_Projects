package dungeon;

import java.util.*;

public class Vampire implements Character {

    private int x;
    private int y;
    private int fullX;
    private int fullY;
    private boolean alive;
    private List<Integer> pos;

    public Vampire(int fullX, int fullY) {
        this.x = new Random().nextInt(fullX);
        this.y = new Random().nextInt(fullY);
        this.fullX = fullX;
        this.fullY = fullY;
        this.alive = true;
        this.pos = new ArrayList();
        this.pos.add(x);
        this.pos.add(y);
    }

    @Override
    public String getName() {
        return "v";
    }

    @Override
    public int locationX() {
        this.x = new Random().nextInt(fullX);
        return this.x;
    }

    @Override
    public int locationY() {
        this.y = new Random().nextInt(fullY);
        return this.y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }

    @Override
    public boolean isAlive() {
        return this.alive;
    }

    @Override
    public void kill() {
        this.alive = false;
    }

    public void changeLoc() {
        locationX();
        locationY();
    }

    @Override
    public String toString() {

        return getName() + " " + this.x + " " + this.y;
    }

}
