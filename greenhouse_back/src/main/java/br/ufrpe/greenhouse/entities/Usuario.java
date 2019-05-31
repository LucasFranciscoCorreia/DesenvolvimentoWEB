package br.ufrpe.greenhouse.entities;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
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

    public Long getIdusuario() {
        return idusuario;
    }

    public String getEmail() {
        return email;
    }

    public String getTpusuario() {
        return tpusuario;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public void setTpusuario(String tpusuario) {
        this.tpusuario = tpusuario;
    }

    public void setPassword(String password) {
        this.password = password;
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
}