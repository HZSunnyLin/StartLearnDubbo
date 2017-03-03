package filter;

import com.alibaba.dubbo.rpc.*;

/**
 * Created by hzsunnylin on 2017/3/3.
 */
public class ConsumerRequestFilter implements Filter {
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException{
        Result result=invoker.invoke(invocation);
        return result;
    }
}
