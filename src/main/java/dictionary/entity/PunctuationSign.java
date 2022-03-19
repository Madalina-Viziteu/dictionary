package dictionary.entity;


import dictionary.repository.DictionaryI;

import java.util.*;

public class PunctuationSign implements DictionaryI {

    Map<String, Category> punctuationSigns = new TreeMap<>();

    public PunctuationSign() {
        punctuationSigns.put(".", Category.PUNCTUATION_SIGN);
        punctuationSigns.put(",", Category.PUNCTUATION_SIGN);
        punctuationSigns.put("!", Category.PUNCTUATION_SIGN);
        punctuationSigns.put("-", Category.PUNCTUATION_SIGN);
        punctuationSigns.put("?", Category.PUNCTUATION_SIGN);
    }

    @Override
    public List<String> printByCategory() {
        Iterator<Map.Entry<String, Category>> iterator = punctuationSigns.entrySet().iterator();
        System.out.println("The " + Category.valueOf(Category.PUNCTUATION_SIGN.name()) + "S are: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Category> keyValue = (Map.Entry) iterator.next();
            if (keyValue.getValue().equals(Category.PUNCTUATION_SIGN)) {
                System.out.println(keyValue.getKey());
            }
        }
        return null;
    }

    @Override
    public String generate() {
        Random generator = new Random();
        Object[] values = punctuationSigns.keySet().toArray();
        Object randomValue = values[generator.nextInt(values.length)];
        System.out.println("The generated random punctuation sign: " + randomValue);
        return (String) randomValue;
    }
}
