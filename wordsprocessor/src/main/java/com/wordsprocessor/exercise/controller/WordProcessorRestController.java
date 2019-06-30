package com.wordsprocessor.exercise.controller;

import com.wordsprocessor.exercise.models.StringInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wordProcessor")
public class WordProcessorRestController {

    @Autowired
    WordProcessorController wordProcessorController;

    @GetMapping(value = "getStringInformation")
    public StringInformation getProduct(@RequestParam("words") String words) {
        StringInformation stringInformation = wordProcessorController.processWordsInformation(words);
        return stringInformation;
    }
}
