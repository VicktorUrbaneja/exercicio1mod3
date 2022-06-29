package model;

public class main {

    public static void main(String[] args) {
        DiaDasMaes diaDasMaes =
                new DiaDasMaes("Filho","Mae");
        DiaDosNamorados diaDosNamorados =
                new DiaDosNamorados("Namorado","Namorada");
        DiaDosPais diaDosPais =
                new DiaDosPais("Filho","Pai");

        escreverCartao(diaDasMaes);
        escreverCartao(diaDosNamorados);
        escreverCartao(diaDosPais);

    }

    public static void escreverCartao(CartaoDePresente cartaoDePresente){
        System.out.println("De: "+ cartaoDePresente.getRemetente());
        System.out.println("Para: " + cartaoDePresente.getDestinatario());
        System.out.println("Mensagem: " + cartaoDePresente.mostrarMensagem() +"\n ");
    }

}

/*Enunciado

Exercício para classe abstrata, sobrescrita, polimorfismo:

Implemente uma classe chamada CartaoDePresente, ela deve salvar 2 informações: nome do remetente e nome do destinatário
(que devem ser definidos no momento de criação do objeto e não são alteráveis). Além disso a classe precisa definir um método
 para mostrar a mensagem. Essa classe não pode ser instânciada em nenhum trecho do nosso código.

Para utilizar a classe CartaoDePresente, crie algumas classes filhas,
como por exemplo DiaDasMaes, DiaDosNamorados, etc.
Essas classes devem sobrescrever o método "mostrarMensagem" de forma que cada uma retorne a mensagem correta para a sua comemoração.

Por fim crie um método main para brincar com essas classes.
Tentem criar um método estático que recebe como parâmetro um cartao de presente (independente de qual)
e escreva corretamente o remetente, destinatário e a mensagem.

Tentem usar o máximo das boas práticas que usamos nas últimas aulas :)
*/