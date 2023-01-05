public class Player extends Char{
    protected String Pname;
    public Player(String pname,int health1) {
        super(health1);
        Pname=pname;

    }
    public void display(){
        if(super.health<=0){
            System.out.println("You Are Dead!");
        }
        else {
            System.out.print(Pname + " health is ");
            super.disp();
        }
    }
    public void gameend(){
        if(super.health<=0){
            System.out.println(Pname + " was dead");
        }
        else {
            System.out.print(Pname + " won at ");
            super.disp();
        }
    }


}