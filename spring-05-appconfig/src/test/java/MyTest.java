import com.archegos.pojo.Dog;
import com.archegos.pojo.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog.name);
    }
}
