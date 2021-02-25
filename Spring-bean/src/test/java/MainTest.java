import com.zhou.pojo.Hello;
import com.zhou.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
   /**依赖注入测试
    *  public static void main(String[] args) {
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) applicationContext.getBean("hello");
        hello.test();
    }*/
   /**注入不同类型的字段测试
    * public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       Student student = (Student) context.getBean("student2");
//       System.out.println(student.getName());
       student.show();
   }*/
   /**测试p命名空间与c命名空间
    *public static void main(String[] args) {
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
       Hello hello=(Hello)applicationContext.getBean("cname");
       hello.test();
   }*/

}
