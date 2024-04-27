public class RunningSumM1 {

     public static int[] Sum1(int[] n){
         for(int i = 1; i < n .length ; i++){
             n[i] += n[i-1]; //n[i] = n[i] + n[i-1]
         }
         return n;
     }
}