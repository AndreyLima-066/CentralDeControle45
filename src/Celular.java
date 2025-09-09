public class Celular {
    // Celular é um DispositivoDeMidia (Herença).
    public class Celular extends DispositivosDeMidia {

        private String musicaAtual;
        private String artista;

        public Celular(String nome, String musica, String artista) {
            // Chamando o construtor de classe mãe.
            super(nome);
            this.musicaAtual = musica;
            this.artista = artista;
        }

        @Override //sobreescreve o metodo que herdou da classe mae
        public void reproduzir() {
            System.out.println("O " + this.nomeDoDispositivo + " está tocando a música: '" + this.musicaAtual + "' de " + this.artista + ".");
        }
    }
}
