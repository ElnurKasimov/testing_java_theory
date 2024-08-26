package HyperSkill.Tests;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SampleClassTests {
    // Your task is to setup TestUtils and instantiate the instance field.
    SampleClass instance;

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void beforeEach() {
        TestUtils.timeConsumingSetup();
        instance = TestUtils.getSampleClassInstance();
    }

    @AfterEach
    void afterEach() {

    }

    @Test
    void testMethodOne() {
        Assertions.assertTrue(instance.methodOne());
    }

    @Test
    void testMethodTwo() {
        Assertions.assertTrue(instance.methodTwo());
    }
}