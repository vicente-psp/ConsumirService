package util;

import java.io.BufferedReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import modelo.OriginDestination;
import util.EnumAeroporto;

/**
 *
 * @author Vicente
 */
public class LerArquivo {

//    String arquivo = diretorio + "flight-search-cache-origin-destination.csv.csv";

    public ArrayList<OriginDestination> recuperar(String arquivo) throws Exception {
//        arquivo = "/arquivo/" + arquivo;
        arquivo = "C:\\Users\\Vicente\\Desktop\\JAVA\\ConsumirService\\src\\arquivo\\" + arquivo;
        ArrayList<OriginDestination> lista = new ArrayList<>();

        try {
            File file = new File(arquivo);
            if (!file.exists()) {
                return null;
            }
            BufferedReader br;
            try (FileReader fr = new FileReader(file)) {
                br = new BufferedReader(fr);
                String linha = br.readLine();
                while (linha != null && !linha.equals("")) {
                    OriginDestination originDestination = new OriginDestination();
                    
                    String vetor[] = linha.split(",");
                    originDestination.setMoeda(vetor[0]);
                    originDestination.setOrigem(vetor[1]);
                    originDestination.setDestino(vetor[2]);
                    
                    lista.add(originDestination);
                    linha = br.readLine();
                }
            }
            br.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar aeroportos");
        }
        return lista;
    }
}