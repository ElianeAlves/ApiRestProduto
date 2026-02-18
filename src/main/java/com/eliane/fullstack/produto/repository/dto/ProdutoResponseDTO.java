package com.eliane.fullstack.produto.repository.dto;

import com.eliane.fullstack.produto.repository.entity.Produto;

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
