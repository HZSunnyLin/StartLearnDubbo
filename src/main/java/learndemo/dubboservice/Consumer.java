package learndemo.dubboservice;

/**
 * Created by hzsunnylin on 2017/3/3.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;
import DubboAPI.dubboServiceAPI;
public class Consumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        context.start();
        dubboServiceAPI dubboServiceAPI=(dubboServiceAPI)context.getBean("dubboserviceapi");
        String returnstr=dubboServiceAPI.sayhellotoUser("hzsunnylin");
        System.out.println(returnstr);
    }
}
