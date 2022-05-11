package me.rootsong.designpatterns._01_creational_patterns._03_abstract_factory._01_example;

public class WhiteShipPartsProFactory implements ShipPartsFactory{
    
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }
    
    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
