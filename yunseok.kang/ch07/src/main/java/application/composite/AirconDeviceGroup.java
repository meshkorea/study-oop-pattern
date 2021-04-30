package application.composite;

public class AirconDeviceGroup extends DeviceGroup {

    @Override
    public boolean canContain(Device device) {
        return (device instanceof Aircon);
    }
}