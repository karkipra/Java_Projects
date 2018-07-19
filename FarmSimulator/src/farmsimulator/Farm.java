package farmsimulator;
import java.util.*;
public class Farm implements Alive{
    private final String name;
    private final Barn barn;
    private final List<Cow> cows;
    
    
    public Farm(String name, Barn barn){
        this.barn = barn;
        this.name = name;
        this.cows = new ArrayList<Cow>();
    }
    
    public String getOwner(){
        return this.name;
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    
    public void manageCows(){
        barn.takeCareOf(cows);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        barn.installMilkingRobot(robot);
    } 

    @Override
    public void liveHour() {
        for(Cow c: cows){
            c.liveHour();
        }   
    }
    
    @Override
    public String toString(){
        String s = "Farm owner: " + this.name + "\n"
                + "Barn bulk tank: " + this.barn.toString() + "\n";
        
        if(this.cows.isEmpty()){
            s += "No cows."; 
        } else {
            s += "Animals:" + "\n";
            for(Cow c: this.cows){
                s += "        " + c.toString() + "\n";
            }
        }
        return s;
    }
    
}
