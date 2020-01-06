package com.course.com;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void Ignore1(){
        System.out.println("ignore1 执行了");
    }

    @Test(enabled = false)
    public void Ignore2(){
        System.out.println("ignore2 执行了");
    }

    @Test(enabled = true)
    public void Ignore3(){
        System.out.println("ignore3 执行了");
    }
}
