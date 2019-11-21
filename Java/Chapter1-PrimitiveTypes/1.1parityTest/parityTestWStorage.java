import java.util.*;  

public class parityTestWStorage {

    //constructor
	public parityTestWStorage(){
        for(int counter = 0; counter < 131071; counter++){
            this.parityTable.put(counter, parity(counter));
        }     
	}	


  private HashMap<Integer, Integer> parityTable = new HashMap<Integer, Integer>();
    public static int parity(long x){
        int result = 0;
        while ( x !=0){
            result ^= 1;
            x &=(x-1);
        }
        return result;
    }

    private void printMsg (){
	    System.out.println(parityWithTable(12)); 	
    }


    public int parityWithTable(long x){
    long bitMaskTo16 = 0XFFFF;
    // //assume that value goes up to 2^64 then we need to split the number into 4 separate section	
    int first = parityTable.get((int)(x & bitMaskTo16));
    int second = parityTable.get((int)((x>>>16) & bitMaskTo16));
    int third = parityTable.get((int)((x>>>32) & bitMaskTo16));
    int forth = parityTable.get((int)((x>>>48) & bitMaskTo16));
	return first ^ second ^ third ^ forth;
	}

  public static void main(String args[]) {
    parityTestWStorage parity = new parityTestWStorage();
    parity.printMsg();    
		   

   }
   
}