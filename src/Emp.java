public abstract class Emp {
    int eno;
    String ename;
    int basic;
    
    public abstract void processSalary();
            
    public void setInfo(int a, String b, int c){
        eno=a; ename=b; basic=c;
    }
    public void showInfo(){
        System.out.println(eno+","+ename+","+basic);
    }
}
