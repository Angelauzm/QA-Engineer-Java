package Array;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"привет", "поляризация", "привет", "градирование", "диафрагма", "пока", "пока", "обкраивание", "овощь", "перепоясывание", "овощь", "перепоясывание", "капля", "арбуз", "банан", "банан", "папоротник", "ширма", "пока"};

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Уникальные слова:");
        Set<String> uniqueWords = new HashSet<>(wordCount.keySet());
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("\nКоличество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз");
        }
    }
}
