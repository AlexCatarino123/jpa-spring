/**
 * 
 */
package br.com.alex.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.alex.model.Aluno;
import br.com.alex.persistence.AlunoPersistence;

/**
 * @author alexandre
 *11/07/2018, 23:48:52
 */


@Transactional
@Service
public class AlunoBusiness {
	
	@Autowired
	private AlunoPersistence alunoPersistence;
	
	public void persistirAluno(Aluno aluno) {
		this.alunoPersistence.persistir(aluno);
	}
	
	public List<Aluno> listar() {
		return this.alunoPersistence.listar();
	}
	
	public Aluno buscarAluno(Long id) {
		return this.alunoPersistence.buscar(id);
	}
	
	public void removerAluno(Long id) {
		Aluno aux = this.alunoPersistence.buscar(id);
		this.alunoPersistence.remover(aux);
	}
	
	public void atualizarAluno(Aluno aluno) {
		this.alunoPersistence.atualizar(aluno);
	}

}
