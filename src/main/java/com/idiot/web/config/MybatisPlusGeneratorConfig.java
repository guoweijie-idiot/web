package com.idiot.web.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * mybatis-plus 代码生成配置
 * </p>
 *
 * @author guoweijie
 * @since 2021/1/12 下午11:18
 */
public class MybatisPlusGeneratorConfig {
    public static void main(String[] args) {

        // 代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();

        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        // 生成文件的输出目录
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        // 是否覆盖已有文件
        globalConfig.setFileOverride(true);
        // 是否打开输出目录（默认true）
        globalConfig.setOpen(false);
        // 开发人员
        globalConfig.setAuthor("guoweijie");
        // 开启 BaseResultMap
        globalConfig.setBaseResultMap(true);

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/test");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        dataSourceConfig.setDbType(DbType.MYSQL);

        // 数据库表配置
        StrategyConfig strategy = new StrategyConfig();
        // 数据库表映射到实体的命名策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 数据库表字段映射到实体的命名策略, 未指定按照naming执行
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 需要包含的表名，当enableSqlFilter（V3.3.1）为false时，允许正则表达式（与exclude（不包含表名）二选一配置）
        strategy.setInclude("Customers");
        //【实体】是否为lombok模型（默认 false）
        strategy.setEntityLombokModel(true);
        // Boolean类型字段是否移除is前缀（默认 false）
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);
        // 生成 @RestController 控制器
        strategy.setRestControllerStyle(true);
        // 驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);

        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        // 父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
        packageConfig.setParent("com.idiot.web");
        packageConfig.setController("controller");
        packageConfig.setEntity("model");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setMapper("mapper");

        // 自定义配置
        InjectionConfig injectionConfig = new InjectionConfig() {
            @Override
            public void initMap() { }
        };
        // 如果模板引擎是 velocity
        String templatePath = "/templates/mapper.xml.vm";
        // 自定义输出配置
        List<FileOutConfig> fileOutConfigList = new ArrayList<>();
        // 自定义配置会被优先输出
        fileOutConfigList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return System.getProperty("user.dir") + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        injectionConfig.setFileOutConfigList(fileOutConfigList);

        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.setStrategy(strategy);
        autoGenerator.setPackageInfo(packageConfig);
        autoGenerator.setCfg(injectionConfig);
        autoGenerator.setTemplateEngine(new VelocityTemplateEngine());
        autoGenerator.execute();
    }

}
