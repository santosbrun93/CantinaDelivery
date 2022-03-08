package Model;

public enum Alimentos {

    HAMBURGER(30.00,1), PIZZA(45.00,1), FOGAZZA(20.00,1), PASTA(30.00,2), LASANHA(70.00,2), POLPOTONE(50.00,2), REFRIGERANTE(5.00,3), SUCO(7.00,3), VINHO(50.00,3);

    private String descricao;

    private double preco;

    private int tipoAlimento;

    Alimentos(double preco, int tipoAlimento){
        this.descricao = descricao;
        this.preco = preco;
        this.tipoAlimento = tipoAlimento;
    }

    public double getPreco() {
        return preco;
    }

    public int getTipoAlimento() {
        return tipoAlimento;
    }


    public String toString() {
        return "Alimentos{" +
                "preco=" + preco +
                ", tipoAlimento=" + tipoAlimento +
                '}';
    }
}
