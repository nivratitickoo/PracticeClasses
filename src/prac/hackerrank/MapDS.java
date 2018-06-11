package prac.hackerrank;

import java.util.*;

/**
 * Created QXO4360 on 5/15/2018.
 */
public class MapDS {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<String,Integer> phoneMap = new HashMap<String,Integer>();
        for(int i = 1;i<=n;i++){
            String name = scan.next();
            int phoneNum = scan.nextInt();
            if(!phoneMap.containsKey(name)){
                phoneMap.put(name,phoneNum);
            }
        }

        //accepted but it has endless loop
        while(scan.hasNext()){
            String query = scan.next();
            if(phoneMap.get(query)!= null) {
                System.out.println(query + "=" + phoneMap.get(query));
            }
            else
                System.out.println("Not found");
        }



    }
}
