public class BeerSong{
    public static void main(String []args){
        int beerNum=10;
        String word="bottles";

        while(beerNum>0){
            if(beerNum==1){
                word="bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            if(beerNum>0){
                System.out.println(beerNum + " " + word + "of beer on the wall.");
            }else{
                System.out.println("No more bottels of beer on the wall");
            }
            beerNum--;
        }
    }
}