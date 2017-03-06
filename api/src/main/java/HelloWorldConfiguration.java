import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by haojianmeng on 2017/3/3.
 */
@ComponentScan({"com.totem"})
@SpringBootApplication
public class HelloWorldConfiguration {



    public static void main(String[] args) {
        SpringApplication.run(HelloWorldConfiguration.class, args);
    }
}
