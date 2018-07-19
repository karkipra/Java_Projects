package farmsimulator;
import java.util.*;

public class Barn {
    
    private final BulkTank tank;
    private MilkingRobot robo;
    
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank() {
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robo = milkingRobot;
        this.robo.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow) throws IllegalStateException{
        if(this.robo == null){
            throw new IllegalStateException("Can't find a milking robot!");
        }
        this.robo.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException{
        if(this.robo == null){
            throw new IllegalStateException("Can't find a milking robot!");
        }
        for(Cow c: cows){
            this.robo.milk(c);
        }
    }
    
    @Override
    public String toString(){
        return this.tank.toString();
    }
}
