class StringProcessor {

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public String splitAndCapitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
        }
        return result.toString().trim();
    }

}

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();

        System.out.println(processor.reverseString("Hello"));
        System.out.println(processor.countOccurrences("Hello world, Hello universe", "Hello"));
        System.out.println(processor.splitAndCapitalize("hello world from java"));
    }
}
