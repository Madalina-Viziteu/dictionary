
public class Main {

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();

        dictionary.printDictionary();
        dictionary.sortByCategory(Category.NOUN);
        dictionary.sortByCategory(Category.ADJECTIVE);
        dictionary.sortByCategory(Category.VERB);
        dictionary.sortByCategory(Category.ADVERB);
        dictionary.sortByCategory(Category.PUNCTUATION_SIGN);

    }

}

