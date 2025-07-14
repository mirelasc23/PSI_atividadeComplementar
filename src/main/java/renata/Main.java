package renata;

import static renata.ScannerUtils.SCANNER;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a matricula do Aluno");
        var aluno = new Aluno(SCANNER.next());

        var menu = new Menu();
        var atividadesDeclaradas = menu.mostraMenuERetornaAtividadesDeclaradas();

        var requerimento = new Requerimento(aluno, atividadesDeclaradas);
        requerimento.atividadesAvaliadas = menu.mostraMenuAvaliadorERetornaAvaliadas(requerimento.atividadesDeclaradas);

        try {
            requerimento.valida();
            System.out.println("Horas validadas com sucesso");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
