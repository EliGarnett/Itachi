package priv.eli.Itachi.web;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.eli.Itachi.entity.DemoEntity;

import java.util.List;

/**
 * @Author Eli
 * @Date 2018/8/22
 */
@RestController
public class DemoController {

    @PostMapping(value = "/demo/notnull")
    public void demo(DemoEntity param) {
        System.out.println(param.toString());
    }

    public static void main(String[] args) {

    }
}
