package priv.eli.Itachi.serializable;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Eli
 * @date 2018/8/6
 */
@Data
public class SerialPerson implements Serializable {

    private static final long serialVersionUID = -1L;

    transient String name;

    int age;

    public SerialPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name : " + name + "\t age : " + age;
    }
}
