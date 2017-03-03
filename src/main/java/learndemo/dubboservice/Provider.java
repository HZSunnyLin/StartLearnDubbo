package learndemo.dubboservice;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hzsunnylin on 2017/3/3.
 */
public class Provider {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        context.start();
        System.out.println("press any key exit");
        System.in.read();

    }

}
