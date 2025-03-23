public class Ninja {
    public String name;
    public String vila;
    public Integer idade;

    public Ninja(String name, String vila, Integer idade) {
        this.name = name;
        this.vila = vila;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "name='" + name + '\'' +
                ", vila='" + vila + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}