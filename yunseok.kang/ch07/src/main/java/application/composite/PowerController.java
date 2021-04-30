package application.composite;

public class PowerController {

    public void turnOn(Long deviceId) {
        Device device = findDeviceById(deviceId);
        device.turnOn();
    }

    public Device findDeviceById(Long deviceId) {
        return new Aircon();
    }
}