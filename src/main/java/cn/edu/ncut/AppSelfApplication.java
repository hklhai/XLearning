package cn.edu.ncut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cn.edu.ncut.**.*")
public class AppSelfApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {


    public static void main(String[] args) {
        SpringApplication.run(AppSelfApplication.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8090);
    }

    /**
     * 部署到JavaEE容器
     * 1.修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
     * 2.修改pom文件中jar 为 war    <packaging>war</packaging>
     * 3.修改pom，排除tomcat插件
     * 4.打包部署到容器
     * 5.使用命令 mvn clean package 打包后，同一般J2EE项目一样部署到web容器
     *
     * @param builder  SpringBoot builder类
     * @return
     */

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(this.getClass());
//    }
}
