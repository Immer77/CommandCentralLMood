package com.luminamood.domain.entities;

public class Pattern {
    private int patternId;
    private String patternName;


    public Pattern(int patternId, String pattern){
        this.patternId = patternId;
        this.patternName = pattern;
    }

    public int getPatternId(){
        return patternId;
    }

    public void setPatternId(int patternId){
        this.patternId = patternId;
    }

    public String getPatternName(){
        return patternName;
    }

    public void setPatternName(String patternName){
        this.patternName = patternName;
    }

}
