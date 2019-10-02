
import com.spring.service.CustomerService;
import com.spring.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User01
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        CustomerService service = appContext.getBean("customerService", CustomerService.class);
        
        System.out.println(service.findAll().get(0).getFirstname());
    }
    
}
