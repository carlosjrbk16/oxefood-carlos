package br.com.ifpe.oxefoodcarlos.modelo.cupomDesconto;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefoodcarlos.util.entity.GenericService;

@Service
public class CupomDescontoService extends GenericService {
    
    @Autowired
    private CupomDescontoRepository repository;
    
    @Transactional
    public CupomDesconto save(CupomDesconto cupomDesconto) {

	super.preencherCamposAuditoria(cupomDesconto);
	return repository.save(cupomDesconto);
	
	@Transactional
	public CupomDesconto ObterCategoriaPorID(long id) {
		return repository.findById(id).get();
    }
	@Transactional
	public List<CupomDesconto>consultaPorChaveEmpresa(String chaveEmpresa){
		return repository.findByChaveEmpresaByDescricao(chaveEmpresa);
	}

}