public class Uchiha extends Ninja{
    private String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Habilidade: " + habilidadeEspecial);
    }
}
