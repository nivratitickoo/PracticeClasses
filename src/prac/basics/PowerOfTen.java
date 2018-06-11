package prac.basics;

/**
 * Created on 4/25/2018.
 */
public class PowerOfTen {

    public static Boolean isPowerOf10(int x){

        if(x==10||x==1){
            return true;
        }
        if(x%10 != 0 || x==0){
            return false;
        }

        return isPowerOf10(x/10);


    }

    public static void main(String[] args){

        System.out.println(isPowerOf10(1000));
        System.out.println(isPowerOf10(3));

    }

}
