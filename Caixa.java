public class Pessoa {

       private double Altura;

       private double Peso;

       private String Etnia;

       private String PrimeiroNome;

       public String UltimoNome;
       
       private int Idade;

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setEtnia(String Etnia) {
        this.Etnia = Etnia;
    }

    public void setPrimeiroNome(String PrimeiroNome) {
        this.PrimeiroNome = PrimeiroNome;
    }

    public void setUltimoNome(String UltimoNome) {
        this.UltimoNome = UltimoNome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public double getAltura() {
        return Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public String getEtnia() {
        return Etnia;
    }

    public String getPrimeiroNome() {
        return PrimeiroNome;
    }

    public String getUltimoNome() {
        return UltimoNome;
    }

    public int getIdade() {
        return Idade;
    }
}