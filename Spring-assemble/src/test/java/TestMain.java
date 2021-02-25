import com.zhou.config.MyConfig;
import com.zhou.controller.UserController;
import com.zhou.pojo.Dog;
import com.zhou.pojo.Dogs;
import com.zhou.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

import com.zhou.controller.UserController;

public class TestMain {

    //    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Appliction.xml");
//        User user = (User) applicationContext.getBean("user");
//        user.getCat().shout();
//        user.getDog().shout();
//        user.show();
//    }
//    public static void main(String[] args) {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Appliction.xml");
//        UserController UserController=(UserController)applicationContext.getBean("userController");
//        UserController.shout();
//    }

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Dogs dogs = (Dogs) applicationContext.getBean("dogs");
        System.out.println(dogs.name);
    }

}
