public class Carro {
    private double quilometragem;
    private double volume_combustivel;
    private double capacidade_tanque;
    private double velMaxima;
    private double velAtual;
    private double consumoMedio;
    private String nome;

    Carro(double quilometragem, double volume_combustivel,double capacidade_tanque, double velMaxima, double velAtual, double consumoMedio, String nome){
        setQuilometragem(quilometragem);
        setVolume_combustivel(volume_combustivel);
        setCapacidade_tanque(capacidade_tanque);
        setVelMaxima(velMaxima);
        setVelAtual(velAtual);
        setConsumoMedio(consumoMedio);
        setNome(nome);
    }

    public double getQuilometragem() {
        return this.quilometragem;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void acelerar(double tempo)throws Exception{
        
        if(this.volume_combustivel > 0){
            double aceleracaoMedia = ((this.velMaxima - this.velAtual)/tempo) * 3.6;
            double acelerar = 0;
            double distancia;
            for(int i = 0; i < tempo; i++){
                acelerar+=aceleracaoMedia;
                if(acelerar > this.velMaxima){
                    acelerar = this.velMaxima;
                    setVelAtual(acelerar);
                    break;
                }
            }
            distancia = this.velAtual * tempo;
            double combustivel_gasto = (distancia * this.consumoMedio) / 1000;
            setVolume_combustivel(this.volume_combustivel - combustivel_gasto);
            System.out.printf("Distância percorrida: %.0fm\n",distancia);
            System.out.printf("Combustível gasto: %.2fl\n",combustivel_gasto);

        
        }else{
            System.out.println("Veículo sem gasolina!");
        }
    }

    public void frear(double tempo){
        
    }
}
