package produto.dto;

import produto.Produto;

public class ProdutoResponseDTO {
    public Long id;
    public String nome;
    public Integer quantidade;
    public Integer valor;

    public static ProdutoResponseDTO paraDTO(Produto produto) {
        ProdutoResponseDTO dto = new ProdutoResponseDTO();
        dto.id = produto.getId();
        dto.nome = produto.getNome();
        dto.quantidade = produto.getQuantidade();
        dto.valor = produto.getValor();
        return dto;
    }
}
