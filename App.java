public class App {
    public static void main(String[] args) {
        
        System.out.println("\n--- Rally 1: Rally 500km, carro com autonomia de 100km/dia ---");
        Carro carro1 = new Carro(100);
        long startTime1 = System.currentTimeMillis();
        Rally rally1 = new Rally(carro1, 500);
        System.out.println(rally1.printRally());
        rally1.SimularRally(carro1);
        long endTime1 = System.currentTimeMillis();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("Distância final percorrida: " + carro1.getDistancia_percorrida() + " km");
        System.out.println("Tempo de execução: " + totalTime1 + " ms");
        
        System.out.println("\n--- Rally 800km, carro com autonomia de 50km/dia ---");
        Carro carro2 = new Carro(50);
        long startTime3 = System.currentTimeMillis();
        Rally rally2 = new Rally(carro2, 800);
        System.out.println(rally2.printRally());
        rally2.SimularRally(carro2);
        long endTime3 = System.currentTimeMillis();
        long totalTime3 = endTime3 - startTime3;
        System.out.println("Distância final percorrida: " + carro2.getDistancia_percorrida() + " km");
        System.out.println("Tempo de execução: " + totalTime3 + " ms");
    }
}