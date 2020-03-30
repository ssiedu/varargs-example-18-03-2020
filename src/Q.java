public class Q extends P {
    
    public Q(){
        super(10);//calling the one-int arg constructor of parent class.
        System.out.println("Q-0-Arg");
    }
    public Q(int x){
        super(1,2);
        System.out.println("Q-1-Arg");
    }
    public Q(int x, int y){
        System.out.println("Q-2-Arg");
    }
    public static void main(String args[]){
        //Q ob=new Q();   //zero-args
        Q ob=new Q(10);     //one-arg
        //Q ob=new Q(10,20);
    }
    
}
