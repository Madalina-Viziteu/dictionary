package dictionary.entity;

import dictionary.repository.DictionaryImpl;

import java.util.*;

public class Adjective implements DictionaryImpl {
    Map<String, Category> adjectives = new TreeMap<>();

    public Adjective() {
        adjectives.put("beautiful", Category.ADJECTIVE);
        adjectives.put("red", Category.ADJECTIVE);
        adjectives.put("big", Category.ADJECTIVE);
        adjectives.put("small", Category.ADJECTIVE);
        adjectives.put("sunny", Category.ADJECTIVE);
    }

    @Override
    public List<String> printByCategory() {
        Iterator<Map.Entry<String, Category>> iterator = adjectives.entrySet().iterator();
        System.out.println("The " + Category.valueOf(Category.ADJECTIVE.name()) + "S are: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Category> keyValue = (Map.Entry) iterator.next();
            if (keyValue.getValue().equals(Category.ADJECTIVE)) {
                System.out.println(keyValue.getKey());
            }
        }
        return null;
    }

    @Override
    public String generate() {
        Random generator = new Random();
        Object[] values = adjectives.keySet().toArray();
        Object randomValue = values[generator.nextInt(values.length)];
        System.out.println("The generated random adjective: " + randomValue);
        return (String) randomValue;
    }
}
