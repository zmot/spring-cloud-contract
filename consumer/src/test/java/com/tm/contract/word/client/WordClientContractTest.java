package com.tm.contract.word.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"com.tm.contract:producer:0.0.1-SNAPSHOT:stubs:8080"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class WordClientContractTest {
    @Autowired
    private WordClient client;

    @Test
    public void shouldReturnDynamicWord() {
        assertThat(client.getDynamicWord().getWord(), is("MOCKED"));
    }

    @Test
    public void shouldReturnStaticWord() {
        assertThat(client.getHardcodedWord().getWord(), is("HARDCODED"));
    }

}