package dictionary.entity;

import dictionary.repository.DictionaryI;

import java.util.*;

public class Noun implements DictionaryI {

    Map<String, Category> nouns = new TreeMap<>();

    public Noun() {
        nouns.put("spring", Category.NOUN);
        nouns.put("sun", Category.NOUN);
        nouns.put("flowers", Category.NOUN);
        nouns.put("grass", Category.NOUN);
        nouns.put("bees", Category.NOUN);
    }

    @Override
    public List<String> printByCategory() {
        Iterator<Map.Entry<String, Category>> iterator = nouns.entrySet().iterator();
        System.out.println("The " + Category.valueOf(Category.NOUN.name()) + "S are: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Category> keyValue = (Map.Entry) iterator.next();
            if (keyValue.getValue().equals(Category.NOUN)) {
                System.out.println(keyValue.getKey());
            }
        }
        return null;
    }


    @Override
    public String generate() {
        Random generator = new Random();
        Object[] values = nouns.keySet().toArray();
        Object randomValue = values[generator.nextInt(values.length)];
        System.out.println("The generated random noun: " + randomValue);
        return (String) randomValue;
    }
}
