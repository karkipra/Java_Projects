
import java.util.*;

public class UserInterface {

    private final Reader reader;
    private final Tournament tourney;
    private int round;

    public UserInterface() {
        this.reader = new Reader();
        this.tourney = new Tournament();
        this.round = 1;
    }
    
    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        names();
        tournament();
        results();
    }
    
    public void names() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.getString();
            if (name.isEmpty()) {
                break;
            }
            this.tourney.add(new Jumper(name));
        }
    }
    
    public void tournament() {
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String s = reader.getString();
            if (!(s.equals("jump"))) {
                break;
            }
            System.out.println("");
            round();
        }
        System.out.println("");
        System.out.println("Thanks!");
        
    }
    
    public void round() {
        System.out.println("Round " + this.round);
        System.out.println("");
        Voting voting = new Voting();
        List<Jumper> list = this.tourney.getList();

        
        System.out.println("Jumping order:");
        Collections.sort(list);
        Collections.reverse(list);
        int i = 1;
        for (Jumper j : list) {
            System.out.println("  " + i + ". " + j);
            i++;
        }
        System.out.println("");
        
        System.out.println("Results of round " + this.round);
        for (Jumper j : list) {
            int[] votesForRound = voting.votes();
            int len = voting.length();
            //j.addJump(len);
            System.out.println("  " + j.getName());
            System.out.println("    length: " + len);
            System.out.println("    judge votes: " + voting.votesToString(votesForRound));
            j.addPoints(j.calculatePoints(votesForRound, len));
        }
        System.out.println("");
        this.round++;
        
    }
    
    public void results() {
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        List<Jumper> list = this.tourney.getList();
        Collections.sort(list);
        int i = 1;
        for (Jumper j : list) {
            System.out.println(i + "           " + j.toString());
            System.out.println("            " + j.jumpLengths());
            i++;
        }
        
    }
}
