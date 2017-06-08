package learndemo.dubboservice;

/**
 * Created by hzsunnylin on 2017/3/3.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;
import DubboAPI.DubboServiceAPI;
public class Consumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        context.start();
        DubboServiceAPI DubboServiceAPI =(DubboServiceAPI)context.getBean("dubboserviceapi");
        String returnstr= DubboServiceAPI.sayhellotoUser("hzsunnylin");
        System.out.println(returnstr);
    }
}
