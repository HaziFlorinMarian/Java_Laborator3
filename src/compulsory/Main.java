package compulsory;

public class Main {

    public static void main(String[] args) {
	    Network n = new Network();

        n.addNode(new Computer("192.168.0.2", 1000, "C_n1", "02:00:00:00:02", "Bucharest"));
        n.addNode(new Switch("S_n2", "02:00:00:00:03", "Buzau"));
        n.addNode(new Router("192.168.0.2", "R_n3", "02:00:00:00:04", "Bucharest"));
        n.addNode(new Switch("S_n3", "02:00:00:00:05", "Roman"));
        n.addNode(new Router("192.168.0.2", "C1", "02:00:00:00:06", "Bucharest"));
        n.addNode(new Computer("192.168.0.2", 1000, "C_n6", "02:00:00:00:07", "Iasi"));

        n.printNetwork();
    }
}
