package com.eliane.fullstack.produto.repository.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import com.eliane.fullstack.produto.repository.entity.Produto;

public class ProdutoRequestDTO {

    @NotBlank(message = "O nome do produto é obrigatório")
    public String nome;

    @NotNull(message = "A quantidade é obrigatória")
    @Min(value = 1, message = "A quantidade não pode ser negativa")
    public Integer quantidade;

    @NotNull(message = "O valor é obrigatório")
    @Min(value = 1, message = "O valor não pode ser negativo")
    public Integer valor;

    public Produto paraEntidade() {
        Produto produto = new Produto();
        produto.setNome(this.nome);
        produto.setQuantidade(this.quantidade);
        produto.setValor(this.valor);
        return produto;
    }
}
