package compulsory;

public class Computer extends Node implements Storage, Identifiable {
    String ipAddr;
    int capacity;

    public Computer(String ipAddr, int capacity, String name, String macAddr, String location) {
        super(name, macAddr, location);
        this.ipAddr = ipAddr;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + getName() + '\'' +
                ", macAddr='" + getMacAddr() + '\'' +
                ", location='" + getLocation() + '\'' +
                "ipAddr='" + ipAddr + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public void setIpAddress(String ip) {
        ipAddr = ip;
    }

    public String getIpAddress() {
        return ipAddr;
    }

    public void setCapacity(int x) {
        capacity = x;
    }

    public int getCapacity() {
        return capacity;
    }
}
