import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema de cadastro de Pessoas Físicas e Juridicas");

        Scanner leitor = new Scanner(System.in);

        String opcao;

        do {

            System.out.println("Escolha uma opção: 1 - Pessoa Física / 2 - Pessoa Jurídica / 0 - Sair");
            opcao = leitor.nextLine();

            switch (opcao){
                case "1":

                    String opcaoPf;

                    do {
                        System.out.println("Digite uma opção: 1-Cadastrar PF / 2-Listar PF / 0-Voltar");
                        opcaoPf = leitor.nextLine();

                        switch (opcaoPf){
                            case "1":
                                System.out.println("Cadastrar PF");
                                break;

                            case "2":
                                System.out.println("Lista PF");
                                break;

                            case "0":
                                System.out.println("Volta");
                                break;

                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }

                    }while(!opcaoPf.equals("0"));

                    break;

                case "2":
                    System.out.println("case 2");
                    break;

                case "0":
                    System.out.println("case 0");
                    break;

                default:
                    System.out.println("default");
                    break;
            }

        } while (!opcao.equals("0"));
    }
}