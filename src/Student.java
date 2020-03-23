public class Student {
    int rno;
    String name;
    
    public void setPersonalData(int a, String b){
        rno=a; name=b;
    }
    public void showPersonalData(){
        System.out.println(rno+","+name);
    }
}
