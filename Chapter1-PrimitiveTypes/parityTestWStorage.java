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
        HashMap<Short, Short> parityTable = new HashMap<Short, Short>();
    	for(int counter = 0; counter < 131071; counter++){
    		parityTable.put(counter, parity(counter))
	    }   
	    return parityTable; 
    }   

    public static short parityWithTable(long x){
    HashMap<Short, Short> parityTable = fillParity();
    final int bitMaskTo16 = 0XFFFF;
    //assume that value goes up to 2^64 then we need to split the number into 4 separate section
    final int first = parityTable.get((int)(x & bitMaskTo16)); 
    final int second = parityTable.get((int)((x>>>16) & bitMaskTo16));
    final int third = parityTable.get((int)(x>>>32) & bitMaskTo16));
    final int forth = parityTable.get((int)(x>>>48) & bitMaskTo16));
	return first ^ second ^ third ^ forth;
	}
  public static void main(String args[]) {



    /*Scanner user_input = new Scanner( System.in );
    

    String inputParity;
    boolean checkInput = true;
    String message = "Enter your interger check, anything else will exit: \n";
    while (checkInput){
        System.out.print(message);
        checkInput = user_input.hasNextShort();
        inputParity = user_input.next();
        if(checkInput) System.out.println("Parity value = " + parity(Short.parseShort(inputParity)));
        
    }
   }*/
   
}