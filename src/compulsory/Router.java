package compulsory;

public class Router extends Node implements Identifiable {
    String ipAddr;

    public Router(String ipAddr, String name, String macAddr, String location) {
        super(name, macAddr, location);
        this.ipAddr = ipAddr;
    }

    public void setIpAddress(String ip) {
        this.ipAddr = ip;
    }

    public String getIpAddress() {
        return ipAddr;
    }

    @Override
    public String toString() {
        return "Router{" +
                "name='" + getName() + '\'' +
                ", macAddr='" + getMacAddr() + '\'' +
                ", location='" + getLocation() + '\'' +
                "ipAddr='" + ipAddr + '\'' +
                ", costs='" + printCosts() + '\'' +
                '}';
    }
}
