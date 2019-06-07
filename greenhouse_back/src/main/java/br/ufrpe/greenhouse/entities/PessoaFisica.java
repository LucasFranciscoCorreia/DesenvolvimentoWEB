package br.ufrpe.greenhouse.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Data
@Entity
@Table(name="fisico")
public class PessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_fisico", unique = true, nullable = false)
    private Long id_fisico;

 /* @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "fk_id_usuario", referencedColumnName = "idusuario")
  @JsonIgnoreProperties("fisico")/*
  @Column(name="usuario")
  private Usuario usuario;*/

  @Column(name = "fk_id_usuario", unique = true)
  private Long fk_id_usuario;

  @Column(name="sexo")
    private char sexo;

    @Column(name="cpf", unique = true, length = 11)
    private String cpf;

    @Column(name="data_nascimento")
    private Date data_nascimento;

    @Column(name="nome",length = 50)
    private String nome;

  public Long getId_fisico() {
    return id_fisico;
  }

  public void setId_fisico(Long id_fisico) {
    this.id_fisico = id_fisico;
  }

  /*public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
*/
  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Date getData_nascimento() {
    return data_nascimento;
  }

  public void setData_nascimento(Date data_nascimento) {
    this.data_nascimento = data_nascimento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

 /* @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PessoaFisica that = (PessoaFisica) o;
    return id_fisico.equals(that.id_fisico) &&
      usuario.equals(that.usuario);
  }
*/

}
