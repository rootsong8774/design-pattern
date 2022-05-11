package me.rootsong.designpatterns._01_creational_patterns._03_abstract_factory._01_example;

import me.rootsong.designpatterns._01_creational_patterns._02_factory_method._02_after.DefaultShipFactory;
import me.rootsong.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.rootsong.designpatterns._01_creational_patterns._02_factory_method._02_after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {
    
    private final ShipPartsFactory shipPartsFactory;
    
    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }
    
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
