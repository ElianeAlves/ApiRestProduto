package produto.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import produto.Produto;

public class ProdutoRequest {

    @NotBlank
    public String nome;

    @NotNull
    @Min(0)
    public Integer quantidade;

    @NotNull
    @Min(0)
    public Integer valor;

    public Produto toEntity() {
        Produto produto = new Produto();
        produto.setNome(this.nome);
        produto.setQuantidade(this.quantidade);
        produto.setValor(this.valor);
        return produto;
    }
}

