package org.example;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class TestOrderExample {

    @BeforeClass
        public static void init(){
        System.out.println("before test classs");
    }
    @Before
    public void before(){
        System.out.println("before every test");
    }
    @After
    public void after(){
        System.out.println("after every test");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After test class");
    }

    @Test
    public void test1(){
        assertTrue(true);
    }
    @Test
    public void test2(){
        assertTrue(true);
    }
}
