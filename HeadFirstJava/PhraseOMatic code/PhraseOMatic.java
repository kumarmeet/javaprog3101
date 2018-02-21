class PhraseOMatic{
    public static void main(String []args){
        
        String [] wordListOne={"Morning","M.Sc in CS","160695","January","Computer","Mastek","Java","C++","HTML5","371/550"};
        String [] wordListTwo={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        String [] wordListThree={"J1","F2","M3","A4","M5","J6","J7","A8","S9","O10","N11","D12"};

        //find out how many words are in each
        System.out.println("find out how many words are in each");
        int oneLength=wordListOne.length;
        System.out.println(oneLength);
        int twoLength=wordListTwo.length;
        System.out.println(twoLength);
        int threeLength=wordListThree.length;
        System.out.println(threeLength);

        //generate three random numbers
        System.out.println("generate three random numbers");
        int rand1=(int) (Math.random()*oneLength);
        System.out.println(rand1);
        int rand2=(int) (Math.random()*twoLength);
        System.out.println(rand2);
        int rand3=(int) (Math.random()*threeLength);
        System.out.println(rand3);

        //now build a phrase
        String phrase=wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //print out the phrase
        System.out.println(phrase);
    }
}