import com.archegos.Hello;
import com.archegos.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ioc_test {
    public static void main(String[] args) {
        //解析beans.xml文件 , 生成管理相应的Bean对象
       ApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        //getBean : 参数即为spring配置文件中bean的id
        User user = (User) context.getBean("user");
        user.show();




    }
}
