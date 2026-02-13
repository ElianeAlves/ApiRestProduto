package produto.dto;

import produto.Produto;

public class ProdutoResponseDTO {
    public Long id;
    public String nome;
    public Integer quantidade;
    public Integer valor;

    public static ProdutoResponseDTO paraDTO(Produto produto) {
        ProdutoResponseDTO response = new ProdutoResponseDTO();
        response.id = produto.getId();
        response.nome = produto.getNome();
        response.quantidade = produto.getQuantidade();
        response.valor = produto.getValor();
        return response;
    }
}
