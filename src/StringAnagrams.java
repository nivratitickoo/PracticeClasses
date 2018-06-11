/**
 * Created QXO4360 on 4/11/2018.
 */
public class StringAnagrams {

    public static void main(String arg[]){

        System.out.println("---------Check Anagrams--------------");
        Boolean anagramFlag1 = isAnagram("abcd","cdab");
        Boolean anagramFlag2 = isAnagram("aabfffre","afafbfer");

        System.out.println("The scenario that passed for me - Is Anagram : "+anagramFlag1);
        //can you check and tell me what went wrong in this test case that it returned false and not true:
        System.out.println("The scenario that failed for me - Is Anagram : "+anagramFlag2);


    }

    public static boolean isAnagram(String str1, String str2){

        int[] array = new int[128];
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        for(int i=0;i<chars1.length;i++){
            int val = chars1[i];
            array[val]++;
        }

        for(int j=0;j<chars2.length;j++){

            int val = chars2[j];
            array[val]--;


            //Make sure it checks for -ve values(there shd be no +ve no -ve values but check against -ve values)
            if(array[val]<0){
                return false;
            }
        }

        return true;
    }
}
