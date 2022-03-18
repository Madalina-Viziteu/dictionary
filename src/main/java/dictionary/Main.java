package dictionary;

import dictionary.entity.*;

public class Main {
    public static void main(String[] args) {

        Noun nouns = new Noun();
        Adjective adjective = new Adjective();
        Verb verb = new Verb();
        Adverb adverb = new Adverb();
        PunctuationSign punctuationSign = new PunctuationSign();

        nouns.printByCategory();
        adjective.printByCategory();
        verb.printByCategory();
        adverb.printByCategory();
        punctuationSign.printByCategory();

        Dictionary dictionary = new Dictionary();
        dictionary.phraseGenerator();

        dictionary.sortByCategory(Category.NOUN);

    }
}
