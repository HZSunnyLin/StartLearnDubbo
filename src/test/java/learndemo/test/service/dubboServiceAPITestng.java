package learndemo.test.service;
import DubboAPI.DubboServiceAPI;
import learndemo.dubboservice.DubboServiceAPIImpl;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created by hzsunnylin on 2017/5/31.
 */
public class dubboServiceAPITestng {

    @Resource(name="DubboServiceAPIImpl")
    private DubboServiceAPI dubboServiceAPI=new DubboServiceAPIImpl();

    @Test
    public void testDubboServiceAPI(){
        dubboServiceAPI.sayhellotoUser("Testng");
    }

}
