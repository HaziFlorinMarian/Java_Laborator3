package compulsory;

public class Node {
    public Node(String name, String macAddr, String location) {
        this.name = name;
        this.macAddr = macAddr;
        this.location = location;
    }

    private String name;
    private String macAddr;
    private String location;

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", macAddr='" + macAddr + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
