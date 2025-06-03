public class App {
    public static void main(String[] args) {
        Carro carro = new Carro(100); 
        Rally rally = new Rally(carro, 500);

        System.out.println(rally.printRally());

        rally.SimularRally(carro);
    }
}
