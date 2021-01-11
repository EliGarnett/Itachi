package priv.eli.Itachi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @Author Eli
 * @Date 2018/8/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemoEntity {

    private String name;

    private Integer age;

    @Builder.Default
    private boolean flag = Boolean.TRUE;

    public DemoEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
