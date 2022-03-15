package compulsory;

public class Main {

    public static void main(String[] args) {
	    Network n = new Network();

        n.addNode(new Computer("127.0.0.2", 1000, "v1", "02:00:00:00:02", "Bucharest"));
        n.addNode(new Switch("v2", "02:00:00:00:03", "Buzau"));
        n.addNode(new Router("192.168.0.1", "v3", "02:00:00:00:04", "Bucharest"));
        n.addNode(new Switch("v4", "02:00:00:00:05", "Roman"));
        n.addNode(new Router("192.168.0.2", "v5", "02:00:00:00:06", "Bucharest"));
        n.addNode(new Computer("127.0.0.1", 1000, "v6", "02:00:00:00:07", "Iasi"));

        n.addCostBetweenNodes("v1", "v2", 10);
        n.addCostBetweenNodes("v1", "v3", 50);
        n.addCostBetweenNodes("v2", "v3", 20);
        n.addCostBetweenNodes("v2", "v4", 20);
        n.addCostBetweenNodes("v2", "v5", 20);
        n.addCostBetweenNodes("v3", "v4", 10);
        n.addCostBetweenNodes("v4", "v5", 30);
        n.addCostBetweenNodes("v4", "v6", 10);
        n.addCostBetweenNodes("v5", "v6", 20);
        n.printNetwork();

        n.printIdentifiableNodes();

        Algorithm pb = new Algorithm(n.nodes, n.nodes.get(0));
        pb.getShortestPath();
        pb.displayShortestPath();
    }
}
