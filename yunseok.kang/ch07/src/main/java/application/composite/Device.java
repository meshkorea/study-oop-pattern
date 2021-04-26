package application.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Device {

    protected List<Device> devices = new ArrayList<>();

    public boolean canContain(Device device) {
        // Composite class에서 추가가 필요하면 이 method를 override한다
        // addDevice() 에서 canContain() 을 호출하기 때문에, addDevice() 는 override가 필요 없을수도 있다
        return false;
    }

    public void addDevice(Device device) {
        if (!this.canContain(device)) {
            System.out.println("Device: " + device.getClass().getSimpleName() + " cannot be added to: " + this.getClass().getSimpleName());
            return;
        }
        devices.add(device);
        System.out.println("Added device: " + device.getClass().getSimpleName() + " to: " + this.getClass().getSimpleName());
    }

    public void removeDevice(Device device) {
        // removeDevice()는 그냥 여기서 구현해도 괜찮지 않을까?
        devices.remove(device);
        System.out.println("Removed device: " + device.getClass().getSimpleName() + " from: " + this.getClass().getSimpleName());
    }

    abstract void turnOn();
    abstract void turnOff();
}