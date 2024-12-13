import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FUniqchar {


    public static void main(String[] args) {

        String s = "abcdebcfde";

        System.out.println(FirstUniqueCharacter(s));
    }

    public static int FirstUniqueCharacter(String s){


        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),1);
            }
            else
            {
                map.put(s.charAt(i), map.get(s.charAt(i) )+1);
            }
        }
        System.out.println(map);

        // now check how many elements appear only once in the string.
        // we can do this by traversing the hashmap and adding those number in array who appear only once in the string


        for(int i = 0; i<s.length();i++){

            if(map.get(s.charAt(i)) ==1){
                return i;
            }
        }
        return -1;

    }

}








