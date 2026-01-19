package stringBasedQuestions;

public class NCExpandOnlyAlphabetsFromString {
    public static void main(String[] args) {
        String str = "a2b3cd5ghf87CD1F";
        String alphabetsString = extractAlbhabetsFromString(str);
        System.out.println(alphabetsString);
    }

    private static String extractAlbhabetsFromString(String str) {
        StringBuilder alphabets = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char charValue = str.charAt(i);
            if(charValue >= 'a' && charValue <= 'z' || charValue >= 'A' && charValue <= 'Z') {
                alphabets.append(charValue);
            }
        }

        return alphabets.toString();
    }
}
