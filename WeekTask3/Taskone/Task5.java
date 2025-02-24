package Task1;

public class StringModifier {
    public static void modifyString(String input) {
        char[] textArray = input.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            if (i % 2 == 0) {
                textArray[i] = Character.toUpperCase(textArray[i]);
            }
        }
        System.out.println("Input: " + input);
        System.out.println("Output: " + new String(textArray));
    }
}
