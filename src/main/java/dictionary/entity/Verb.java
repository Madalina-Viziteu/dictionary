package dictionary.entity;

import dictionary.repository.DictionaryI;

import java.util.*;

public class Verb implements DictionaryI {

    Map<String, Category> verbs = new TreeMap<>();

    public Verb() {
        verbs.put("is", Category.VERB);
        verbs.put("are", Category.VERB);
        verbs.put("fly", Category.VERB);
        verbs.put("blooms", Category.VERB);
        verbs.put("grow", Category.VERB);
    }

    @Override
    public List<String> printByCategory() {
        Iterator<Map.Entry<String, Category>> iterator = verbs.entrySet().iterator();
        System.out.println("The " + Category.valueOf(Category.VERB.name()) + "S are: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Category> keyValue = (Map.Entry) iterator.next();
            if (keyValue.getValue().equals(Category.VERB)) {
                System.out.println(keyValue.getKey());
            }
        }
        return null;
    }

    @Override
    public String generate() {
        Random generator = new Random();
        Object[] values = verbs.keySet().toArray();
        Object randomValue = values[generator.nextInt(values.length)];
        System.out.println("The generated random verb: " + randomValue);
        return (String) randomValue;
    }
}
