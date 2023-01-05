import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        ArrayList<Player> Rec= new ArrayList<Player>();
        int ch=0;
        while (ch!=3){
        System.out.println("\nMenu\n1.Game\n2.Record\n3.Exit");
        ch=s.nextInt();
        switch (ch) {
            case 1:
                String a;
                String name;
                int h = 100, x;
                System.out.println("Enter your name");
                name = s.next();
                Player P1 = new Player(name, h);
                Monst M1 = new Monst(h);
                while (M1.health >= 1 && P1.health >= 1) {
                    System.out.println("Enter atk to attack");
                    a = s.next();
                    if (Objects.equals(a, "atk")) {
                        x = P1.rcheck();
                        M1.health = M1.health - x;
                    }
                    else if (Objects.equals(a, "bomb")) {
                        M1.health = M1.health - 90;
                    }
                    else if (Objects.equals(a, "suic")) {
                        P1.health = P1.health - 90;
                    }
                    x = M1.rcheck();
                    P1.health = P1.health - x;
                    P1.display();
                    M1.display();

                }
                Rec.add(P1);
                break;
            case 2:
                for (int i = 0; i < Rec.size(); i++) {
                    Rec.get(i).gameend();
                }
                break;
            case 3:
                System.out.println("Good Bye!");
                break;
            default:
                System.out.println("Wrong input");
                break;


    }

    }



    }
}

