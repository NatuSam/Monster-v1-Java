public class Monst extends Char{
    public Monst(int health1) {
        super(health1);
    }
    public void display(){
        if(super.health<=0){
            System.out.println("You Have Killed The Monster!");
        }
        else {
            System.out.print("Monster health is ");
            super.disp();
        }
    }

}
