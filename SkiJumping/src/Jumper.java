
import java.util.*;

public class Jumper implements Comparable<Jumper> {

    private final String name;
    private int points;
    private final List<Integer> jumpLengths;

    public Jumper(String name) {
        this.name = name;
        this.points = 0;
        this.jumpLengths = new ArrayList<Integer>();
    }

    public void addPoints(int point) {
        this.points += point;
    }

    public int calculatePoints(int[] votes, int length) {
        int min = votes[0];
        int max = votes[0];
        int sum = votes[0];
        for (int i = 1; i < votes.length; i++) {
            if (votes[i] < min) {
                min = votes[i];
            } else if (votes[i] > max) {
                max = votes[i];
            }
            sum += votes[i];
        }
        this.addJump(length);
        return sum - max - min + length;
    }

    public int getPoints() {
        return this.points;
    }

    public String getName() {
        return this.name;
    }

    public void addJump(int len) {
        this.jumpLengths.add(len);
    }

    public String jumpLengths() {
        String s = "jump lengths: ";
        if (this.jumpLengths.isEmpty()) {
            return s;
        }
        s += this.jumpLengths.get(0) + " m";
        int i = 1;
        while (i < this.jumpLengths.size()) {
            s += ", " + this.jumpLengths.get(i) + " m";
            i++;
        }

        return s;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }

    @Override
    public int compareTo(Jumper jumper) {
        if (this.points == jumper.getPoints()) {
            return 0;
        } else if (this.points < jumper.points) {
            return 1;
        } else {
            return -1;
        }
    }

}
