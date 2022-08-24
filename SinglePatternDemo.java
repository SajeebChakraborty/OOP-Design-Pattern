public class SinglePatternDemo {

   
    private static SinglePatternDemo instance = new SinglePatternDemo();
 
  
    private SinglePatternDemo(){}
 
    public static SinglePatternDemo getInstance(){
       return instance;
    }
 
    public void showMessage(){
       System.out.println("It is Singletone Pattern!");
    }
 }