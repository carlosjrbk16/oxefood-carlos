package br.com.ifpe.oxefoodcarlos.modelo.cupomDesconto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CupomDescontoRepository extends JpaRepository<CupomDesconto, Long>, JpaSpecificationExecutor<CupomDesconto> {

}
