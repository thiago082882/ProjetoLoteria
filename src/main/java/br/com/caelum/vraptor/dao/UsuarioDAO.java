/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.caelum.vraptor.dao;

import br.com.caelum.vraptor.model.Usuario;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author thiag
 */
//A cada nova requisição o sistema irá criar um novo usuario DAU
@RequestScoped
public class UsuarioDAO extends DAO<Usuario>{
    
    @Inject
    public UsuarioDAO(EntityManager em) {
        super(em, Usuario.class);
    }

   @Deprecated public UsuarioDAO() {
        this(null);
       
    } 
      
}
