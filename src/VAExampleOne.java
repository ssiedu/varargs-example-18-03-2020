
public class VAExampleOne {

    public static void add(){
        System.out.println("Nothing To Add");
    }
    public static void add(int x, int y){
        System.out.println("SUM = "+(x+y));
    }
    
    //this method is having a parameter of type String-varargs
    public static void add(String...v){
        String s="";
        for(String tmp:v){
            s=s+tmp;
        }
        System.out.println(s);
    }
    //this method is having a parameter of type int-varargs
    public static void add(int...v){    
        int sum=0;
        for(int num:v){
            sum=sum+num;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add();
        add(10,20); //this call is matching with 2 (1. int varargs, 2. 2 int args x and y)
        //preference is always given to exact match.
        add(10,20,30);  //{10,20,30}
        add(10,20,30,40);
        add("ab","cd"); //{"aa","bb"}
        add("ab","cd","ef");
        
    }

}
/*
    1. Only one varargs per method.
    2. normal parameters are perfectly valid with varargs.
    3. varargs must be always on last position.
    4. vararsg methods can be overloaded








*/