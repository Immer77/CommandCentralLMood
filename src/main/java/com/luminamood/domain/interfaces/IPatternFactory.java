package com.luminamood.domain.interfaces;

import com.luminamood.domain.entities.Pattern;

public interface IPatternFactory {
    Pattern createPattern(String patternId, String patternName);
}
