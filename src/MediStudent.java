public class MediStudent extends Student {
    int prof;
    
     public void result(int marks){
        if(marks>=50){
            System.out.println("Medi Student Pass");
        }else{
            System.out.println("Medi Student Fail");
        }
    }
    public void setMediData(int a){
        prof=a;
    }
    public void showMediData(){
        System.out.println(prof);
    }
    public static void main(String args[]){
        MediStudent s=new MediStudent();
        s.setPersonalData(1001,"XYZ");
        s.setMediData(5);
        s.showPersonalData();
        s.showMediData();
        s.result(48);
    }
}
