package teste;

import com.google.gson.Gson;
import consumidor.ConsumirWS;
import javax.swing.JOptionPane;
import entidade.Viagem;
import java.util.ArrayList;
import modelo.OriginDestination;
import util.EnumAeroporto;
import util.LerArquivo;

/**
 *
 * @author Vicente
 */
public class TestarSoftware {
    
    public static void main(String[] args) throws Exception {
        
//        String arquivo = "flight-search-cache-origin-destination.csv";
//        ArrayList<OriginDestination> origensDestinos = new ArrayList<>();
//        origensDestinos = new LerArquivo().recuperar(arquivo);
        
        ConsumirWS cWS = new ConsumirWS();

        String key = "apikey=" + JOptionPane.showInputDialog("Informe a key");
        String origin = "&origin=" + EnumAeroporto.GYN;
        String destination = "&destination=" + EnumAeroporto.BSB;
        String departureDate = "&departure_date=2018-06-25";
        String returnDate = "&return_date=2018-06-26";
        String search = origin + destination + departureDate + returnDate;

        System.out.println("Testing 1 - Send Http GET request");
        try {
            String json = cWS.sendGet(search, key);
            Gson gson = new Gson();
            Viagem v = gson.fromJson(json, Viagem.class);
            
            System.out.println("json" + json);
            
            
//            for (int i = 0; i < v.getResults().size(); i++) {
//                System.out.println("Companhia Aérea: " + v.getResults().get(i).getItineraries().get(0).getInbound().getFlights().get(0).getDepartsAt());
////                System.out.println("Destino: " + v.getResultados().get(i).getDestination());
////                System.out.println("Valor: " + v.getResultados().get(i).getPrice());
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Mensagem: " + e.getMessage() + "\nCausa: " + e.getCause() + "\nCausa: " + e.getSuppressed());
        }
    }
    
}