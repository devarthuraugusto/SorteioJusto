import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Pelada {

    //region Attributes
    private final ArrayList<Time> times;
    private final LinkedList<Atleta> listaAtletas;
    //endRegion

    //region Constructor
    public Pelada(int quantidadeTimes){
        this.times = new ArrayList<>(quantidadeTimes);
        this.listaAtletas = new LinkedList<Atleta>();
        for (int i = 1; i <= quantidadeTimes; i++) {
            times.add(criarTime(i));
        }
    }
    //endRegion

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

    public List<Atleta> getAtletas() {
        return Collections.unmodifiableList(atletas);   // não expõe a lista interna
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
    //endRegion
}
