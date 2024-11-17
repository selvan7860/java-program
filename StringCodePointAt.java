public class StringCodePointAt{
    public static void main(String[] args) {
        CodePointAt();
        CodePointBefore();
    }

    public static void CodePointAt(){
        String str = "Hello";
        int result = str.codePointAt(0);
        System.out.println(result);
    }

    public static void CodePointBefore(){
        String str = "Hello";
        int result = str.codePointBefore(2);
        System.out.println(result);
    }
}