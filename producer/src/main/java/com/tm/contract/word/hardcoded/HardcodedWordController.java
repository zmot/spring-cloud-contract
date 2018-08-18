package com.tm.contract.word.hardcoded;

import com.tm.contract.word.model.Word;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "word", produces = "application/word.v1+json", consumes = "application/word.v1+json")
public class HardcodedWordController {

    @GetMapping("hardcoded")
    public Word getWord() {
        return new Word("HARDCODED");
    }
}
