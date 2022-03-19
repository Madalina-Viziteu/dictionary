package dictionary;

import dictionary.service.DictionaryService;

public class Main {
    public static void main(String[] args) {

        DictionaryService dictionaryService = new DictionaryService();

        dictionaryService.myOptions();
        dictionaryService.myMenu();

        //pentru sortarea din aplicatie, dupa categorie
//        Dictionary dictionary = new Dictionary();
//        dictionary.sortByCategory(Category.NOUN);

    }
}
