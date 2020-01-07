package com.course.com.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupOnClass2 {
    public void test1(){
        System.out.println("GroupOnClass2 -- student -- test1 运行了。");
    }

    public void test2(){
        System.out.println("GroupOnClass2 -- student -- test2 运行了。");
    }
}
