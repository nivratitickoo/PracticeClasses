package prac.hackerrank;

import java.util.*;

//class vs Instance
/**
 * Created by QXO4360 on 5/2/2018.
 */
public class Person {

    int age;

    public Person(int initialAge){

        if(initialAge>0){
            age = initialAge;
        }
        else{
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void yearPasses(){
        age = age++;
    }

    public  void amIOld(){
        if(age<13){
            System.out.println("You are young.");
        }else if(age>=13 && age<18){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are old.");
        }
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        Person p = new Person(num);
        p.amIOld();
    }

}
