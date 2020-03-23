public class EngStudent extends Student {
    String branch;
    int sem;
    
    public void setEngData(String a, int b){
        branch=a; sem=b;
    }
    public void showEngData(){
        System.out.println(branch+","+sem);
    }
    
    public static void main(String args[]){
        EngStudent s=new EngStudent();
        s.setPersonalData(111, "AAA");
        s.setEngData("CS", 3);
        s.showPersonalData();
        s.showEngData();
    }
    
}
