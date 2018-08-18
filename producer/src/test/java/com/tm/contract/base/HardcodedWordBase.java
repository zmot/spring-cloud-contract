package com.tm.contract.base;

import com.tm.contract.word.hardcoded.HardcodedWordController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public abstract class HardcodedWordBase {
    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new HardcodedWordController());
    }
}
