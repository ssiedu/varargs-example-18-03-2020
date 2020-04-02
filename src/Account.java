public interface Account {
    public void openAccount();
    public void closeAccount();
    public void deposit();
    public void withdraw();
    public default void info(){
        System.out.println("Its a concrete method");
    }
}
/*
this interface is just a specification for creating a class for Account Management
specification of a class.

till 1.7 version java, interfaces cant have concrete methods and static methods.
but from 1.8 onwards we can write concrete method (But we need to put default keyword before its return type)
*/
