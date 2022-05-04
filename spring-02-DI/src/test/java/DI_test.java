import com.archegos.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class DI_test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("Student");
        System.out.println(student.toString());
    }


}
