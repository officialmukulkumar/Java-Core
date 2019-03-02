package EmpClass;

import java.io.*;

public class Emp implements Serializable {

    public static int a;
    public String name;
    public int age;
    transient public String cname;

    public Emp(String n, String cn, int ag, int x) {

        name = n;
        cname = cn;
        age = ag;
        a = x;

    }

}
