public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro(0,50,70,210,0,45,4);
              System.out.println(carro.getVelAtual());
              carro.acelerar(2);
              System.out.println(carro.getVelAtual());
              System.out.println(carro.getVolume_combustivel());
        /*
        private double quilometragem;
        private double volume_combustivel;
        private double capacidade_tanque;
        private double velMaxima;
        private double velAtual;
        private double aceleracaoMedia;
        private double consumoMedio;
        */
    } 
}
