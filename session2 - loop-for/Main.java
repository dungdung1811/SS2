public class Main {
    public static void main(String[] args) {
        int coutn = 1;
        for (int i = 1; i < 100; i++){
            if(checkPrimer(i)){
                System.out.println( coutn++ + "|||||||" + i );

            }
        }

    };
        public static boolean checkPrimer(int number){
            if(number == 0){
                return false;
            }
            if(number == 1){
                return false;
            }
            for(int i = 2; i < Math.sqrt(number) ; i++){
                if (number%i == 0 ){
                return  false;
                }
            }



        return  true;
        }
}
