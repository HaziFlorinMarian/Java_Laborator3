package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Network {
    List<Node> nodes = new ArrayList<>();

    /**
     * Inseerting nodes into nodes list and also sort list after each inseration.
     * @param node
     */
    public void addNode(Node node) {
        this.nodes.add(node);
        this.nodes.sort(Node::compare);
    }

    public void printNetwork() {
        for (Node n : nodes) {
            System.out.println(n);
        }
    }

    /**
     * Because we're inserting anonymous Nodes, we're identifying them using their names.
     * @param firstNodeName
     * @param secondNodeName
     * @param value Distance between nodes.
     */
    public void addCostBetweenNodes(String firstNodeName, String secondNodeName, int value) {
        for (Node curNode : nodes) {
            if (curNode.getName().equals(firstNodeName)) {
                for (Node neighbourNode : nodes) {
                    if (neighbourNode.getName().equals(secondNodeName)) {
                        curNode.setCost(neighbourNode, value);
                    }
                }
            }
            else if (curNode.getName().equals(secondNodeName)) {
                for (Node neighbourNode : nodes) {
                    if (neighbourNode.getName().equals(firstNodeName)) {
                        curNode.setCost(neighbourNode, value);
                    }
                }
            }
        }
    }

    public void printIdentifiableNodes() {
        List<Node> tmpList = new ArrayList<>();

        for (Node curNode : nodes) {
            if (curNode instanceof Identifiable) {
                tmpList.add(curNode);
            }
        }

        /**
         * Lambda function
         */
        tmpList.sort((Node n1, Node n2) -> {
            return ((Identifiable) n1).getIpAddress().compareTo(((Identifiable) n2).getIpAddress());
        });

        System.out.println("=== IDENTIFIABLE NODES ===");
        for (Node curNode : tmpList) {
            System.out.println(curNode.getName() + " -> " + ((Identifiable) curNode).getIpAddress());
        }
    }
}
