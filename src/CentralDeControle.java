public class CentralDeControle {
    public static void main(String[] args) {
        public class CentralDeControle {
            public static void main(String[] args) {

                //Este é nosso "botão play" polimórfico.
                //ele aceita qualquer objeto que seja um dispositivodeMidia.
                public void apertarPlay(DispositivoDeMidia dispositivo){
                    System.out.println("conectando ao dispositivo: "+ dispositivo.nomeDoDispositivo);
                    //O java se encarrega de chamar a versão CORRETA do metodo reproduzir(),
                    //dependendo da forma rela do objeto (TV, celular ou Rádio).
                    dispositivo.reproduzir();
                    System.out.println("-----");

                }

                public static void main(String[] args){
                    //criando a nossa central de controle
                    CentralDeControle controle = new CentralDeControle();


                    //Crinado os objetos com suas formas especificas
                    SmartTV tvdasala = new SmartTV("tv da sala" ,"matrix");
                    Celular meucelular = new Celular("iphone 15", "staiway to heaven" , "led zeppelin");
                    RadioAutomotivo radioDocarro = new radioAutomotivo("radio dp carro ", 98,0);
                }
                //usando o polimorfismo;
                //o mesmo metodo 'apertarPLAY' é CHAMADO com objetos de tipos diferentes,
                //e cada um se comporta de sua própria maneira.
                controle.apertarPlay(tvDasala);
                controle.apertarPlay(meuCelular);
                controle.apertarPlay(radioDoCarro);

                System.out.println("\n---demosntração com uma lista de dispositivos ---");


                //criando uma lista que pode guardar qualquer dispositivodemidia
                DispositivoDeMidia[] meusDipositivos = {tvDasala, meuCelular, radioDoCarro};

                //usnado o for-each para apertar o play em todos os dispositivos da lista.
                for( DispositivosDeMidia dispotivos : meusDispositivios ) {
                    //A cada volta, o java idenftifica a forma e chama o metodo certo
                    dispotivos.reproduzir();
                }


            }
        }

    }
}