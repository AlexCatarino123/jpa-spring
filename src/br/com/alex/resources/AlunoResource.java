/**
 * 
 */
package br.com.alex.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.alex.business.AlunoBusiness;
import br.com.alex.model.Aluno;

/**
 * @author alexandre
 *12/07/2018, 01:08:33
 */

@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON)
@Path("/alunos")
@Component
public class AlunoResource {
	
	@Autowired
	private AlunoBusiness alunoBusiness;
	
	@GET
	public List<Aluno> listar() {
		return this.alunoBusiness.listar();
	}

}
