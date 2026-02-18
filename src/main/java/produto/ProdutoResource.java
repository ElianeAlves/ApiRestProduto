package produto;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import produto.dto.ProdutoRequestDTO;
import produto.dto.ProdutoResponseDTO;
import produto.exception.NotFoundExceptionMapper;

import java.util.List;
import java.util.stream.Collectors;

@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource {

    @Inject
    private ProdutoRepository produtoRepository;

    @GET
    public List<ProdutoResponseDTO> getProdutos() {

        return produtoRepository.listAll()
                .stream()
                .map(ProdutoResponseDTO::paraDTO)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    public Response getProdutoById(@PathParam("id") Long id) {
        Produto produto = produtoRepository.findById(id);
        if (produto == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Produto não encontrado.")
                    .build();
        }
        return Response.ok(ProdutoResponseDTO.paraDTO(produto)).build();
    }

    @POST
    @Transactional
    public Response postProduto(@Valid ProdutoRequestDTO request) {
        Produto produto = request.paraEntidade();
        produtoRepository.persist(produto);

        return Response.status(Response.Status.CREATED)
                .entity(ProdutoResponseDTO.paraDTO(produto))
                .build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response putProduto(@PathParam("id") Long id, Produto produtoAtualizado) {
        Produto produto = produtoRepository.findById(id);

        if (produto == null) throw new NotFoundException("Produto não encontrado");

        produto.setNome(produtoAtualizado.getNome());
        produto.setQuantidade(produtoAtualizado.getQuantidade());
        produto.setValor(produtoAtualizado.getValor());

        return Response.ok(produto).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteProduto(@PathParam("id") Long id) {
        if (!produtoRepository.deleteById(id)) throw new NotFoundException("Produto não encontrado");
        return Response.noContent().build();
    }

    @DELETE
    @Transactional
    public Response deleteVariosProdutos(@QueryParam("id") List<Long> ids) {
        if(ids ==null || ids.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity("A lista de IDS não pode estar vazia.").build();
        }

        Long registrosDeletados = produtoRepository.delete("id in ?1", ids);

        return Response.ok("Deletados:" + registrosDeletados).build();
    }
}
