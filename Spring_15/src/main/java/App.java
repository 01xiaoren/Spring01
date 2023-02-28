import com.xiaoren.config.SpringConfig;
import com.xiaoren.domaim.Account;
import com.xiaoren.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService bean = applicationContext.getBean(AccountService.class);
        List<Account> all = bean.findAll();
        for (Account ser : all) {
            System.out.println(ser);
        }
    }
}
