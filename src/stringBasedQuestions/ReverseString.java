package stringBasedQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "umamaheswari";
        String revereStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
           revereStr = revereStr + str.charAt(i);
        }
        System.out.println(revereStr);
        otherWaysOfReverseString(str);
    }

    private static void otherWaysOfReverseString(String str) {
        char[] charArr = str.toCharArray();
        String rev = "";
        for(int i = charArr.length-1; i >= 0; i--) {
            rev = rev + charArr[i];
        }
        System.out.println(rev);

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
