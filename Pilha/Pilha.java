package Pilha;

public class Pilha {
    
    private No refNoEntradaPilha;


public Pilha(){
    this.refNoEntradaPilha = null;
}

public void push(No novoNo){
    No refAuxiliar = refNoEntradaPilha;
    refNoEntradaPilha = novoNo;
    refNoEntradaPilha.setRefNo(refAuxiliar);
}


public No pop(){
    if(this.isEmpty()){
        No noPoped = refNoEntradaPilha;
        refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        return noPoped;
    }
    return null;
}


public No top(){
    return refNoEntradaPilha;
}


public boolean isEmpty(){
    return refNoEntradaPilha == null ? true : false;
}

@Override
public String toString(){

String stringRetorno = "-------------\n";
stringRetorno += "       Pilha\n";
stringRetorno += "-------------\n";

No noAuxilar = refNoEntradaPilha;

while(true){
    if(noAuxilar != null){
        stringRetorno += "[No{dado=" + noAuxilar.getDado() + "}]\n";
        noAuxilar = noAuxilar.getRefNo();
    }else {
        break;
    }
    

}
stringRetorno += "=============\n";
return stringRetorno;

}


}
