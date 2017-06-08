package learndemo.test.service;
import DubboAPI.DubboServiceAPI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by hzsunnylin on 2017/5/31.
 * use Junit Structure for test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class dubboServiceAPITest {

    @Autowired
    private DubboServiceAPI dubboServiceAPI;

    @Test
    public void testDubbosServiceAPI(){
        dubboServiceAPI.sayhellotoUser("Junit");
    }
}
