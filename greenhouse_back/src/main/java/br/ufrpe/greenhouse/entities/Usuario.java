package br.ufrpe.greenhouse.entities;

import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Data
@Table(name="usuario")
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idusuario")
    private Long idusuario;

    @Column(name = "tpusuario")
    private String tpusuario;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    public Usuario(){

    }

    public boolean equals(Object o){
        if(o instanceof Usuario){
            Usuario u = (Usuario)o;
            if(u.getEmail() == this.email || u.getIdusuario() == this.idusuario){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
