
public class TEmp extends Emp {

     public void processSalary(){
        //logic for processing the salary of Temporary Employees
        System.out.println("Processing Salary For Temporary Employees : ");
        System.out.println("HRA : "+(basic*10/100));
        System.out.println("MA  : "+(basic*5/100));
    }
    public static void main(String[] args) {
        TEmp e=new TEmp();
        e.setInfo(112, "BBB", 5000);
        e.showInfo();
        e.processSalary();
    }
}
