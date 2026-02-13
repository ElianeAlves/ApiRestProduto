package produto.dto;

import produto.Produto;

public class ProdutoResponse {

    public Long id;
    public String nome;
    public Integer quantidade;
    public Integer valor;

    public ProdutoResponse(Long id, String nome, Integer quantidade, Integer valor) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public static ProdutoResponse toResponse(Produto produto) {
        return new ProdutoResponse(
                produto.getId(),
                produto.getNome(),
                produto.getQuantidade(),
                produto.getValor()
        );
    }




}
