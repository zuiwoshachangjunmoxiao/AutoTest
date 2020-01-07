package com.course.com.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClass1 {
    public void test1(){
        System.out.println("GroupOnClass1 -- teacher -- test1 运行了。");
    }

    public void test2(){
        System.out.println("GroupOnClass1 -- teacher -- test2 运行了。");
    }
}
