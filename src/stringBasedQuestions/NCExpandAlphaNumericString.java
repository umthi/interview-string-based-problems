package stringBasedQuestions;

public class NCExpandAlphaNumericString {
    public static void main(String[] args) {
        String str = "z4a2cd5f";
        String expandedString = expandAlphaNumericString(str);
        System.out.println(expandedString);
    }

    private static String expandAlphaNumericString(String str) {
        char[] charArr = new char[100];
        int resultIndex = 0;
        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(currentChar >= 'A' && currentChar <= 'Z' ||
                    currentChar >= 'a' && currentChar <= 'z') {
                if(i+1 < str.length() && str.charAt(i+1) >= '0' && str.charAt(i+1) <= '9') {
                    int repeatCount = str.charAt(i+1) - '0';
                    for(int j = 0; j < repeatCount; j++)
                    {
                        charArr[resultIndex++] = currentChar;
                    }
                }
                else {
                    charArr[resultIndex++] = currentChar;
                }
            }
        }

        return new String(charArr, 0, resultIndex);
    }
}
