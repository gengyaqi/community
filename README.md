## 码匠社区

## 资料
[Spring Web 文档](https://spring.io/guides/gs/serving-web-content/#use-maven)  
[Spring 文档](https://spring.io/guides)  
[ES中文](https://elasticsearch.cn/)  
[Github OAuth 文档](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[mybatis](http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)  
[Spring MVC](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-config)  
[Mybatis Generation](http://mybatis.org/generator/running/runningWithMaven.html)  
[spring-boot 官方文档](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/)

## 工具

[Git 下载](https://git-scm.com/download)  
[Bootstrap文档](https://v3.bootcss.com/)
[Flyway](https://flywaydb.org/documentation/database/mysql)


## 脚本
```sql
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `account_id` varchar(100) DEFAULT NULL,
  `token` char(36) DEFAULT NULL,
  `gmt_creat` bigint(20) DEFAULT NULL,
  `gmt_modified` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


```
```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```