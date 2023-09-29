package BoksOyunu;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int firstKick;


    Fighter(String name,int damage,int health,int weight,int dodge,int firstKick){
        this.damage=damage;
        this.name=name;
        this.health=health;
        this.weight=weight;
        if (dodge>=0&&dodge<=100){
            this.dodge=dodge;
        }else this.dodge=0;
        this.firstKick=firstKick;

    }
    int hit(Fighter rakip){
        if (rakip.isDodge()){
            System.out.println(rakip.name+" gelen hasarı blokladı.");
            System.out.println("=================");
            return rakip.health;
        }
        System.out.println(this.name + " => "+ rakip.name+ " "+this.damage+" hasar vurdu");
        return rakip.health-this.damage;
    }
    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.dodge;
    }
    boolean isFirstKick(){
        double randomKickNumber=Math.random()*100;
        return randomKickNumber>=this.firstKick;
    }
}
