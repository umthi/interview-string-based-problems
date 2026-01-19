package stringBasedQuestions;

public class RemoveJunkCharactersFromString {
    public static void main(String[] args) {
        String str = "uma !@#$%^&*(()maheswari &%!789";
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(str);
    }

}
