package priv.eli.Itachi.proxy.staticProxy;

/**
 * @author Eli
 * @date 2021/1/11
 */
public interface PayService {

    /**
     * 支付回调
     *
     * @param outTraceNo 订单号
     * @return
     */
    String callback(String outTraceNo);

    /**
     * 下单
     *
     * @param userId    用户id
     * @param productId 商品id
     * @return
     */
    int save(int userId, int productId);
}
