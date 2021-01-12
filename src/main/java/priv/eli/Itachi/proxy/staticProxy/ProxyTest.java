package priv.eli.Itachi.proxy.staticProxy;

/**
 * @author Eli
 * @date 2021/1/11
 */
public class ProxyTest {

    public static void main(String[] args) {
        PayService payService = new StaticProxyPayServiceImpl(new PayServiceImpl());
        payService.save(234, 567);
    }

}
