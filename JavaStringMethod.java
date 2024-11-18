public class JavaStringMethod {

    public static void main(String[] args) {
        CodePointAt();
        CodePointBefore();
        StringCompareTo();
        StringCompareToIgnore();
        StringConcat();
        StringContains();
        StringEqual();
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

    public static void StringCompareTo(){
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.compareTo(str2));
    }

    public static void StringCompareToIgnore(){
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.compareToIgnoreCase(str2));
    }

    public static void StringConcat(){
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }

    public static void StringContains(){
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.contains(str2));
    }

    public static void StringEqual(){
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
    }
}