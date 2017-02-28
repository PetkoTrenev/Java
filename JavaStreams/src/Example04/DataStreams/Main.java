package Example04.DataStreams;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    private static int age = 24;
    private static double money = 24.56;
    private static String name = "Yordan";
    private static HashMap<String, Double> grades;

    public static void main(String[] args){
        grades = new HashMap<>();

        grades.put("Pesho",2.0);
        grades.put("Petko",6.0);
        //   saveData();
        loadData();
    }

    private static void saveData(){
        try (DataOutputStream dos =
                     new DataOutputStream(
                     new BufferedOutputStream(
                             new FileOutputStream("res/data_streams/data.save")))) {
            dos.writeInt(age);
            dos.writeDouble(money);
            dos.writeUTF(name);
        }   catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private static void loadData(){
        try (DataInputStream dis =
                new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream("res/data_streams/data.save")))) {
            System.out.println("Age: " + dis.readInt());
            System.out.println("Money: " + dis.readDouble());
            System.out.println("Name: " + dis.readUTF());
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
