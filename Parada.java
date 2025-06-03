import java.util.ArrayList;

public class Parada {
    ArrayList<Carro> carros;
    int distancia;

    public Parada(int distancia) {
        this.distancia = distancia;
        this.carros = new ArrayList<>();
    }
    
    public int getDistancia() {
        return distancia;
    }

    public void estacionar(Carro carro) {
        carros.add(carro);
    }
}
