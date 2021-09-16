import java.util.Date;

public class ExVoo {
    private Date data;
    private int horario;
    private int[] poltrona = new int[100]; //poderia colocar o vetor como Booleano, ai no ocupa nao precisaria colocar o 1, usaria true ou false
    private int voo;

    public ExVoo(Date data, int voo){
        this.data = data;
        this.voo = voo;

    }

    public void setData(Date data){
        this.data = data;
    }
    public void setHorario(int horario){
        this.horario = horario;
    }
    public void setPoltrona(int[] poltrona){
        this.poltrona = poltrona;
    }
    public void setVoo(int voo){
        this.voo = voo;
    }
    public Date getData(){
        return data;
    }
    public int getHorario(){
        return horario;
    }
    public int getVoo(){
        return voo;
    }

    public boolean verificaOcupada(int posicao){
        if(poltrona[posicao]==0) //0=vazia
            return false;
        else
            return true;
    }

    public int proximaPoltronaLivre(){ //poltrona.length
        for(int i=0; i<100;i++){
            if(poltrona[i]==0)
                return i;
        }
        return -1;//nao tem poltrona disponivel Completo
    }

    public boolean ocupaCadeira(int posicao){
        if(verificaOcupada(posicao)== false) {//=0 vazia
            poltrona[posicao] = 1;
            return true;
        }else //nao precisa do else
            return false;
    }

    public int proximoLivre(int[] passageiro){// usar o verificaOcupada
        for(int i=0;i<100; i++ ){
            if(passageiro[i]==0)
                return i;
        }
        return -1;
    }

    public int cadeirasVagas(){
        int vagas=0;
        for(int i=0; i<100;i++){
            if(verificaOcupada(i)==false)
                vagas++;
        }
        return vagas;
    }
    //usar ToString para mostrar
}
