package com.wordsprocessor.exercise;

public class WordUtils {

    public static int getLength(String words){
       return words.length();
    }

    public static int getNumberOfWords(String words){
       return words.split(" ").length ;
    }

    public static int getNumberOfOddWords(String words){
        int count = 0;
        String[] array = words.split(" ");
        for(int i = 0 ; i < array.length ; i++){
            if(array[i].length()%2 != 0)
                count++;
        }
        return count;
    }

    public static int getNumberOfEvenWords(String words){
        int count = 0;
        String[] array = words.split(" ");
        for(int i = 0 ; i < array.length ; i++){
            if(array[i].length()%2 == 0)
                count++;
        }
        return count;
    }

    public static String getFirstNonRepeatedLatter(String words){
        char count[] = new char[256];
        getCharCountArray(words,count);
        String index = "";
        int i;
        for (i = 0; i < words.length();  i++)
        {
            if (count[words.charAt(i)] == 1)
            {
                index = String.valueOf(words.charAt(i));
                break;
            }
        }

        return index;
    }

     private static void getCharCountArray(String str, char[] count)
    {
        for (int i = 0; i < str.length();  i++)
            count[str.charAt(i)]++;
    }
}
