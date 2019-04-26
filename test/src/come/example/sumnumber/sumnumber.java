package come.example.sumnumber;

/**
 * Computes and returns the sum of all integers between two
 * integers specified by lowerLimit and upperLimit parameters.
 *
 * The lowerLimit parameter must be less than or equal to the
 * upperLimit parameter. If the sum of all integers between the
 * lowerLimit and the upperLimit exceeds the range of the int data
 * type then result is not defined.
 *
 * @param /lowerLimit The lower limit of the integer range
 * @param /upperLimit The upper limit of the integer range
 * @return The sum of all integers between lowerLimit (inclusive)
 *         and upperLimit (inclusive)
 */


public class sumnumber {

    public static int getRangeSum(int lowerLimit , int upperLimit ){
        int sum = 0;
        int counter = lowerLimit;
        while( counter <= upperLimit){
 sum = sum + counter;
 counter = counter +1;


        }
        return sum;


    }

   public static void main(String[] args){
       int s1 = getRangeSum(10,20);
       System.out.println(s1);

   }

}




