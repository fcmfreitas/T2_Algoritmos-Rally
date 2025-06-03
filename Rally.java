import java.util.ArrayList;
import java.util.Random;

public class Rally {
    int distancia;
    int ponteiro = 0;
    ArrayList<Parada> pontos_parada;

    public Rally(Carro carro, int distancia) {
        this.distancia = distancia;
        this.pontos_parada = new ArrayList<>();
        Random rand = new Random();

        int distanciaDia = carro.getDistancia_dia();
        int ultimoPonto = 0;

        while (ultimoPonto < distancia) {
            int proximoLimite = Math.min(ultimoPonto + distanciaDia, distancia);
            int proximaDistancia = ultimoPonto + rand.nextInt(proximoLimite - ultimoPonto + 1);
            Parada parada = new Parada(proximaDistancia);
            pontos_parada.add(parada);
            ultimoPonto = proximaDistancia;
        }
    }

    public String printRally() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rally com distância total de ").append(distancia).append(" km:\n");
        sb.append("Pontos de parada: ");
        for (Parada parada : pontos_parada) {
            sb.append(parada.distancia).append(" km, ");
        }
        return sb.toString();
    }

    public Parada melhorParada(Carro carro){
        int melhorDistancia = 0;
        Parada melhorParada = null;
        int ponto_atual = carro.getDistancia_percorrida();
        
        while(ponteiro < pontos_parada.size()) {
            if((pontos_parada.get(ponteiro).distancia > ponto_atual) && (pontos_parada.get(ponteiro).distancia - ponto_atual <= carro.getDistancia_dia() ) ){
                melhorDistancia = pontos_parada.get(ponteiro).getDistancia();
                melhorParada = pontos_parada.get(ponteiro);
            } else if (pontos_parada.get(ponteiro).distancia > ponto_atual + carro.getDistancia_dia()) {
                break; 
            }
            ponteiro++;
        }

        carro.percorrer(melhorDistancia);
        melhorParada.estacionar(carro);

        return melhorParada;
    }

    public void SimularRally(Carro carro) {
        while (carro.getDistancia_percorrida() < distancia) {
            Parada parada = melhorParada(carro);
            if (parada != null) {
                System.out.println("Carro parou em " + parada.getDistancia() + " km.");
            } else {
                System.out.println("Nenhuma parada disponível para o carro.");
                break;
            }
            
        }
    }
    
}