
public class CDemo {

    private int x, y;

    public CDemo(int a, int b) {
        x = a;
        y = b;
    }

    public void show() {
        System.out.println(x + "," + y);
    }

    public static void main(String args[]) {
        CDemo ob1 = new CDemo(5, 15);
        CDemo ob2 = new CDemo(25, 35);
        ob1.show();
        ob2.show();

    }
}
/*
    Constructor
    --------------
    1) its a method like body which is having same name as its class and no return type  (not even void also).
    2) they may or may not have arguments. (varargs are allowed)
    3) they can be overloaded also.
    4) constructor is called implicitly (automatically) during object creation. (whosee parameters will match)
    5) when we do not provide any constructor, one zero arg constructor is internally provided by java
       that is called default constructor.
    6) once we write our own constructor, default will lost.
    7) generally constructors are used for initialization purpose. If you want to initialize an object
       during its creation process only.
    8) java do not supports copy constructor.
    9) java do not supports destructor also.
 */
