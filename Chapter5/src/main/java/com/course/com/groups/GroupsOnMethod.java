package com.course.com.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test01() {
        System.out.println("这是 server端，test01");
    }

    @Test(groups = "server")
    public void test02() {
        System.out.println("这是 server端，test02");
    }

    @Test(groups = "client")
    public void test03() {
        System.out.println("这是 client，test03");
    }

    @Test(groups = "client")
    public void test04() {
        System.out.println("这是 client，test04");
    }

    @BeforeGroups("server")
    public void beforeGroups() {
        System.out.println("这是server端运行之前 运行的方法。");
    }

    @AfterGroups("server")
    public void afterGroups() {
        System.out.println("这是server端运行之后 运行的方法。");
    }

    @BeforeGroups("client")
    public void beforeGroups2() {
        System.out.println("这是client端运行之前 运行的方法。");
    }

    @AfterGroups("client")
    public void afterGroups2() {
        System.out.println("这是client端运行之后 运行的方法。");
    }

}
