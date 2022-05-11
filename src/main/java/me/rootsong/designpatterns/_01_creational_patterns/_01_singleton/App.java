package me.rootsong.designpatterns._01_creational_patterns._01_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    
    public static void main(String[] args)
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings4 settings = Settings4.getInstance();
        
        Constructor<Settings4> constructor = Settings4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings4 settings1 = constructor.newInstance();
        
//        Settings4 settings04 =null;
//
//        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings4.obj"))){
//            out.writeObject(settings1);
//        }
//
//        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings4.obj"))){
//            settings1 = (Settings4) in.readObject();
//        }
        
        System.out.println(settings == settings1);
    
    }
    
}
