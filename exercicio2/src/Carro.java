public class Carro {
    private double quilometragem;
    private double volume_combustivel;
    private double capacidade_tanque;
    private double velMaxima;
    private double velAtual;
    private double aceleracaoMedia;
    private double consumoMedio;

    Carro(double quilometragem, double volume_combustivel,double capacidade_tanque, double velMaxima, double velAtual, double aceleracaoMedia, double consumoMedio){
        setQuilometragem(quilometragem);
        setVolume_combustivel(volume_combustivel);
        setCapacidade_tanque(capacidade_tanque);
        setVelMaxima(velMaxima);
        setVelAtual(velAtual);
        setAceleracaoMedia(aceleracaoMedia);
        setConsumoMedio(consumoMedio);
    }

    public double getQuilometragem() {
        return this.quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getVolume_combustivel() {
        return this.volume_combustivel;
    }

    public void setVolume_combustivel(double volume_combustivel) {
        this.volume_combustivel = volume_combustivel;
    }

    public double getCapacidade_tanque() {
        return this.capacidade_tanque;
    }

    public void setCapacidade_tanque(double capacidade_tanque) {
        this.capacidade_tanque = capacidade_tanque;
    }

    public double getVelMaxima() {
        return this.velMaxima;
    }

    public void setVelMaxima(double velMaxima) {
        this.velMaxima = velMaxima;
    }

    public double getVelAtual() {
        return this.velAtual;
    }

    public void setVelAtual(double velAtual) {
        this.velAtual = velAtual;
    }

    public double getAceleracaoMedia() {
        return this.aceleracaoMedia;
    }

    public void setAceleracaoMedia(double aceleracaoMedia) {
        this.aceleracaoMedia = aceleracaoMedia;
    }

    public double getConsumoMedio() {
        return this.consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public void getVelocidadeAtual(){
        System.out.println(this.velAtual);
    }

    public void abastecer(double custo_litro, double valor_pago_frentista){
        double litros = valor_pago_frentista / custo_litro;
        double valor_abastecido = this.volume_combustivel + litros;

        if(valor_abastecido > this.capacidade_tanque){
            System.out.println("Capacidade máxima do volume do tanque ultrapassada!");
        }else{
            setVolume_combustivel(valor_abastecido);
            System.out.println("Veículo abastecido com sucesso !");
        }
    }

    public void acelerar(double tempo){
        double aceleracao = 0;
        
        System.out.format("Veículo acelerou por %.2f horas.\n",tempo);

        for (int i = 0; i < tempo; i++) {
            aceleracao += this.aceleracaoMedia;
        }
        aceleracao = aceleracao + this.velAtual;
        double distancia_percorrida = aceleracao * tempo;
        double gasolina_gasta = ((distancia_percorrida * this.aceleracaoMedia) - this.volume_combustivel)/1000;
        
        setVelAtual(aceleracao);
        setVolume_combustivel(gasolina_gasta);

    }

    public void frear(double tempo){
        double aceleracao = 0;
        for (int i = 0; i < tempo; i++) {
            aceleracao -= this.aceleracaoMedia;
        }
        aceleracao = aceleracao + this.velAtual;
        if(aceleracao < 0){
            System.out.println("A velocidade não pode ser inferior a 0 !");
        }else{
            setVelAtual(aceleracao);
        }
    }
}
