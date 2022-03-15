package compulsory;

public class Switch extends Node {
    @Override
    public String toString() {
        return "Switch{" +
                "name='" + getName() + '\'' +
                ", macAddr='" + getMacAddr() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", costs='" + printCosts() + '\'' +
                '}';
    }

    public Switch(String name, String macAddr, String location) {
        super(name, macAddr, location);
    }
}
