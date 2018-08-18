package com.tm.contract.base;

import com.tm.contract.word.dynamic.DynamicWordController;
import com.tm.contract.word.dynamic.DynamicWordService;
import com.tm.contract.word.model.Word;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class DynamicWordBase {
    @MockBean
    private DynamicWordService service;

    @Before
    public void setUp() {
        Mockito.when(service.loadWord()).thenReturn(new Word("MOCKED"));
        RestAssuredMockMvc.standaloneSetup(new DynamicWordController(service));
    }
}
