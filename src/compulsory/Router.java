package compulsory;

public class Router extends Node implements Identifiable {
    String ipAddr;

    public void setIpAddress(String ip) {
        this.ipAddr = ip;
    }

    public String getIpAddress() {
        return ipAddr;
    }

    public Router(String name, String macAddr, String location, String ipAddr) {
        super(name, macAddr, location);
        this.ipAddr = ipAddr;
    }
}
