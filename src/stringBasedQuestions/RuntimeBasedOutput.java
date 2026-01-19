package stringBasedQuestions;

import java.util.Scanner;

public class RuntimeBasedOutput {
    public static void main(String[] args) {
        String input = "name=\"Uma\",company=\"Accenture\",experience=\"9years\"";
        System.out.println("enter the input");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        String[] firstSplit = input.split(",");
        for(String firstSplitValue : firstSplit) {
            String[] secondSplit = firstSplitValue.split("=");
                if(userInput.equalsIgnoreCase(secondSplit[0])) {
                    System.out.println(secondSplit[1]);
                }

        }

    }
}
