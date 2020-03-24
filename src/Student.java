public class Student {
    int rno;
    String name;
    
    public void result(int marks){
        if(marks>=33){
            System.out.println("Student Pass");
        }else{
            System.out.println("Student Fail");
        }
    }
    public void setPersonalData(int a, String b){
        rno=a; name=b;
    }
    public void showPersonalData(){
        System.out.println(rno+","+name);
    }
}
