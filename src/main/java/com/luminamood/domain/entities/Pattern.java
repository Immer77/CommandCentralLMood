package com.luminamood.domain.entities;

public class Pattern {
    private String patternId;
    private String patternName;


    public Pattern(String patternId, String pattern){
        this.patternId = patternId;
        this.patternName = pattern;
    }

    public String getPatternId(){
        return patternId;
    }

    public void setPatternId(String patternId){
        this.patternId = patternId;
    }

    public String getPatternName(){
        return patternName;
    }

    public void setPatternName(String patternName){
        this.patternName = patternName;
    }

}
