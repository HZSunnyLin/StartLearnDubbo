package learndemo.dubboservice;

import DubboAPI.dubboServiceAPI;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by hzsunnylin on 2017/3/1.
 */
@Component
public class dubboServiceAPIImpl implements dubboServiceAPI {
    public String sayhellotoUser(String name){
        return new String("hello,"+name);
    }
}
