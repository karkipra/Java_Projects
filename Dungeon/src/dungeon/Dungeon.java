/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.*;

public class Dungeon {

    private final int length;
    private final int height;
    private final int vampires;
    private int moves;
    private final boolean vampiresMove;
    private final Map<Vampire, List<Integer>> vamps;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.height = height;
        this.length = length;
        this.moves = moves;
        this.vampires = vampires;
        this.vampiresMove = vampiresMove;
        this.vamps = new HashMap<Vampire, List<Integer>>();
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player(this.length, this.height);
        for (int i = 0; i < this.vampires; i++) {
            this.vamps.put(new Vampire(this.length, this.height), new ArrayList<>);
        }

        while (true) {

            // ========== character info ============
            System.out.println(moves);
            System.out.println("");

            System.out.println(player);
            for (Vampire v : this.vamps) {
                v.changeLoc();
                System.out.println(v);
            }
            System.out.println("");

            //=========== printing out the tiles ============
            for (int i = 0; i < this.length; i++) {
                for (int j = 0; j < this.height; j++) {


                    if (player.locationX() == i && player.locationY() == j) {
                        System.out.print(player.getName());
                    } else {
                        
                        
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            System.out.println("");

            //============= scanner ===================
            if (this.moves == 0) {
                System.out.println("YOU LOSE");
                break;
            }

            String s = scanner.nextLine();
            if (s.equals("quit")) {
                break;
            }

            player.changeLoc(s);

            this.moves--;

        }

    }

}
