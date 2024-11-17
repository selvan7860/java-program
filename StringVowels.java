public class StringVowels {

    public static void main(String[] args){
        System.out.println(StringContainsVowels("Hello"));
        System.out.println(StringContainsVowels("New"));
    }

    public static boolean StringContainsVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
