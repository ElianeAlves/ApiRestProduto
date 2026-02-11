package produto;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
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

    @POST
    @Transactional
    public Response postProduto(Produto produto) {
        produtoRepository.persist(produto);
        return Response.status(Response.Status.CREATED).entity(produto).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response putProduto(@PathParam("id") Long id, Produto produtoAtualizado) {

        Produto produto = produtoRepository.findById(id);

        if (produto == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        produto.setNome(produtoAtualizado.getNome());
        produto.setQuantidade(produtoAtualizado.getQuantidade());
        produto.setValor(produtoAtualizado.getValor());

        return Response.ok(produto).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteProduto(@PathParam("id") Long id) {
        Produto produto = produtoRepository.findById(id);
        if (produto == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Produto não encontrado").build();
        }

        produtoRepository.delete(produto);

        return Response.ok().entity("Produto deletado com sucesso!").build();
    }
}
