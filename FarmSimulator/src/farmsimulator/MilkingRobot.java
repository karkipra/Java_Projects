
package farmsimulator;

public class MilkingRobot {
    
    private BulkTank tank;
    
    public MilkingRobot() {
        
    }
    
    public BulkTank getBulkTank(){// throws NullPointerException{

        return this.tank;
    }
    
    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) throws IllegalStateException{
        double m = milkable.milk();
        if(this.tank == null){
            throw new IllegalStateException("No tank has been installed!");
        }
        this.tank.addToTank(m);
    }
}
