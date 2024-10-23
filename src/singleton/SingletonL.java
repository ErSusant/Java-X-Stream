package singleton;

public class SingletonL {

static SingletonL s=null;   //Lazy Initialization

private SingletonL(){}

    static SingletonL getInstance(){
    if(s==null){
        s=new SingletonL();
    }
    return s;
    }
}
class Lazy{
    public static void main(String[] args) {
        SingletonL instance = SingletonL.getInstance();
        System.out.println(instance.hashCode());

        SingletonL instance1 = SingletonL.getInstance();
        System.out.println(instance1.hashCode());

    }
}
