package hhf.generatortest.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * hhf.mybatisplusdemo.generator
 *
 * @author hehongfei
 * @date 2022/6/1 8:13
 */
//代码生成器生成实体类，mapper,mapper.xml，service,controller

public class Generator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/blog-demo?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
        String username = "root";
        String password = "mysql";
        String mapperXmlUrl = "E://codes//gs//generator-test//src//main//resources//hhf//generatortest//mapper";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("hhf") // 设置作者
                            // .enableSwagger()     //这里我们不适用swagger
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E://codes//gs//generator-test//src//main//java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("hhf") // 设置父包名
                            .moduleName("generatortest") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, mapperXmlUrl)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("student") // 设置需要生成的表名
                            .addTablePrefix(); // 设置过滤表前缀
                })
                // .templateEngine(new FreemarkerTemplateEngine()) // 这里不使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();



    }
}
