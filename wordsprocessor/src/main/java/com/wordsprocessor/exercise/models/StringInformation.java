package com.wordsprocessor.exercise.models;
import lombok.Builder;
import lombok.Data;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name = "STRINGS")
@Data
@Builder
public class StringInformation {

    @Id
    private int id;

    private int length;

    private int totalNumberOfWords;

    private int numberOfOddWords;

    private int numberOfEvenWords;

    private String firstNonRepeatedLetter;
}
