package io.github.mat3e;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServiceTest {
    private final Service SUT = new Service();

    @Test
    public void test_null_ustalPowitanie_returns_DefaultValue() {
        //given + when
        var result = SUT.ustalPowitanie(null);

//    then
        assertEquals(Service.DEFAULT_GREETING, result);
    }

    @Test
    public void test_name_ustalPowitanie_returns_GreatingWithName() {
        //given
        String name = "test";
        // when
        var result = SUT.ustalPowitanie(name);
//    then
        assertEquals("Hello " + name, result);

    }
}
