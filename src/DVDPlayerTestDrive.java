public class DVDPlayerTestDrive {

    public static void main(String[] args){
        DVDPlayer d = new DVDPlayer();
        d.canrecord = true ;
        d.playDVD();


        if (d.canrecord == true){
            d.recordDVD();
        }


    }
}
