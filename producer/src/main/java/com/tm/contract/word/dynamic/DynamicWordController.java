package com.tm.contract.word.dynamic;

import com.tm.contract.word.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("word")
public class DynamicWordController {
    private final DynamicWordService service;

    @Autowired
    public DynamicWordController(DynamicWordService service) {
        this.service = service;
    }

    @GetMapping("dynamic")
    public Word getWord() {
        return service.loadWord();
    }
}
