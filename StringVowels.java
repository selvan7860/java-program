public class StringVowels {

    public static void main(String[] args){
        System.out.println(StringContainsVowels("12345678e"));
        System.out.println(StringContainsVowels("New"));
    }

    public static boolean StringContainsVowels(String input){

        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
