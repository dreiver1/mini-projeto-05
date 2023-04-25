public class Personagem {
    private String nome;
    private int saude = 30;

    public void setSaude(int saude) {
        this.saude = saude;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSaude() {
        return saude;
    }

    public void perdeSaude() {
        this.saude = saude - 10;
    }

    public void recuperaSaude(){
        if(this.saude < 100){
            this.saude = saude + 10;
        }
    }
    
}
