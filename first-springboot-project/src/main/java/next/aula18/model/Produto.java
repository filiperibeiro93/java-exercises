package next.aula18.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
  
  @Id // é para dizer que este atributo vai ser uma chave primaria
  @GeneratedValue(strategy = GenerationType.AUTO) // esse é para fazer essa chave
  private Long id;

  @Column(nullable = false)
  private String nome;

  @Column
  private double valor;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

}
