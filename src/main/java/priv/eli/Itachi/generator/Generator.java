package priv.eli.Itachi.generator;

/**
 * @author Eli
 * @date 2018/8/1
 *
 * 定义一个泛型接口
 */
public class Generator<T> {

    private T key;

    public Generator(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
