import java.util.*;

class StringProcessor {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        for (char c : p.toCharArray()) pCount[c - 'a']++;
        
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }
            
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }
        
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        System.out.println(processor.findAnagrams("cbaebabacd", "abc"));
    }
}
