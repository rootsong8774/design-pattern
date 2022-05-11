package me.rootsong.designpatterns;

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