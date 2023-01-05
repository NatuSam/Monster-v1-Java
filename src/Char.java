import java.util.Random;
public abstract class Char {
    protected int health;
    public Char(int h){
        health=h;
    }

    public int rcheck(){
        Random rand = new Random();
        int r = rand.nextInt(100);
        if(r <=18){ r=6;}
        else if(18<r && r <=32){  r=5;}
        else if(32<r && r <=45){ r=4;}
        else if(45<r && r <=58){ r=3;}
        else if(58<r && r <=71){r=2;}
        else if(71<r && r <=85){ r=1;}
        else if(85<r && r <=100){r=0;}
        return r;
    }
    public abstract void display();
    public void disp(){
        System.out.println(health);
    }
}
