
import java.util.*;

public class Voting {

    private final int[] votes;
    private final Random random;

    public Voting() {
        this.random = new Random();
        this.votes = new int[5];
    }

    public int length() {
        return random.nextInt(60) + 60;
    }

    public int[] votes() {
        for (int i = 0; i < this.votes.length; i++) {
            this.votes[i] = random.nextInt(10) + 10;
        }
        return this.votes;
    }

    public String votesToString(int[] votes) {
        String s = "[";
        int i = 0;
        s += votes[i];
        i++;
        while(i < votes.length){
            s += ", ";
            s += votes[i];
            i++;
                   
        }
        s += " ]";
        return s;
    }

}
