public class Filme{
    private int codigo;
    private String nome;
    private double valor;
    private boolean disponivel;

    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel)
    {
        this.disponivel=disponivel;
    }
    //faça os gets e sets
}