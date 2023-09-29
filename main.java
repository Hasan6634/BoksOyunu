package BoksOyunu;

import BoksOyunu.Fighter;

public class main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike Tayson", 10, 100, 100, 50, 50);
        Fighter f2 = new Fighter("Muhammet Ali",20, 110, 120, 20, 100);

        Match match=new Match(f1,f2,90,130);
        match.run();
    }
}
