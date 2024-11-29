package SplitString;


import java.util.HashSet;

public class SplitString {


    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String myString = "abad";
        char[] chars = myString.toCharArray();
        for (char c : chars){
            set.add(c);
        }
        System.out.println(set.size());
    }
}
