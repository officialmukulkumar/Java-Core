
package serializableapp1;

import EmpClass.Emp;
import java.io.*;



public class SerializableApp1 {

    public static void main(String[] args) throws Exception {
        
        Emp e =new Emp("Mukul","Incapp",21,10);
        FileOutputStream fout = new FileOutputStream("E:\\Java Program\\SerializableObj\\Object.txt");
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(e);
    }
    
}
