package exercicios;

import java.util.HashMap;
import java.util.Map;

public class MapaDeVeiculos {

    public static void main(String[] args) {
        // 1. Criar um mapa para armazenar as marcas e modelos de veículos
        Map<String, String> veiculos = new HashMap<>();

        // 2. Inserir dados no mapa (Marca -> Modelo)
        veiculos.put("Volkswagen", "Gol");
        veiculos.put("Ford", "Ka");
        veiculos.put("Chevrolet", "Onix");
        veiculos.put("Fiat", "Argo");
        veiculos.put("Toyota", "Corolla");
        veiculos.put("Honda", "Civic");

        // 3. Percorrer o mapa e imprimir a chave (Marca) e o valor (Modelo)
        System.out.println("--- Lista de Veículos ---");
        for (Map.Entry<String, String> entry : veiculos.entrySet()) {
            String marca = entry.getKey();
            String modelo = entry.getValue();
            System.out.println("Marca: " + marca + ", Modelo: " + modelo);
        }
    }
}