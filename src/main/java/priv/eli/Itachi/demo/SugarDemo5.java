package priv.eli.Itachi.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eli
 * @date 2018/7/31
 */
public class SugarDemo5 {

    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testList.add(String.valueOf(i));
        }


        testList.stream().forEach(System.out::println);



    }


}
