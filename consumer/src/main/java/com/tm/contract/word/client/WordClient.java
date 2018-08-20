package com.tm.contract.word.client;

import com.tm.contract.word.model.MyWord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "wordClient", url = "localhost:8080", configuration = WordClientConfiguration.class)
public interface WordClient {
    @GetMapping(value = "/word/hardcoded", consumes = "application/word.v1+json")
    MyWord getHardcodedWord();

    @GetMapping(value = "/word/dynamic", consumes = "application/word.v1+json")
    MyWord getDynamicWord();
}
