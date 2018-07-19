import java.util.*;
public class Reader {
    private final Scanner scanner;
    public Reader(){
        this.scanner = new Scanner(System.in);
    }
    public int getInt(){
        return Integer.parseInt(scanner.nextLine());
    }
    public String getString(){
        return scanner.nextLine();
    }
}
