package demoday11;

/**
 * @Author: cpzh
 * @Date: 2018/3/30 13:33
 * TODO:
 */
public class Initialization {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private boolean bo;
    private char c;
    private String st;

    public static void main(String[] args) {
        Initialization init = new Initialization();
        System.out.println("byte的初始值" + init.b);
        System.out.println("short的初始值" + init.s);
        System.out.println("int的初始值" + init.i);
        System.out.println("long的初始值" + init.l);
        System.out.println("float的初始值" + init.f);
        System.out.println("double的初始值" + init.d);
        System.out.println("boolean的初始值" + init.bo);
        System.out.println("char的初始值" + init.c);
        System.out.println("String的初始值" + init.st);

    }
}
