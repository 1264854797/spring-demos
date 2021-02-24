import com.zhou.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Appliction.xml");
        User user=(User) applicationContext.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
        user.show();
    }
}
