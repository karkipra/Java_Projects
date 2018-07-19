package farmsimulator;

import java.util.*;

public class Cow implements Milkable, Alive {

    private String name;
    private double capacity;
    private double amount;

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this(NAMES[new Random().nextInt(31)]);
    }

    public Cow(String name) {
        this.name = name;
        this.capacity = (double) new Random().nextInt(26) + 15;
        this.amount = 0;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }

    public double getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.amount) + "/" + this.capacity;
    }

    @Override
    public double milk() {
        double milked = this.amount;
        this.amount = 0;
        return milked;
    }

    @Override
    public void liveHour() {
        double amt = (double)(new Random().nextInt(14) + 7)/10;
        
        if(this.amount + amt <= this.capacity){
            this.amount += amt;
        } else {
            this.amount = capacity;
        }
    }
}
