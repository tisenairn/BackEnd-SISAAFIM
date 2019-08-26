package br.gov.rn.saogoncalo.smtsis.models.formulario;

import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Data
@Entity
@Table(name = "processoImobiliario")
public class ProcessoImobiliario extends AuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_processo_imobiliario")
    private Long id;
// Ver se String pode ser unique
//    @Column(columnDefinition = "UNIQUE")
    private String processoNumero;

    private String nomeRequerente;

    private String documento;

    private String localizacao;

    private String inscricao;

    @Email
    private String email;

    private String telefone;

    private String processoOriginal;

    private String enderecoCorrespondencia;

    private String requerimento;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date dataAberturaProcesso;
// Precisa ser auditado pelo usuário
//    private Usuario usuario;


}
