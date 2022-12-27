/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.UsuarioDAO;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author thiag
 */

@Path("dashboard")
@Controller
public class DashboardController {
    
    @Get("")
    public void dashboard(){
        
    }
  
    
}
