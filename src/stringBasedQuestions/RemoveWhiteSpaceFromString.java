package stringBasedQuestions;

public class RemoveWhiteSpaceFromString {
    public static void main(String[] args) {
        String str = "uma maheswari krishnan";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
