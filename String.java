package prg6;
import java.util.Arrays;

public class Lib {

    public static final String extract(String str,int m,int n){
        return str.substring(n,n+m);
    }

    public static int countAWord(String str, String word){

        String[] allWords = str.split(" ");
        int count = 0;
        for (String x: allWords){
            if (x.equals(word))
                count++;
        }
        return count;
    }

    public static String reArrange(String str){

        char[] strChars = str.toCharArray();
        Arrays.sort(strChars); //Arrays is a utility class in java
        return new String(strChars);
    }
}







package prg6;

public class StringManipulation {

    public static void main(String[] args) {
        String str = "Hello world";
        String str2 = "my house, my car, my degree, my job, my money, my spouse, my children, my family, my death, my funeral";
        System.out.println(Lib.extract(str,4,6));
        System.out.println(Lib.countAWord(str2,"my"));
        str2 = str2.replace("my", "our");  
        System.out.println(str2);
        System.out.println(Lib.reArrange("OOPSwithJava"));
        String str3 = "hello";
        String str4 = "HeLLo";
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println(str.concat(str3));

    }


}
