package priv.eli.Itachi.demo;

import java.util.Random;

/**
 * @author Eli
 * @date 2018/7/27
 * 语法糖学习之1：switch支持String与枚举
 */
public class SugarDemo1 {

    public void strTest() {
        String str = "通话";
        switch (str) {
            case "通话":
                System.out.println("str is 通话");
                break;
            case "重地":
                System.out.println("str is 重地");
                break;
            case "hello":
                System.out.println("str is hello");
                break;
            case "world":
                System.out.println("str is world");
                break;
            default:
                break;
        }
    }


    public enum EnumColor {
        RED, GREEN, BLUE, YELLOW, BLACK;

        public static EnumColor getColor() {
            Random random = new Random(4);
            switch (random.nextInt(4)) {
                case 0:
                    return EnumColor.BLUE;
                case 1:
                    return EnumColor.GREEN;
                case 2:
                    return EnumColor.RED;
                case 3:
                    return EnumColor.YELLOW;
                default:
                    return EnumColor.BLACK;
            }
        }
    }


    public static void main(String[] args) {
        EnumColor color = EnumColor.getColor();
        System.out.print("select color : ");
        switch (color) {
            case RED:
                System.out.println("RED");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case YELLOW:
                System.out.println("YELLOW");
                break;
            case BLACK:
                System.out.println("BLACK");
                break;
        }
    }
}