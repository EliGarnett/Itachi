package priv.eli.Itachi.demo;

/**
 * @author Eli
 * @date 2018/7/27
 * 语法糖学习之4：可变长度参数
 */
public class SugarDemo4 {

    public static void main(String[] args) {
        show("java语法糖学习", "可变长度参数", "Time：2018-07-27");
    }


    public static void show(String... params) {
        System.out.println("---------------------");
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
            System.out.println("---------------------");
        }
    }
}
