import java.util.Scanner;

public class parityTestWStorage {

    public static short parity(long x){
    	short result = 0;
    	while ( x !=0){
    		result ^= 1;
    		x &=(x-1);
    	}
    	return result;
    }	

  public static void main(String args[]) {
	Scanner user_input = new Scanner( System.in );

	short inputParity;
	System.out.print(parity(inputParity));

	    System.out.print("Enter your interger check or type exit to leave:");
	    inputParity = user_input.next();
	    System.out.print(parity(inputParity));
   
   
}