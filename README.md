# Final Exam - Design Patterns with Java Spring
Implementing a Java program with Spring Framework by applying necessary design patterns, JDBC template and library, and other supporting tools. Adding or modifying any additional screen designs and necessary workflow as you see appropriated.

by Wanchanapon Thanwaranurak 5710546607


Install XAMPP (optional)
Create a database name "finalexam"  
(If you want to use a different name, you need to go to AppConfig.java and change to
dataSource.setUrl("jdbc:mysql://localhost:3306/finalexam?useUnicode=yes&characterEncoding=UTF-8"); )

Create a table as follow;
```  
CREATE TABLE `finalexam`.`pattern` ( `ID` INT UNSIGNED NOT NULL AUTO_INCREMENT , `NAME` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL , `GROUP` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL , `IMPLEMENTATION` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL , PRIMARY KEY (`ID`)) ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_bin;
```
