package pl.com.infratex.ordermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OrderManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagerApplication.class, args);
	}

}

//Todo zabezpiecznie przed duplikatami w product_mappings
//TODO zabezpieczenie przed duplikatami w orders