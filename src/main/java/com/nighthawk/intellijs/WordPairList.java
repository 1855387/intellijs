package com.nighthawk.intellijs;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words){
        allPairs = new ArrayList<WordPair>();

        for (int i = 0; i < words.length-1; i++){
            for (int j = i+1; j < words.length; j++){
                WordPair w = new WordPair(words[i], words[j]);
                allPairs.add(w);
            }
        }

    }

    public int numMatches(){
        int counter = 0;
        for (int i = 0; i < allPairs.size(); i++){
            if(allPairs.get(i).getFirst() == allPairs.get(i).getSecond()){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args){
        String[] words = {"hello", "red", "blue", "my", "your", "red"};
        WordPairList list = new WordPairList(words);
        for(WordPair s : list.allPairs){
            System.out.println("WORDS: " + s.getFirst() + " AND " + s.getSecond());
        }
     System.out.println(list.numMatches());
    }
}
