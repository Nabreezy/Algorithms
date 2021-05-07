package Problems.HackerRank;

public class RepeatingAInString {

    public long repeatedString(String s, long n){

        long numberOfA = 0;

        if (s.equals("a")){
            System.out.println("returning a");
            return n;
        }

        //Calculates the number of a's in the string
        for(int i = 0 ; i<s.length();i++){

            if(s.charAt(i)=='a'){
                numberOfA++;
            }
        }

        // stores how many time a string goes into n
        long store = (n/s.length());
        numberOfA = store * numberOfA;

        // if there is any remainder letters
        int remainder = (int) (n%s.length());

        // How many a's are there is the remainder letters
        for(int i = 0;i<remainder;i++){
            if(s.charAt(i)=='a'){
                numberOfA++;
            }
        }

        return numberOfA;

    }
}
