package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Network {
    List<Node> nodes = new ArrayList<>();

    public void addNode(Node node) {
        this.nodes.add(node);
    }

    public void printNetwork() {
        for (Node n : nodes) {
            System.out.println(n);
        }
    }
}
