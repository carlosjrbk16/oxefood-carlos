package br.com.ifpe.oxefoodcarlos.servicos.cupomDesconto;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodcarlos.modelo.cupomDesconto.CupomDesconto;
import br.com.ifpe.oxefoodcarlos.modelo.cupomDesconto.CupomDescontoService;
import br.com.ifpe.oxefoodcarlos.util.entity.GenericController;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/CupomDesconto")
public class CupomDescontoController extends GenericController {

	@GeMapping("/{id}")
	public CupomDesconto obterCategoriaPorId(@PathVariable) {
		return cupomDescontoService.obterCategoriaPorId(id);
	}
	
	@GetMapping("/poremmpresa/{chaveEmpresa}")
	public List<CupomDesconto>consultaPorChaveEmpresa(@PathVariable String chaveEmpresa) {
		return cupomDescontoService.consultaPorChaveEmpresa(chaveEmpresa);
	}
    @Autowired
    private CupomDescontoService cupomDescontoService;

    @PostMapping
    public ResponseEntity<CupomDesconto> save(@RequestBody @Valid CupomDescontoRequest request) {

	CupomDesconto cupomDesconto = CupomDesconto.save(request.buildCupomDesconto());
	return new ResponseEntity<CupomDesconto>(cupomDesconto, HttpStatus.CREATED);
    }
    
	@PutMapping("/{id}")
    @ApiOperation(value = "Serviço responsável por atualizar as informações do cupom de desconto.")
    public ResponseEntity<CupomDesconto> update(@PathVariable("id") Long id, @RequestBody CupomDescontoRequest request) {

	cupomDescontoService.update(id, request.buildCupomDesconto());
	return ResponseEntity.ok().build();
    
}
	@Transactional
	public void update (long id, CupomDesconto cupomDescontoAlterado) {
		
		validarCupomDescontoExistente(cupomDescontoAlterado);
		
		CupomDesconto cupom = this.findById(id);
		cupom.updateFrom(cupomDescontonAlterado);
		super.preencherCamposAuditoria(cupom);
		
		repository.save(cupom);
	}
}