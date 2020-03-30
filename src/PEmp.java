public class PEmp extends Emp {
    
    public void processSalary(){
        //logic for processing the salary of Permanent Employees
        System.out.println("Processing Salary For Permanent Employees : ");
        System.out.println("HRA : "+(basic*20/100));
        System.out.println("MA  : "+(basic*10/100));
    }
    
    
    public static void main(String args[]){
        PEmp e=new PEmp();
        e.setInfo(111, "AAA", 10000);
        e.showInfo();
        e.processSalary();
    }

}
