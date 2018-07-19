import java.util.*;
public class Tournament {
    private List<Jumper> jumpers;
    
    
    public Tournament(){
        this.jumpers = new ArrayList<Jumper>();
    }
    
    public void add(Jumper jumper){
        this.jumpers.add(jumper);
    }
    
    public List<Jumper> getList(){
        return this.jumpers;
    }
}
