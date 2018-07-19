package dungeon;


public interface Character {
    String getName();
    int locationX();
    int locationY();
    boolean isAlive();
    void kill();
}
