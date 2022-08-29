public class Grife {
    private String nome;
    private Integer anoCriacao;
    private Double valorAcaoBolsa;
    private String chaveAcesso;

    public Grife(String nome, Integer anoCriacao, Double valorAcaoBolsa, String chaveAcesso) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.valorAcaoBolsa = valorAcaoBolsa;
        this.chaveAcesso = chaveAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public Double getValorAcaoBolsa() {
        return valorAcaoBolsa;
    }

    public void setValorAcaoBolsa(Double valorAcaoBolsa) {
        this.valorAcaoBolsa = valorAcaoBolsa;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Grife{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", anoCriacao=").append(anoCriacao);
        sb.append(", valorAcaoBolsa=").append(valorAcaoBolsa);
        sb.append('}');
        return sb.toString();
    }
}
