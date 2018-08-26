
# build database base on liquibase

* sh init-local-database.sh

* mvn clean package

* 继承CommandLineRunner

* web模式，启动后不会停止，spring-boot-starter-web

* 去掉liquibase自动配置

```
@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
```

* 打包命名：`<finalName>csn-liquibase-tool</finalName>`

* mvn clean spring-boot:run -Dspring-boot.run.profiles=h2

* 命令行启动maven项目，用ctr+c退出

* h2访问：http://localhost:8080/h2-console