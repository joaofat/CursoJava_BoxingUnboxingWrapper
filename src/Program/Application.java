package Program;

/*Boxing e Unboxing
* É o processo de conversão de um objeto tipo valor para um objeto tipo referencia compativél
* Ou seja, ao declarar uma variavél do tipo valor (int, double, String) atribuindo um valor pra ela
* pode ser criado um objeto do tipo de uma classe para receber esse valor, isso é o Boxing
* O Unboxing, é o processo inverso, usa um objeto do tipo de uma classe e atrinui o valor dele a uma
* variavel do tipo valor (int, double, String), geralmente tendo que usar o casting
*
* Wrapper classes
* São classes equivalentes ais tipos primitivos
* Boxing e unboxing é natural na linguagem
* Uso comum: campos de entidades em sistemas de informação
* pois tipos referencia (classes) aceitam valor null e usufruem dos recursos OO*/

public class Application {
    public static void main(String[] args) {
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y    );
    }
}
