package application.composite;

public class App {

    public static void main(String[] args) {
        Device aircon1 = new Aircon();
        Device aircon2 = new Aircon();
        Device heater = new Heater();

        Device aircons = new AirconDeviceGroup();

        // 히터는 에어컨 그룹에 추가 되면 안 됨
        aircons.addDevice(heater);

        // 에이컨 그룹에 에어컨 정상적으로 추가
        aircons.addDevice(aircon1);
        aircons.addDevice(aircon2);

        // 에어컨에 다른 component가 추가가 되면 안 됨
        aircon1.addDevice(heater);

        // 한번에 에어컨 여러개 turn off
        aircons.turnOff();
    }
}
