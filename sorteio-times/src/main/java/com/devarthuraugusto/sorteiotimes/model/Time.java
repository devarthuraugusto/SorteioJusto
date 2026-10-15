import java.util.LinkedList;
import java.util.Objects;

public class Time {
    //region Attributes
    private String nome;
    private final LinkedList<Atleta> atletas;
    //endregion

    //region Constructor
    public Time(String nome){
        this.nome = nome;
        atletas = new LinkedList<>();
    }
    //endregion

    //region Methods
    public String getNome() {
        return nome;
    }

    public void adicionarAtleta(Atleta atleta) {
        atletas.add(Objects.requireNonNull(atleta, "O atleta não pode ser nulo."));
    }

    public void limparAtletas() {
        atletas.clear();
    }

    public int getQuantidadeAtletas() {
        return atletas.size();
    }

    public int getSomaCoeficientes() {
        return atletas.stream().mapToInt(Atleta::getCoeficiente).sum();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append(" (CIR total: ").append(getSomaCoeficientes()).append(")\n");
        for (Atleta atleta : atletas) {
            sb.append("  - ").append(atleta).append('\n');
        }
        return sb.toString();
    }
    //endregion
}
