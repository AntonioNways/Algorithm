public class bitSwap {


    // public bitSwaping (long x, int i, int j){
	//     return 0; 	
    // }

    private static long printMsg (long x, int i, int j){	
        if(((x>>i)&1) != ((x>>j)&1)){
            x = x^(1<<i)^(1<<j);
        }
        return x;
    }



  public static void main(String args[]) { 

    System.out.println(printMsg(10, 0, 1));   
		   

   }
   
}