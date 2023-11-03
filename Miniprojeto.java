import java.util.Scanner;

public class Miniprojeto{
    public static void main(String[] args) {
        System.out.println("Esse é uma livro interativo da diciplina de programação 2, que tem como objetivo a interação do usuario com a historia, podendo gerar finais diferentes de acordo com escolhas ao longo da historia");
        System.out.println("Em um dia normal do verão Luís como de costume vai passear na floresta.");
        System.out.println("Ao entrar na floresta ele avista pegadas.");
        System.out.println("--Caso ele va seguir as pegadas, escolha 1 .Caso não, escolha 2");
        Scanner escolhas = new Scanner(System.in);
        int escolha1 = escolhas.nextInt();
        if (escolha1 == 1) {
            System.out.println("Luis decide seguir as pegadas e logo na frente ele encontra uma cabana.");
            System.out.println("Ao avistar a cabana ele chega proximo dela e vê uma bilhete na porta dizendo: 'Não entre, se não tiver disposto a enfrentar em uma jornada de aventuras'");
            System.out.println("--Se quiser que ele entre, escolha1. Caso ele não entre, escolha 2. Se quiser que ele proucure mais pistas, escolha 3.");
            int escolha2 = escolhas.nextInt();
            if (escolha2 == 1) {
                System.out.println("Luis decide entrar na casa, e logo que entra encontra uma caixa velha fechada com cadeado");
                
            }
            else if (escolha2 ==2) {
                System.out.println("Luis volta para sua casa em segurança.");
                
            }
            else {
                System.out.println("Luis da uma volta na casa e encontra um caminho no fundo.");
                
            }


        }
        else{
            System.out.println("Luis volta para sua casa em segurança.");
        }

    }   
}
