package stringBasedQuestions;

public class NCExpandOnlyDigitsFromString {
    public static void main(String[] args) {
        String str = "a2b3cd5ghf87CD1F";
        StringBuilder onlyDigits = extractOnlyDigitsFromString(str);
        System.out.println(onlyDigits);
    }

    private static StringBuilder extractOnlyDigitsFromString(String str) {
        StringBuilder onlyDigits = new StringBuilder();
        for(int i=0; i < str.length(); i++) {
            char charValue = str.charAt(i);
            if(charValue >= '0' && charValue <= '9') {
                onlyDigits.append(charValue);
            }
        }
        return onlyDigits;
    }
}
