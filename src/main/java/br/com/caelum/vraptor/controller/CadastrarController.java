/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.UsuarioDAO;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.model.Usuario;
import br.com.caelum.vraptor.validator.Severity;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;

/**
 *
 * @author thiag
 */

@Path("cadastrar")
@Controller
public class CadastrarController {
    
 @Inject EntityManager em;
 @Inject Result result;
 @Inject UsuarioDAO UsuarioDao;
 @Inject Validator validator;
    @Get("")
    public void cadastrar(){
        
    }
    @IncludeParameters
    @Post("salvausuario")
    public void salvaUsuario(@Valid Usuario usuario,String confirmaSenha){
        
        
//        result.include("usuario",usuario);
//        result.include("confirmaSenha",confirmaSenha);
        
       boolean asSenhaSaoIguais = confirmaSenha.equals(usuario.getSenha());
       validator.addIf(!asSenhaSaoIguais, new SimpleMessage("confirmaSenha", "A confirmação esta diferente da senha"));
       
        
        //se der erro direciona para cadastrar
        validator.onErrorRedirectTo(this).cadastrar();
        
        //validar usuario 
        //salvar usuario no banco 
        //em.persist(usuario);
        UsuarioDao.insertOrUpdate(usuario);
        
        //direcionar para o dashboard 
        
        result.redirectTo(DashboardController.class).dashboard();
        
   
    }
}
