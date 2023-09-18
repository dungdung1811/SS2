package ra.bt3;

public class Main {
    public static void main(String[] args) {
       int coutn  = 0;
       int i =0;
      while( coutn < 20){
         if(checkPrimer(i)){
             coutn++;
             System.out.println(i);
         }
        i++;
      }
    }
    public static boolean checkPrimer(int number){
        if(number == 0){
            return false;
        }
        if(number == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number) ; i++){
            if (number%i == 0 ){
                return  false;
            }
        }
        return  true;
    }
}
