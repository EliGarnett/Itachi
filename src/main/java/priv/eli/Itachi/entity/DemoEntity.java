package priv.eli.Itachi.entity;

import lombok.Data;
import lombok.NonNull;

/**
 * @Author Eli
 * @Date 2018/8/22
 */
@Data
public class DemoEntity {

    private String name;

    public DemoEntity(String name) {
        this.name = name;
    }
}