package dictionary.service;

import dictionary.entity.*;
import java.util.Scanner;

public class DictionaryService {

    Noun noun = new Noun();
    Adjective adjective = new Adjective();
    Verb verb = new Verb();
    Adverb adverb = new Adverb();
    PunctuationSign punctuationSign = new PunctuationSign();
    Dictionary dictionary = new Dictionary();

    public void myOptions() {
        System.out.println("Choose one of the following operations: ");
        System.out.println("1 for print the nouns.");
        System.out.println("2 for print the adjectives.");
        System.out.println("3 for print the verbs.");
        System.out.println("4 for print the adverbs.");
        System.out.println("5 for print the punctuation signs.");
        System.out.println("6 for generate a sentence.");
    }

    public void myMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                noun.printByCategory();
                break;
            case 2:
                adjective.printByCategory();
                break;
            case 3:
                verb.printByCategory();
                break;
            case 4:
                adverb.printByCategory();
                break;
            case 5:
                punctuationSign.printByCategory();
                break;
            case 6:
                dictionary.phraseGenerator();
                break;
            default:
                System.out.println("The option you choose is invalid. Please choose another option");
                myOptions();
        }
        myOptions();
        myMenu();
    }
}

