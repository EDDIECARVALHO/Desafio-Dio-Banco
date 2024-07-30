import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Banco {
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public static void main(String[] args) {
        // Criando alguns clientes
        Cliente cliente1 = new Cliente("Maria", "12345");
        Cliente cliente2 = new Cliente("João", "67890");

        // Criando o banco e adicionando clientes
        Banco banco = new Banco();
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Listando todos os clientes
        banco.listarClientes();
    }
}
