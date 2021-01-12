package priv.eli.Itachi.serializable;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Eli
 * @date 2018/8/8
 */
@Data
public class SerialChild extends SerialFather implements Serializable {

    private String name;

    private int age;

    public SerialChild(Integer num, String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        String str = "ASDFASFDASD";
        str = str.toLowerCase();
        System.out.println(str);
    }
}
