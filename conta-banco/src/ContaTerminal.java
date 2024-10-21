import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        Conta c = new Conta();

        while(c.getNomeCliente()==null || "".equals(c.getNomeCliente())){
            System.out.println("Favor entre com o nome do cliente: ");
            c.setNomeCliente( myObj.nextLine() );
        }

        while(c.getNumero()==null){
            System.out.println("Favor entre com o numero da conta: ");
            String tmp = myObj.nextLine();
            try {
                c.setNumero( Integer.valueOf(tmp) );
            } catch (Exception e) {
                System.out.println("favor entrar com um numero válido!!!");
                c.setNumero( null );
            }
            
        }
        
        while(c.getAgencia()==null || "".equals(c.getAgencia())){
            System.out.println("Favor entre com a agencia: ");
            c.setAgencia( myObj.nextLine() );
        }

        while(c.getSaldo()==null){
            System.out.println("Favor entre com o Saldo da conta: ");
            String tmp = myObj.nextLine();
            try {
                c.setSaldo( new BigDecimal(tmp) );
            } catch (Exception e) {
                System.out.println("favor entrar com um Saldo válido!!!");
                c.setSaldo( null );
            }
            
        }
        
        System.out.println("conta criada: ");
        System.out.println("\t\t "+c);


    }
}
