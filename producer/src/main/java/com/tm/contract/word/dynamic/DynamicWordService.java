package com.tm.contract.word.dynamic;

import com.tm.contract.word.model.Word;
import org.springframework.stereotype.Service;

@Service
public class DynamicWordService {

    public Word loadWord() {
        return new Word("loaded");
    }
}
