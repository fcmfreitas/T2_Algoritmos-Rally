public class Carro {
    int distancia_dia;
    int distancia_percorrida;

    public Carro(int distancia_dia) {
        this.distancia_dia = distancia_dia;
        this.distancia_percorrida = 0;
    }

    public int getDistancia_dia() {
        return distancia_dia;
    }

    public int getDistancia_percorrida() {
        return distancia_percorrida;
    }

    public void percorrer(int distancia) {
        this.distancia_percorrida = distancia;
    }
}
