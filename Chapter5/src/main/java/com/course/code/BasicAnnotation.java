package com.course.code;

import org.testng.annotations.*;

public class asddf {

    @Test
    public void testCase01(){
        System.out.println("testCase01 这是测试用例01");
    }

    @Test
    public void testCase02(){
        System.out.println("testCase02 这是测试用例02");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod 这是在测试方法之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod 这是在测试方法之后运行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass 这是在类之前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass 这是在类之后运行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 这是在测试套件之前运行");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 这是在测试套件之后运行");
    }
}
