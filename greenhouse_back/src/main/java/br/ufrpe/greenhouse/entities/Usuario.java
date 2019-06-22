package br.ufrpe.greenhouse.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

  @OneToMany(cascade = CascadeType.ALL, mappedBy="usuario")
  @JsonIgnore
  private List<Pedido> historico = new ArrayList<>();

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

  public Long getIdusuario() {
    return idusuario;
  }

  public void setIdusuario(Long idusuario) {
    this.idusuario = idusuario;
  }

  public String getTpusuario() {
    return tpusuario;
  }

  public void setTpusuario(String tpusuario) {
    this.tpusuario = tpusuario;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Pedido> getHistorico() {
    return historico;
  }

  public void setHistorico(List<Pedido> historico) {
    this.historico = historico;
  }

  @Override
    public int hashCode() {
        return super.hashCode();
    }
}
