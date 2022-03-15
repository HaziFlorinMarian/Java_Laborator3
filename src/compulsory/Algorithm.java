package compulsory;

import java.util.*;

public class Algorithm {
    private Map<Node, Integer> dist = new HashMap<>();
    private Map<Node, Integer> prev = new HashMap<>();
    private PriorityQueue<Node> q = new PriorityQueue<>((Node n1, Node n2) -> {
        if (dist.get(n1) < dist.get(n2)) {
            return -1;
        }
        else if (dist.get(n1) > dist.get(n2)) {
            return 1;
        }

        return 0;
    });

    Algorithm(List<Node> nodes, Node source) {
        for (Node curNode : nodes) {
            dist.put(curNode, Integer.MAX_VALUE/2);
            prev.put(curNode, null);
            q.add(curNode);
        }

        dist.put(source, 0);
    }

    public void getShortestPath() {
        while (!q.isEmpty()) {
            Node u = q.poll();

            for (Map.Entry<Node, Integer> v : u.cost.entrySet()) {
                if (q.contains(v.getKey())) {
                    int alt = dist.get(u) + v.getValue();

                    if (alt < dist.get(v.getKey())) {
                        dist.put(v.getKey(), alt);
                        prev.put(v.getKey(), dist.get(u));
                    }
                }
            }
        }
    }

    public void displayShortestPath() {
        for (Map.Entry<Node, Integer> node : dist.entrySet()) {
            System.out.println(node.getKey().getName() + " -> " + node.getValue());
        }
    }
}
