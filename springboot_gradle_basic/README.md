# springboot基本gradle模板项目

- 项目要修改的部分
  - 修改[settings.gradle](/springboot_gradle_basic/settings.gradle)文件中的项目名称
  - 修改[application.yml](/springboot_gradle_basic/src/main/resources/application.yml)文件中的`default-domain`名称和数据库相关信息
  - 导入项目后重构项目包名称后修改下列相关文件中的包配置
    - [Application.java](/springboot_gradle_basic/src/main/java/top/huhuiyu/springboot/gradle/basic/Application.java)中的`basePackages`
    - [mybatis-config.xml](/springboot_gradle_basic/src/main/resources/mybatis-config.xml)中的所有`package`
    - [logback.xml](/springboot_gradle_basic/src/main/resources/logback.xml)中的`logger name`
    - [SwaggerConfig.java](/springboot_gradle_basic/src/main/java/top/huhuiyu/springboot/gradle/basic/config/SwaggerConfig.java)中的`basePackages`
