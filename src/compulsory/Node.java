package compulsory;

import java.util.HashMap;
import java.util.Map;

public class Node {
    public Node(String name, String macAddr, String location) {
        this.name = name;
        this.macAddr = macAddr;
        this.location = location;
    }

    private String name;
    private String macAddr;
    private String location;
    public Map<Node, Integer> cost = new HashMap<>();

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", macAddr='" + macAddr + '\'' +
                ", location='" + location + '\'' +
                ", costs='" + printCosts() + '\'' +
                '}';
    }

    public String printCosts() {
        StringBuilder output = new StringBuilder();

        for (Map.Entry<Node, Integer> entry : cost.entrySet()) {
            output.append(entry.getKey().getName() + "->" + entry.getValue() + "\t");
        }

        return output.toString();
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

    /**
     * This function behaves exactly as "strcmp" from C.
     * @param node other node which will be compared with current node.
     * @return Smaller, Greater or Equal to 0
     */
    public int compare(Node node) {
        if (node != null) {
            return this.name.compareTo(node.getName());
        }
        else {
            return 0;
        }
    }

    /**
     * Adding cost from current node to his neighbour.
     * @param node neighbour
     * @param value distance to neighbour
     */
    public void setCost(Node node, int value) {
        cost.put(node, value);
    }
}
