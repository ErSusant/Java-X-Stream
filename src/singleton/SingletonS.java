package singleton;

public class SingletonS {
    static SingletonS s = null;
    // A static variable 's' of type SingletonS is declared and initialized to null.
    // This variable will hold the instance of the Singleton class.

    private SingletonS(){}
    // The constructor is private to prevent other classes from creating a new instance of SingletonS.
    // This ensures that only one instance of this class can be created.

    static SingletonS getInstance(){
        synchronized (SingletonS.class){
            // The synchronized block ensures that only one thread can access this block of code at a time.
            // This is crucial in a multithreaded environment to avoid creating multiple instances.

            if(s == null){
                // Checks if the instance 's' is null, meaning no instance of SingletonS has been created yet.

                s = new SingletonS();
                // If 's' is null, a new instance of SingletonS is created and assigned to 's'.
            }
        }
        return s;
        // The singleton instance is returned. If it was already created, the existing instance is returned.
    }
}

class Synchronisation {
    public static void main(String[] args) {
        SingletonS instance = SingletonS.getInstance();
        // Calls the getInstance() method to get the singleton instance of SingletonS.
        // If it's the first call, a new instance will be created.

        System.out.println(instance.hashCode());
        // Prints the hash code of the singleton instance. This will identify the memory address of the object.

        SingletonS instance1 = SingletonS.getInstance();
        // Calls getInstance() again, but since an instance already exists, it will return the same object.

        System.out.println(instance1.hashCode());
        // Prints the hash code of the second call. This should be the same as the first one, indicating the same instance is returned.
    }
}