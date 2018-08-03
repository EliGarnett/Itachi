package priv.eli.Itachi.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eli
 * @date 2018/7/31
 */
public class SugarDemo6 {


    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        List<Integer> integerArrayList = new ArrayList<>();

        Class strListClass = stringArrayList.getClass();
        System.out.println(strListClass);
        Class integerListClass = integerArrayList.getClass();

        if (strListClass.equals(integerListClass)) {
            System.out.println("类型相同");
        }

    }

}
