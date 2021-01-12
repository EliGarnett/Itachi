package priv.eli.Itachi.proxy.staticProxy;

/**
 * 接口实现类，静态代理
 *
 * @author Eli
 * @date 2021/1/11
 */
public class StaticProxyPayServiceImpl implements PayService {

    private PayService payService;

    public StaticProxyPayServiceImpl(PayService payService) {
        this.payService = payService;
    }

    @Override
    public String callback(String outTraceNo) {
        System.out.println("StaticProxyPayServiceImpl callback begin");
        String result = payService.callback(outTraceNo);
        System.out.println("StaticProxyPayServiceImpl callback end");
        return result;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("StaticProxyPayServiceImpl save begin");
        int result = payService.save(userId, productId);
        System.out.println("StaticProxyPayServiceImpl save end ");
        return result;
    }
}
