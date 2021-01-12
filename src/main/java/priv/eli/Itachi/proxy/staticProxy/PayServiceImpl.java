package priv.eli.Itachi.proxy.staticProxy;

/**
 * 接口实现类，目标类
 *
 * @author Eli
 * @date 2021/1/11
 */
public class PayServiceImpl implements PayService {

    @Override
    public String callback(String outTraceNo) {
        System.out.println("目标类 PayServiceImpl 回调 方法 callback");
        return outTraceNo;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("目标类 PayServiceImpl 回调 方法 save");
        return productId;
    }
}
