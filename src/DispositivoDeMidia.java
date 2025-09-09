public class DispositivoDeMidia {
    // esta é uma classe anstrata. ela serve como uma "contrato" ou molde
// Não podemos criar uma objeto 'new DispositivosDeMidia()'.
//ela define o que tudo dispositivios de midia dever ter.

    public abstract class DispositivosDeMidia {

        protected  String nomeDoDispositivo;


        public DispositivosDeMidia(String nome){
            this.nomeDoDispositivo = nome;
        }

        //este é um metodo abstrato. ele não tem implemnetação (sem {}).
        //ele FORÇA todos  as classes filhas a criarem sua propria versão
        //do metodo 'reproduzir()'. este é o nosso "botão play"conceitual
        public abstract void reproduzir();

        //classes abstratas também podem ter métodos concretos (com implementação).
        //que serão herdados normalmente por todos as filhas
        public void desligar(){
            System.out.println(this.nomeDoDispositivo + "está desligado");
        }
    }

}
