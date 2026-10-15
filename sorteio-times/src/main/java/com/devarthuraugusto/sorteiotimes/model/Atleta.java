import java.util.Objects;

public class Atleta {

    //region Attributes
    private final String nome;
    private final ERank rank;
    //endregion

    //region Constructor
    public Atleta(String nome, ERank rank) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do atleta não pode ser vazio.");
        }
        this.nome = nome.trim();
        this.rank = Objects.requireNonNull(rank, "O rank não pode ser nulo.");
    }
    //endregion

    //region Methods
    public String getNome() {
        return nome;
    }

    public ERank getRank() {
        return rank;
    }

    public int getCoeficiente() {
        return rank.getCir();
    }

    @Override
    public String toString() {
        return String.format("%s (Rank %s, CIR %d)", nome, rank, getCoeficiente());
    }
    //endregion
}
