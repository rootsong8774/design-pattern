package me.rootsong.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class Client {
    
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "sgh8774@naver.com");
        client.print(new BlackShipFactory(), "blackShip", "sgh8774@gmail.com");
        
    }
    
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name,email));
    }
}
