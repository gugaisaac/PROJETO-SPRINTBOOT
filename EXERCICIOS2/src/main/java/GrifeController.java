import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Grife")
public class GrifeController {
    List <Grife> grifes = new ArrayList<>(List.of(
            new Grife("Armani", 1897, 350.0,"BOLSAAAAAAAAAAAAAA"),
            new Grife("Prata", 2019, 2110.0,"CAMISETAAAAA"),
            new Grife("C&A", 2022, 400.0,"CALÇAAAA")
    ));
   @PostMapping
   public Grife postGrife(@RequestBody Grife novaGrife){
       grifes.add(novaGrife);
       return novaGrife;
   }
   //GET /grifes que retorna um vetor de JSONs com todas as grifes cadastradas. Porém, no JSON NÃO deve vir o campo "chaveAcesso".
    @GetMapping
    public List<Grife> getGrifes(){
       return grifes;
    }
    //PUT /grifes/{posicao}  {JSON de uma grife com a mesma estrutura de a)} que, caso exista uma grife na posição
    // indicada (posição na lista, iniciando de 0), atualiza o registro com os dados do JSON enviado no corpo da
    // requisição. A chamada deve retornar o JSON da grife atualizada SEM o campo "chaveAcesso" caso a posição for
    // válida ou nada (null) em caso contrário.
    @PutMapping("/{posicao}")
    public Grife putGrife(@PathVariable int posicao,
                          @RequestBody Grife grife){
        grifes.set(posicao,grife);
        return grife;
    }
    @DeleteMapping("/{posicao}")
    public String deleteGrife(@PathVariable int posicao){
       if((grifes.size()-1)<posicao) {
           grifes.remove(posicao);
           return "Grife removida";
       }else{
           return "Não encontrada";
       }
    }
}
