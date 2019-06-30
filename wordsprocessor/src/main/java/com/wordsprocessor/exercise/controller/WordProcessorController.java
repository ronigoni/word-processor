package com.wordsprocessor.exercise.controller;

import com.wordsprocessor.exercise.WordUtils;
import com.wordsprocessor.exercise.models.StringInformation;
import org.springframework.stereotype.Controller;

@Controller
public class WordProcessorController {


    public StringInformation processWordsInformation(String words){

        int length = WordUtils.getLength(words);
        int total = WordUtils.getNumberOfWords(words);
        int numberOfEvenWords = WordUtils.getNumberOfEvenWords(words);
        int numberOfOddWords = WordUtils.getNumberOfOddWords(words);
        String letter = WordUtils.getFirstNonRepeatedLatter(words);

        return prepareStringInformation(length,total,numberOfEvenWords,numberOfOddWords,length,letter);
    }

    private StringInformation prepareStringInformation(int length, int total, int numberOfEvenWords, int numberOfOddWords, int i, String letter) {
        StringInformation stringInformation = StringInformation.builder().firstNonRepeatedLetter(letter).numberOfEvenWords(numberOfEvenWords)
                .length(length).numberOfOddWords(numberOfOddWords).totalNumberOfWords(total).build();
    return stringInformation;
    }

}
