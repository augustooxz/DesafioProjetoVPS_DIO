import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo {
    public static void main(String[] args){ 
        imprimirSelecionados();
        String [] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELLA","DANIELA","JORGE"};
            for(String candidato: candidatos){
                entrandoEmContato(candidato);
            }

}
    static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do{
        atendeu = atender();
        continuarTentando = !atendeu;
        if(continuarTentando){
            tentativasRealizadas++; 
    }
    else {
        System.out.println("contato realizado com sucesso");
    
       }   }while(continuarTentando && tentativasRealizadas < 3 );
        if (atendeu) {
            System.out.println("não conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        }else{
            System.out.println("Conseguimos contato com " + candidato + " número máximo de tentativas " + tentativasRealizadas + " tentativa");}
}
            
    


static boolean atender() {
    return new Random().nextInt(3)==1;
}


}



static void imprimirSelecionados(){
    String [] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
            for(int indice = 0; indice < candidatos.length ; indice++){
                System.out.println("O candidato de N° " + (indice+1) + "é o " + candidatos[indice]);

    }
}
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELLA","DANIELA","JORGE"};
            int candidatosSelecionados = 0 ; int candidatoAtual = 0; double SalarioBase = 2000.0;
                while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
                    String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();  
            System.out.println("O candidato" + candidato + "Solicitou este valor de salário" + salarioPretendido);
        if (SalarioBase >= salarioPretendido) {
            System.out.println("O candidato " + candidatos + " foi selecionado para a vaga");
                candidatosSelecionados++; 
           }}
           candidatoAtual++;
    }
        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800.0 , 2200.0);
        }    

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
            if(salarioBase > salarioPretendido){
                System.out.println("Ligar para o candidato");
                }else if (salarioBase == salarioPretendido){
                System.out.println("Ligar para o candidato com contra proposta");
                    }else{
                        System.out.println("Aguardando o resultado dos demais candidatos");
                    }

                }

   
       
      

    

    

    