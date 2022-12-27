/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author thiag
 */

// Entity = entidade de persistÊncia para o hibernate saber 
@Entity
public class Usuario extends Model {
    // gerar o valor em sequencia 

    @NotEmpty (message = "{usuario.nome.embranco}")@Size(min = 4, max =25,message = "{usuario.nome.size}")
    private String nome;
    @NotEmpty @Email
    private String email ;
     @NotEmpty(message = "{usuario.senha.embranco}") @Size(min = 6, max =20,message ="{usuario.senha.size}")
    private String senha; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
       public void setSobrenome(String sobrenome) {
        this.nome += ""+sobrenome;
    }


    
}
