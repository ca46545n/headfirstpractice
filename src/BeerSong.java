import java.net.StandardSocketOptions;

public class BeerSong {

    public static void main(String[] args) {

        int beerno=99;
        String name="bottles";
        while(beerno>1){
            System.out.println();
            System.out.print(beerno + " " + name + " " + "of bear on the wall,");
            System.out.println(beerno + "" + name + " " +"of bear" );
            System.out.print("take one down,pass it around,");
            beerno--;
            if(beerno>1)
                System.out.println(beerno + " " + name + " " + "of bear on the wall");
            else
            {
                name = "bottle";
                System.out.println( beerno + " " + name + " " + "of bear on the wall");
            }
        }
        System.out.print(beerno + " " + name + " " + "of bear on the wall,");
        System.out.println(beerno + " " + name + " " + "of bear" );
        System.out.println("take one down,pass it around,");
        System.out.print("no more bottles of bear on the wall");
    }
}


