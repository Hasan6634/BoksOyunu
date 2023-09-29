package BoksOyunu;

import BoksOyunu.Fighter;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {

        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;


    }

    void run() {
        if (isCheck()) {

            while (f1.health > 0 && f2.health > 0) {

                System.out.println("=====YENİ RAOUND===");
                if (f1.isFirstKick()) {
                    System.out.println(f1.name + " vuruyor");
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                } else {
                    System.out.println(f2.name + " vuruyor");
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }

                }


                System.out.println(this.f1.name + " Sağlık " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık " + this.f2.health);
            }

        } else System.out.println("Sporcuların sikletleri uymuyor !");
    }

    boolean isCheck() {
        return ((f1.weight >= minWeight && f1.weight <= maxWeight) && f2.weight >= minWeight && f2.weight <= maxWeight);

    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " maçı kazandı !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " maçı kazandı");
        }
        return false;
    }

}

