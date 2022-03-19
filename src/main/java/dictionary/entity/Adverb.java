package dictionary.entity;

import dictionary.repository.DictionaryI;

import java.util.*;

public class Adverb implements DictionaryI {

    Map<String, Category> adverbs = new TreeMap<>();

    public Adverb() {
        adverbs.put("slowly", Category.ADVERB);
        adverbs.put("cheerfully", Category.ADVERB);
        adverbs.put("sometimes", Category.ADVERB);
        adverbs.put("now", Category.ADVERB);
        adverbs.put("always", Category.ADVERB);

    }

    @Override
    public List<String> printByCategory() {
        Iterator<Map.Entry<String, Category>> iterator = adverbs.entrySet().iterator();
        System.out.println("The " + Category.valueOf(Category.ADVERB.name()) + "S are: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Category> keyValue = (Map.Entry) iterator.next();
            if (keyValue.getValue().equals(Category.ADVERB)) {
                System.out.println(keyValue.getKey());
            }
        }
        return null;
    }


    @Override
    public String generate() {
        Random generator = new Random();
        Object[] values = adverbs.keySet().toArray();
        Object randomValue = values[generator.nextInt(values.length)];
        System.out.println("The generated random adverb: " + randomValue);
        return (String) randomValue;
    }
}
