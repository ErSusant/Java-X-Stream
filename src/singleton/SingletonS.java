package singleton;

public class SingletonS {
    static SingletonS s=null;
    private SingletonS(){}

    static SingletonS getInstance(){
         synchronized (SingletonS.class){
             if(s==null){
                 s=new SingletonS();
             }
         }
         return s;
    }
}

class Synchronisation{

    public static void main(String[] args) {
        SingletonS instance = SingletonS.getInstance();
        System.out.println(instance.hashCode());

        SingletonS instance1 = SingletonS.getInstance();
        System.out.println(instance1.hashCode());
    }
}
