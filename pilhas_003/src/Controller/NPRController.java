package Controller;

import kLn.Pilha;

public class NPRController {

    Pilha pilha = new Pilha();

    public NPRController () {
        super();
    }

    public void insereValor(int valor) {

        pilha.push(valor);
    }

    public int npr (String op) throws Exception {
        int valorO = 0;
        int valorS = 0;
        int resultado = 0;
        if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
            if(pilha.tamanho() >= 2) {
                valorO = pilha.pop();
                valorS = pilha.pop();

                switch (op) {
                    case "+": resultado = valorO + valorS;
                        break;
                    case "-": resultado = valorS - valorO;
                        break;
                    case "*": resultado = valorS * valorO;
                        break;
                    case "/": resultado = valorS / valorO;
                        break;
                }
            } else {

                throw new Exception("Pilha com valores insuficientes");
            }
        } else {

            throw new Exception("Operador inválido");

        }
        pilha.push(resultado);
        return resultado;
    }
}
