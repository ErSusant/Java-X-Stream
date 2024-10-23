package singleton;

public class SingletonE {

    static SingletonE s = new SingletonE();  //Creating Object at Class level at time like this

  private  SingletonE() {    // make constructor private for Singleton
    }

    static SingletonE getInstance() {
        return s;
    }
}
   class Eager{

        public static void main(String[] args) {
            SingletonE instance = SingletonE.getInstance();
            System.out.println(instance.hashCode());

            SingletonE instance1 = SingletonE.getInstance();
            System.out.println(instance1.hashCode());
        }
    }

