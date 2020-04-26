import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * @date 2020年4月26日16:09:49
 */
@SpringBootApplication
@ComponentScan(basePackages ="com.study")
public class MavenSpringbootStart {

    public static void main(String[] args) {
        SpringApplication.run(MavenSpringbootStart.class,args);
    }

}
