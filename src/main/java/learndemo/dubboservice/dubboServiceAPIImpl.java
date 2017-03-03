package learndemo.dubboservice;

import DubboAPI.dubboServiceAPI;

/**
 * Created by hzsunnylin on 2017/3/1.
 */
public class dubboServiceAPIImpl implements dubboServiceAPI {
    public String sayhellotoUser(String name){
        return new String("hello,"+name);
    }
}
