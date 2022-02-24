public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro(0,0,70,100,0,4,"Volksvagem");
              carro.abastecer(1, 10);
              carro.acelerar(10);
              System.out.println(carro.getVolume_combustivel());
            
        /*
        private double quilometragem;
        private double volume_combustivel;
        private double capacidade_tanque;
        private double velMaxima;
        private double velAtual;
        private double consumoMedio;
        private String nome;
        */
    } 
}
