package me.rootsong.designpatterns._02_factory_method._03_java;

import me.rootsong.designpatterns._02_factory_method._02_after.BlackShip;
import me.rootsong.designpatterns._02_factory_method._02_after.WhiteShip;

public class SimpleFactory {
    
    public Object createProduct(String name) {
        if (name.equals("whiteShip")) {
            return new WhiteShip();
        } else if (name.equals("blackShip")) {
            return new BlackShip();
        }
    
        throw new IllegalArgumentException();
    }
}




