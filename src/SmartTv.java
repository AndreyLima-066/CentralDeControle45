public class SmartTv {
    // smartTV É UM DispositivoDeMidia (Herença).
    public class SmartTV extends DispositivosDeMidia {

        private String filmeAtual;

        public SmartTV(String nome, String filme) {
            // 'super(nome)' chama o construtor da classe mãe (DispositivoDeMidia).
            super(nome);
            this.filmeAtual = filme;
        }

        // A anotação @Override indica que estamos cumprindo o "contrato"
        // e implementando o metodo abstrato da classe mãe.
        @Override
        public void reproduzir() {
            System.out.println("A " + this.nomeDoDispositivo + " está reproduzindo o filme: '" + this.filmeAtual + "' em 4K.");
        }
    }
}
