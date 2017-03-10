package learndemo.dubboservice;

import DubboAPI.dubboServiceAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by hzsunnylin on 2017/3/1.
 */
@Component
public class dubboServiceAPIImpl implements dubboServiceAPI {
    Logger busilog= LoggerFactory.getLogger("businessLog");//只打业务日志
    Logger execlog= LoggerFactory.getLogger(dubboServiceAPIImpl.class);//只打应用执行错误日志
    public String sayhellotoUser(String name){
        return new String("hello,"+name);
    }
}
