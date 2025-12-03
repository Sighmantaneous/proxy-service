package ie.atu.proxyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProxyserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyserviceApplication.class, args);
    }

}
