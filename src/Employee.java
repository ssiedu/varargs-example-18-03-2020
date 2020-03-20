
public class Employee {

    private int eno;
    private String name;
    private int sal;
    
    public void disp(){
      
    }
    
    public Employee(){
        disp();
    }
    
    public Employee(int x, String y){   //initializing eno,name
        this(); //calling a zero arg constructor
        eno=x;
        name=y;
    }   
    
                    //111        AAA    50000    
    public Employee(int a, String b, int c){ //needs to intialize eno,name and sal
        //eno=a; name=b;    //its a repeatation (we all ready have a constructor to initialize eno,name
        //call the two arg constructor for intialization
        //a constructor can call another constructor using this keyword.
        this(a,b);  //calling a constructor with two args (int,String)
        sal=c;
    }
    public void show(){
        System.out.println(eno+","+name+","+sal);
    }
    public static void main(String[] args) {

     Employee ob1=new Employee(111,"AAA",50000);
     Employee ob2=new Employee(112,"BBB");
     ob1.show();
     ob2.show();
        
    }
}
/*
    Some points to take care while using this keyword for invoking a constructor    
    ---------------------------------------------------------------------------------
    1) this must be the first statement of constructor.
    2) you cant call more than one cosntructor directly.
    3) chaining is allowed.
    4) matching constructor must exists.
    5) recursive calls are not allowed
    6) only a constructor can call another constructor,
          
          (one method cant call a constructor)
          but
          (constructor can call a method)




*/