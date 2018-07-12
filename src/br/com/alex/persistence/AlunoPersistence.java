/**
 * 
 */
package br.com.alex.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.alex.model.Aluno;

/**
 * @author alexandre
 *11/07/2018, 23:43:47
 */

@Repository
public class AlunoPersistence {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void persistir(Aluno aluno) {
		this.entityManager.persist(aluno);
	}
	
	public List<Aluno> listar() {
		String jpql = "select x from Aluno x";
		TypedQuery<Aluno> consulta = entityManager.createQuery(jpql, Aluno.class);
		return consulta.getResultList();
	}
	
	public Aluno buscar(Long id) {
		return this.entityManager.find(Aluno.class, id);
	}
	
	public void remover(Aluno aluno) {
		this.entityManager.remove(aluno);
	}
	
	public void atualizar(Aluno aluno) {
		this.entityManager.merge(aluno);
	}
 
}
