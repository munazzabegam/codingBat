public class warmup{
    public static void main (String[] args){
        //sumDouuble
        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(2,2));

        //diff21
        System.out.println(diff21(30));

        //parrotTrouble
        System.out.println(parrotTrouble(true,6));
        System.out.println(parrotTrouble(false,6));


    }

    //sumDouble
    public static int sumDouble(int a,int b){
        int sum = a+b;
        if(a==b){
            return sum*2;
        }else{
            return sum;
        }
    }

    //diff21
    public static int diff21(int n){
        int diff = 21-n;
        if(n > 21){
            return (-diff)*2;
        }else{
            return diff;
        }
    }

    //parrotTrouble
    public static boolean parrotTrouble(boolean talking, int  hour){
        return talking && (hour<7 || hour>20);
    }
}