public class Uzumaki extends Ninja{

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki() {
        super();
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nAldeia: " + aldeia +
                "\nIdade: " + idade;
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque uzumaki, um ataque de ar");
    }
}
