package epam;

public class SwitchCaseFeature {
    private static void print(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("integer : "+i.doubleValue());
            case String s -> System.out.println("string : "+s.length());
            case Double d -> System.out.println("double : "+d * d);
            default -> System.out.println("no match");
        }
    }

    public static void main(String[] args) {
        Integer i = 2;
        print(i);
        String s = "uma";
        print(s);
        Double d = 3.0;
        print(d);
        Float f = 2.0F;
        print(f);
    }
}
