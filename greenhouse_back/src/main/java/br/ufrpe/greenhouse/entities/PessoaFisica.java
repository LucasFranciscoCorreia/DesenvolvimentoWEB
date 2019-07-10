package br.ufrpe.greenhouse.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Data
@Entity
@Table(name="fisico")
public class PessoaFisica {

  @Id
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_usu_fisico", unique = true, nullable = false)
    private Long id_usu_fisico;

    @JoinColumn(name="fk_id_usuario", referencedColumnName = "idusuario",nullable = false, unique = true)
    private Long fk_id_usuario;

    @Column(name="sexo", nullable = false)
    private char sexo;

    @Column(name="cpf", unique = true, length = 11, nullable = false)
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name="data_nascimento", nullable = false)
    private Date data_nascimento;

    @Column(name="nome",length = 50, nullable = false)
    private String nome;

  public PessoaFisica() {
  }

  public Long getId_usu_fisico() {
    return id_usu_fisico;
  }

  public void setId_usu_fisico(Long id_usu_fisico) {
    this.id_usu_fisico = id_usu_fisico;
  }

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

  public Long getFk_id_usuario() {
    return fk_id_usuario;
  }

  public void setFk_id_usuario(Long fk_id_usuario) {
    this.fk_id_usuario = fk_id_usuario;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PessoaFisica that = (PessoaFisica) o;
    return cpf.equals(that.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf);
  }
}
