public class MainVeiculo {
    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.acelerar(200);
        bicicleta.frear(false);
        bicicleta.obterVelocidade();

        System.out.println("");

        CarroVei carroVei = new CarroVei();
        carroVei.acelerar(532);
        carroVei.frear(false);
        carroVei.obterVelocidade();
    }
}

