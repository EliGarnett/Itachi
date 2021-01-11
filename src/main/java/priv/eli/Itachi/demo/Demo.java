package priv.eli.Itachi.demo;

import com.alibaba.fastjson.JSON;
import lombok.val;
import priv.eli.Itachi.entity.DemoEntity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Eli
 * @date 2020/9/3
 */
public class Demo {

    public static void main(String[] args) {

        DemoEntity entity = new DemoEntity("test", 1);
        System.out.println(JSON.toJSONString(entity));

    }

}
