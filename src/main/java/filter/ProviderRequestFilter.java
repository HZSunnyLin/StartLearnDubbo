package filter;

/**
 * Created by hzsunnylin on 2017/3/3.
 */
import com.alibaba.dubbo.rpc.*;

public class ProviderRequestFilter implements Filter {

    public Result invoke(Invoker<?> invoker,Invocation invocation) throws RpcException{
        Result result=invoker.invoke(invocation);
        return result;
    }
}
