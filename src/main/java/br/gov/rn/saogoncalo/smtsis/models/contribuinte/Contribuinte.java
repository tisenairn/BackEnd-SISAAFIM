package br.gov.rn.saogoncalo.smtsis.models.contribuinte;

import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "contribuintes")
public class Contribuinte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contribuinte")
    private Long id;
    //@NotNull
    //@NotEmpty
    private String nome;
    //@NotNull
    //@NotEmpty
//  @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    //@NotNull
    //@NotEmpty
    private String telefone;
    //@NotNull
    //@NotEmpty
    private String cpf;
    //@NotNull
    //@NotEmpty
    private String rg;
    //@NotNull
    //@NotEmpty
    private String rgExpedidor;
    //@NotNull
    //@NotEmpty
    private String cnh;
    //@NotNull
    //@NotEmpty
    private String cnpj;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contribuinte_endereco", referencedColumnName = "id_endereco", unique = true)
    private ContribuinteEndereco contribuinteEndereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contribuinte_imovel", referencedColumnName = "id_imovel", unique = true)
    private Imovel imovel;

    public Contribuinte(){
    }

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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRgExpedidor() {
        return rgExpedidor;
    }

    public void setRgExpedidor(String rgExpedidor) {
        this.rgExpedidor = rgExpedidor;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ContribuinteEndereco getContribuinteEndereco() {
        return contribuinteEndereco;
    }

    public void setContribuinteEndereco(ContribuinteEndereco contribuinteEndereco) {
        this.contribuinteEndereco = contribuinteEndereco;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contribuinte that = (Contribuinte) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", rgExpedidor='" + rgExpedidor + '\'' +
                ", cnh='" + cnh + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", contribuinteEndereco=" + contribuinteEndereco +
                ", imovel=" + imovel +
                '}';
    }
}
