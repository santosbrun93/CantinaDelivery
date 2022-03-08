package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements ICalculaEntrega {

    Alimentos alimentos;

    private int contadorLanche;

    private int contadorComida;

    private int contadorBebida;

    public Alimentos getAlimentos() {
        return alimentos;
    }


    public int getContadorLanche() {
        return contadorLanche;
    }

    public void setContadorLanche(int contadorLanche) {
        this.contadorLanche = contadorLanche;
    }

    public int getContadorComida() {
        return contadorComida;
    }

    public void setContadorComida(int contadorComida) {
        this.contadorComida = contadorComida;
    }

    public int getContadorBebida() {
        return contadorBebida;
    }

    public void setContadorBebida(int contadorBebida) {
        this.contadorBebida = contadorBebida;
    }

    @Override
    public double calculaEntrega(int contadorLanche, int contadorComida, int contadorBebida) {
        double valorEntrega = 0;

        valorEntrega = ( 1 * contadorBebida ) + ( 2 * contadorComida) + ( 1 * contadorBebida);

        return valorEntrega;
    }
}
