
public class Test {

    public void company(){
        System.out.println("SSI Indore");
        System.out.println("Bhanwarkuan Indore");
    }
    
    public void info(){
        company();
        System.out.println("Computer Education");
        System.out.println("Online / Offline Classes");
    }
    
    public static void main(String[] args) {
        Test ob=new Test();
        ob.info();
        
    }
}
