package me.rootsong.designpatterns._01_creational_patterns._01_singleton;

import java.io.Serializable;

public class Settings4 implements Serializable {
    
    
    private Settings4() {}
    
    private static class SettingsHolder {
        private static final Settings4 INSTANCE = new Settings4();
    }
    
    public static Settings4 getInstance() {
       return SettingsHolder.INSTANCE;
    }
    
    protected Object readResolve() {
        return getInstance();
    }
}
