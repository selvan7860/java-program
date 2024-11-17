public class StringSplit {
    public static void main(String[] args) {
        String myString = "Split a string by spaces, and also punctuation.";
        String regax = "[,\\.\\s]";
        String[] myArray = myString.split(regax);
        for(String s: myArray){
            System.out.println(s);
        }
    }
}
