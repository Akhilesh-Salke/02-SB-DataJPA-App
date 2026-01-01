package in.akhitech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.akhitech.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserService bean = context.getBean(UserService.class);
		
//		bean.saveUserFun();
		
//		bean.saveAllUserFun();
		
//		bean.findUserFun();
		
		bean.findAllUserFun();
	}

}
