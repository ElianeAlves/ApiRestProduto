package com.produto;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/produto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource {

    @Inject
    private ProdutoRepository produtoRepository;

    @GET
    public Response getProdutos() {
        List<Produto> produtos = produtoRepository.listAll();
        return Response.ok(produtos).build();
    }

    @GET
    @Path("/{id}")
    public Response getProdutoById(@PathParam("id") Long id) {
        Produto produto = produtoRepository.findById(id);
        return Response.ok(produto).build();
    }
}
