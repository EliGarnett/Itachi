package priv.eli.Itachi.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Eli
 * @date 2018/8/6
 */
public class SerialTest1 {

    static File file = new File("/Users/Eli/Documents" + File.separator + "out.txt");

    // 序列化操作
    static void serializeObject() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = null;
            try {
                oos = new ObjectOutputStream(fos);
                SerialPerson person = new SerialPerson("tom", 22);
                System.out.println("before write->" + person);
                oos.writeObject(person);            // 将对象写入文件
                oos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("oos关闭失败：" + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件：" + e.getMessage());
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("fos关闭失败：" + e.getMessage());
            }
        }
    }

    // 反序列化操作
    static void deserializeObject() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream(fis);
                try {
                    SerialPerson person = (SerialPerson) ois.readObject();    // 从文件中读出对象
                    System.out.println("after read->" + person);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("ois关闭失败：" + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件：" + e.getMessage());
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("fis关闭失败：" + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        serializeObject();
        deserializeObject();
    }
}
