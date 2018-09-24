import java.util.*;  

public class parityTestWStorage {

    public static short parity(long x){
        short result = 0;
        while ( x !=0){
            result ^= 1;
            x &=(x-1);
        }
        return result;
    }

    public static short fillParity(long args[]){
        HashMap<Short, Short> tableMap = new HashMap<Short, Short>();
    	for(int counter = 0; counter < 131071; counter++){
    		tableMap.put(counter, parity(counter))
	    }    
    }   

  public static void main(String args[]) {
    Scanner user_input = new Scanner( System.in );
    

    String inputParity;
    boolean checkInput = true;
    String message = "Enter your interger check, anything else will exit: \n";
    while (checkInput){
        System.out.print(message);
        checkInput = user_input.hasNextShort();
        inputParity = user_input.next();
        if(checkInput) System.out.println("Parity value = " + parity(Short.parseShort(inputParity)));
        
    }
   }
   
}