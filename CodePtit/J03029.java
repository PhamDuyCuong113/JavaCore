package CodePtit;

import java.util.*;

public class J03029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> lines = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            lines.add(line);
        }
        
        StringBuilder fullText = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i).trim();
            if (line.isEmpty()) continue;
            
            fullText.append(line);
            
            if (!line.endsWith(".") && !line.endsWith("!") && !line.endsWith("?")) {
                fullText.append(".");
            }
            
            if (i < lines.size() - 1) {
                fullText.append(" ");
            }
        }
        
        List<String> sentences = new ArrayList<>();
        StringBuilder currentSentence = new StringBuilder();
        
        for (int i = 0; i < fullText.length(); i++) {
            char c = fullText.charAt(i);
            currentSentence.append(c);
            
            if (c == '.' || c == '!' || c == '?') {
                sentences.add(currentSentence.toString());
                currentSentence.setLength(0);
            }
        }

        for (String sentence : sentences) {
            String normalized = normalizeSentence(sentence);
            if (!normalized.isEmpty()) {
                System.out.println(normalized);
            }
        }
    }
    
    private static String normalizeSentence(String sentence) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) return "";
        
        char punctuation = sentence.charAt(sentence.length() - 1);
        String content = sentence.substring(0, sentence.length() - 1);
        
        content = content.replaceAll("\\s+", " ").trim().toLowerCase();
    
        if (!content.isEmpty()) {
            content = Character.toUpperCase(content.charAt(0)) + content.substring(1);
        } 
        
        return content + punctuation;
    }
}