package me.rootsong.designpatterns._01_creational_patterns._03_abstract_factory._01_example;

import me.rootsong.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.rootsong.designpatterns._01_creational_patterns._02_factory_method._02_after.ShipFactory;

public class ShipInventory {
    
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getWheel().getClass());
        System.out.println(ship.getAnchor().getClass());
    }
}
