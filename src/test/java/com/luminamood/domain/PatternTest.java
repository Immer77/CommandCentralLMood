package com.luminamood.domain;

import com.luminamood.domain.entities.Pattern;
import com.luminamood.domain.factories.PatternFactory;
import org.junit.Test;

public class PatternTest {

    @Test
    public void testPattern(){
        Pattern pattern = new Pattern(1, "pattern");
        assert(pattern.getPatternId() == 1);
        assert(pattern.getPatternName().equals("pattern"));
        pattern.setPatternId(2);
        assert(pattern.getPatternId() == 2);
        pattern.setPatternName("pattern2");
        assert(pattern.getPatternName().equals("pattern2"));
    }
    @Test
    public void testPatternFactory(){
        PatternFactory patternFactory = new PatternFactory();
        Pattern pattern = patternFactory.createPattern(1, "pattern");
        assert(pattern.getPatternId() == 1);
        assert(pattern.getPatternName().equals("pattern"));
        pattern.setPatternId(2);
        assert(pattern.getPatternId() == 2);
        pattern.setPatternName("pattern2");
        assert(pattern.getPatternName().equals("pattern2"));
    }
}
