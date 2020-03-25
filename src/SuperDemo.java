class X {           //parent
    int data=100;
    void info(){
        System.out.println("Info of X");
    }
    
}
class Y extends X { //child
    int data=200;
    
   void info(){
    System.out.println("Info of Y");
   }
   
    void print(){
        super.info();
        //System.out.println(data);       //its own member
        //System.out.println(super.data); //member of parent class.
    }
    
}
public class SuperDemo {
    public static void main(String[] args) {
        Y ob=new Y();
        ob.print();
    }
}
