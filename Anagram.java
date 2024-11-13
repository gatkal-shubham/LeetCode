import java.util.*;
public class Anagram {
    public static boolean bruteForce(String s1, String s2) {
        char[] s1arr=s1.toCharArray();
        char[] s2arr=s2.toCharArray();

        Arrays.sort(s1arr);
        Arrays.sort(s2arr);

        if(Arrays.equals(s1arr,s2arr))
            return true;
        else
            return false;
    }
    public static boolean betterApproach(String s1, String s2) {
        int[] arr=new int[255];
        if(s1.length() !=s2.length())
            return false;
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;

        }
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)]--;

        }
        for(int i=0;i<s2.length();i++){
            if(arr[s1.charAt(i)] !=0){
                return false;
            }
        }
        return true;

        // Your code here
    }
    public static boolean optimal(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : s2.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()!=0)
                return false;
        }
        return true;
        // Your code here
    }

    public static void main(String[] args) {
        String s1 = "geeks", s2 = "kseeg";
        System.out.println(bruteForce(s1,s2));
        System.out.println(betterApproach(s1,s2));
        System.out.println(optimal(s1,s2));
    }
}
