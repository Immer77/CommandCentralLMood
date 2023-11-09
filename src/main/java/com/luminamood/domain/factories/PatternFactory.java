package com.luminamood.domain.factories;

import com.luminamood.domain.entities.Pattern;
import com.luminamood.domain.interfaces.IPatternFactory;

public class PatternFactory implements IPatternFactory {
    public Pattern createPattern(int patternId, String patternName){
        return new Pattern(patternId, patternName);
    }
}
