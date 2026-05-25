package org.example;

 // Approach 1
//class Singleton {
//    private static volatile Singleton singleton ;
//    private Singleton() {
//    }
//    static  Singleton  getInstance() {
//        try {
//
//            synchronized(Singleton.class) {
//                if (null == singleton) {
//                    singleton = new Singleton();
//                    throw new Exception("intentions testing");
//                }
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println("exception is : " + e.getMessage());
//        }
//        return singleton;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
////        try {
//            Singleton s1 = Singleton.getInstance();
//            System.out.println(s1);
//            Singleton s2 = Singleton.getInstance();
//            System.out.println(s2);
////        }
////        catch (Exception e) {
////            System.out.println("Exception caught in main(): " + e.getMessage());
////        }
//    }
//}

class Singleton {
    private Singleton() {}

    // Inner class is loaded ONLY when getInstance() is first called
    // JVM guarantees class loading is thread-safe — no synchronized needed!
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

public class Main {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        System.out.println("s1 : " + s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println("s2 : " + s2);

    }


}
