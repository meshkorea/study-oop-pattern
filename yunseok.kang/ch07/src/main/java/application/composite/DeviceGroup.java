package application.composite;

import java.util.stream.Collectors;

public class DeviceGroup extends Device {

    @Override
    public boolean canContain(Device device) {
        return true;
    }

    public void turnOn() {
        devices.forEach(Device::turnOn);
        System.out.println("Turned on: " + getDeviceNames());
    }

    public void turnOff() {
        devices.forEach(Device::turnOff);
        System.out.println("Turned off: " + getDeviceNames());
    }

    private String getDeviceNames() {
        return devices.stream()
                .map(d -> d.getClass().getSimpleName())
                .collect(Collectors.joining(","));
    }
}
