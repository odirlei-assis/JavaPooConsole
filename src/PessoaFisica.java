import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaFisica extends Pessoa{
    public String cpf;
    public LocalDate dataNasc;

    private ArrayList<PessoaFisica> listaPf = new ArrayList<PessoaFisica>();

    @Override
    public float CalcularImposto(float rendimento) {
//        até 1500 - isento
//        de 1500 a 3500 - 2%
//        de 3500 a 6000 - 3.5%
//        acima de 6000 - 5%

        if (rendimento <= 1500){
            return 0;

        } else if (rendimento <= 3500) {
            return rendimento * .02f;

        } else if (rendimento <= 6000) {
            return rendimento * .035f;

        }else {
            return rendimento * .05f;
        }

    }

    public void CadastrarPf(PessoaFisica pessoa){
        listaPf.add(pessoa);

        System.out.println("Cadastrado com sucesso!");
    }

    public ArrayList<PessoaFisica> ListarPessoasF(){
        return  listaPf;
    }
}
