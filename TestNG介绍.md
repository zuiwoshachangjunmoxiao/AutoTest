# TestNG介绍

适合测试人员使用的原因：

1. 比Junit涵盖功能更全面的测试框架
2. Junit更适合隔离性比较强的单元测试
3. TestNG更适合复杂的集成测试



## TestNG使用

```java
<dependencies>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>6.10</version>
    </dependency>
</dependencies>
```

## IDEA中新建module

1. 选中项目文件夹——右键——new——module
2. 在 New Module 窗口中选择 Maven，点击 Next
3. GroupId 输入：com.course.code
4. ArtifactId 输入：Chapter5，点击 Next
5. 点击 Finish

#### 修改module的名字

1. 选中文件夹 Chapter5，右键——refactor——rename
2. 选择 “Rename directory”，重命名为“Chapter6”
3. 重复步骤1，选择 “Rename module”，重命名为“Chapter6”
4. 修改pom.xml，将`<artifactId>Chapter5</artifactId> ` 修改为 `<artifactId>Chapter6</artifactId>`

1