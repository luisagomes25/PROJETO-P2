import java.util.Scanner;

public class Miniprojeto{
    public static void main(String[] args) {
        System.out.println("Olá, vamos começar nosso atendimento, meu nome é alberto e sou assitende do hospital albert einstein. Vou lhe ajudar a marcar o dia da sua consulta.");
        Scanner t = new Scanner(System.in);
            System.out.println("Para iniciar preciso saber seu nome ");
            String name = t.next();
            System.out.println("Prazer " + name + ", agora vou precisar algumas informações sobre você");
        t = new Scanner(System.in);
            System.out.println("Qual sua idade? ");
            int idade = t.nextInt();
        t = new Scanner(System.in);
        System.out.println("Qual a especialidade medica que você quer sua consulta? ");
            String especialidade = t.next();
        t = new Scanner(System.in);
            System.out.println("Qual o dia que você quer a sua consulta?");
            int day = t.nextInt();
        System.out.println("Otimo,"+ name+" temos vagas para o dia"+ day+" com um "+especialidade);
        }
}
