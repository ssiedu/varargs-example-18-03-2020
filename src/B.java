public class B extends A{
    
    //overriding the add method of A
    public void add(){
        
    }
    
    public void show(){ 
        System.out.println("Welcome From Show Of B");
    }
    public static void main(String args[]){
        B ob=new B();
        ob.show();
    }
}
