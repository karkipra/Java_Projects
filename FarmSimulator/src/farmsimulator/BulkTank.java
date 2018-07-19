package farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;
    public BulkTank(){
        this(2000);
    }

    public BulkTank(double capacity){
        this.capacity = capacity;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getVolume(){
        return this.volume;
    }

    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount){
        if(amount + this.volume <= capacity){
            this.volume += amount;
        } else {
            volume = this.capacity;
        }
    }
    
    public double getFromTank(double amount){
        if(amount <= this.volume){
            volume -= amount;
            return amount;
        } else {
            volume = 0;
            return this.volume;
        }
    }
    
    @Override
    public String toString(){
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
