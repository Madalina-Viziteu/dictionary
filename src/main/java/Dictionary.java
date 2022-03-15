import java.util.*;

public class Dictionary {

    Map<String, Category> dictionary = new TreeMap<>();

    public Dictionary() {

        dictionary.put("spring", Category.NOUN);
        dictionary.put("sun", Category.NOUN);
        dictionary.put("flowers", Category.NOUN);
        dictionary.put("grass", Category.NOUN);
        dictionary.put("bees", Category.NOUN);
        dictionary.put("beautiful", Category.ADJECTIVE);
        dictionary.put("red", Category.ADJECTIVE);
        dictionary.put("big", Category.ADJECTIVE);
        dictionary.put("small", Category.ADJECTIVE);
        dictionary.put("sunny", Category.ADJECTIVE);
        dictionary.put("is", Category.VERB);
        dictionary.put("are", Category.VERB);
        dictionary.put("fly", Category.VERB);
        dictionary.put("blooms", Category.VERB);
        dictionary.put("grow", Category.VERB);
        dictionary.put("slowly", Category.ADVERB);
        dictionary.put("cheerfully", Category.ADVERB);
        dictionary.put("sometimes", Category.ADVERB);
        dictionary.put("now", Category.ADVERB);
        dictionary.put("always", Category.ADVERB);
        dictionary.put(".", Category.PUNCTUATION_SIGN);
        dictionary.put(",", Category.PUNCTUATION_SIGN);
        dictionary.put("!", Category.PUNCTUATION_SIGN);
        dictionary.put("-", Category.PUNCTUATION_SIGN);
        dictionary.put("?", Category.PUNCTUATION_SIGN);

    }

    public void printDictionary(){
        Iterator<Map.Entry<String, Category>> iterator = dictionary.entrySet().iterator();
        System.out.println("The dictionary in alphabetical order: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Category> entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey().toLowerCase(Locale.ROOT));
        }
    }


    public void sortByCategory(Category category){
        Iterator<Map.Entry<String, Category>> iterator = dictionary.entrySet().iterator();
        System.out.println("The " + Category.valueOf(category.name()) + "S are: ");
        while (iterator.hasNext()){
            Map.Entry<String, Category> keyValue = (Map.Entry) iterator.next();
            if(keyValue.getValue().equals(category)){
                System.out.println(keyValue);
            }
        }
    }


//    public void generatePhrases() {
//        Random random = new Random();
//
//
//    }

}
