package dictionary.entity;

public class Dictionary {

    Noun noun = new Noun();
    Adjective adjective = new Adjective();
    Verb verb = new Verb();
    Adverb adverb = new Adverb();
    PunctuationSign punctuationSign = new PunctuationSign();

   // Map<List<String>, Category> dictionary = new TreeMap<>();

    public void phraseGenerator() {
        String randomNoun = noun.generate();
        String randomAdjective = adjective.generate();
        String randomVerb = verb.generate();
        String randomAdverb = adverb.generate();
        String randomPunctuationSign = punctuationSign.generate();
        System.out.println("The generated sentence: " + randomAdjective + " " + randomNoun + " " + randomVerb + " " + randomAdverb + randomPunctuationSign);
    }

    public void sortByCategory(Category category) {
        if (Category.valueOf(category.name()).equals(Category.NOUN)) {
            noun.printByCategory();
        }
        if (Category.valueOf(category.name()).equals(Category.ADJECTIVE)){
            adjective.printByCategory();
        }
        if (Category.valueOf(category.name()).equals(Category.ADVERB)){
            adverb.printByCategory();
        }
        if (Category.valueOf(category.name()).equals(Category.VERB)) {
            verb.printByCategory();
        }
        if(Category.valueOf(category.name()).equals(Category.PUNCTUATION_SIGN)){
            punctuationSign.printByCategory();
        }
    }

//    public void printDictionary() {
//        Iterator<Map.Entry<List<String>, Category>> iterator = dictionary.entrySet().iterator();
//        System.out.println("The dictionary in alphabetical order: ");
//        while (iterator.hasNext()) {
//            Map.Entry<String, Category> entry = (Map.Entry) iterator.next();
//            System.out.println(entry.getKey().toLowerCase(Locale.ROOT));
//        }
//    }

}


