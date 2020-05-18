package sotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAsync
@EnableTransactionManagement
//@ComponentScan("sotest.code")
public class SoApplication {
    public static void main(String[] args) {
        //测试
        SpringApplication.run(SoApplication.class, args);
    }
}
