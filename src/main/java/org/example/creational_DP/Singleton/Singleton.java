package org.example.creational_DP.Singleton;

public class Singleton {

    public static volatile Singleton instance;
    private String something;

    private Singleton(String something) {
        this.something = something;
    }

    public static Singleton getInstance(String something){
        Singleton result = instance;
        if (result == null){
            synchronized (Singleton.class) {
                result = instance;
                if (result == null){
                    instance = result = new Singleton(something);
                }
            }
        }
        return result;
    }

    // this implementation is not thread safe
    /*public static Singleton getInstance(String something){
        if (instance == null)
            instance = new Singleton(something);

        return instance;
    }*/
}
