import java.util.Scanner;

public class parityTest {

    public static short parity(long x){
    	short result = 0;
    	while ( x !=0){
    		result ^= (x & 1);
    		x >>>= 1;
    	}
    	return result;
    }	

  public static void main(String args[]) {
	Scanner user_input = new Scanner( System.in );

	short inputParity;

    System.out.print("Enter your interger check:");
    inputParity = user_input.nextShort();
    System.out.print(parity(inputParity));
		 
   }
   
}