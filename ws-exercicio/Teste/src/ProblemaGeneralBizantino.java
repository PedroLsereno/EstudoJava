import java.util.HashMap;
import java.util.Map;

public class ProblemaGeneralBizantino {

    public static void main(String[] args) {
        // Simulando 4 generais, onde o General 3 é um traidor
        General general1 = new General(1, false, "atacar");
        General general2 = new General(2, false, "atacar");
        General general3 = new General(3, true, "atacar"); // traidor
        General general4 = new General(4, false, "atacar");  

        General[] generals = { general1, general2, general3, general4 };

       
        Map<Integer, String> ordems = new HashMap<>(); 

        // Simulando a troca de mensagens entre os generais
        for (General general : generals) {
            String enviarOrdem = general.enviarOrdem();
            System.out.println("General " + general.getId() + " enviou: " + enviarOrdem);
            ordems.put(general.getId(), enviarOrdem);
        }

        // Decidir com base na maioria das mensagens
        int ContAtacar = 0;
        int ContRecuar = 0;

        for (Map.Entry<Integer, String> x : ordems.entrySet()) {
            if (x.getValue().equals("atacar")) {
            	ContAtacar++;
            } else {
            	ContRecuar++;
            }
        }

        if (ContAtacar > ContRecuar) {
            System.out.println("Decisão final: Atacar.");
        } else {
            System.out.println("Decisão final: Recuar.");
        }
    }

}
