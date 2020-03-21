public class Demo {
    private int x, y;
    
    public Demo(int a, int b){x=a; y=b;}
    public void show(){System.out.println(x+","+y);}
    
    public static void main(String args[]){
        
        Demo d1;            //we are declaring a reference only
        new Demo(10,20);    //we are creating an object but no reference is taken to store object
        Demo d2=new Demo(30,40);    //we are declaring a reference and creating an object also.
        Demo d3=d2;     //now d2 and d3 points to same object
        d1=d2;
        d1.show();
        d2.show();
        d3.show();
        
        d3=new Demo(50,60); //we have assigned the address of new object to existing ref d3
                            //the address already stored by d3 will be overridden.
        System.out.println("______________________________________________");
        d1.show();
        d2.show();
        d3.show();
        
    }
}
