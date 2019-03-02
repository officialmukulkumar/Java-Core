package serializableapp2;

import EmpClass.Emp;
import java.io.*;

public class SerializableApp2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("E:\\Java Program\\SerializableObj\\Object.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Emp e = (Emp) oin.readObject();

        System.out.println(e.name);
        System.out.println(e.cname);
        System.out.println(e.age);
        System.out.println(e.a);

        oin.close();
        fin.close();

    }

}
