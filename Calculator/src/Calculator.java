

public class Calculator {
    private int val;
    
    public Calculator(int val){
        this.val = val;
    }
    
    public int getVal(){
        return this.val;
    }
    
    public void add(int other){
        this.val += other;
        
    }
    
    public void subtract(int other){
        this.val -= other;
    }
    
    public void reset(){
        this.val = 0;
    }
}
