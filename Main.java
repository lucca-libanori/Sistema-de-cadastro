package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        int opcao;
        Vendedores v1 = new Vendedores("Gabriel", "Santos", "07/09/2000", 38321892, "29103201293", "Manaus", "Amazonas",
                "Brasil", "Rua amazonas", Calendar.getInstance().getTime(), "gabriel.s", "gab@@123");
        Clientes c1 = new Clientes("Felipe", "Nunes", "09/02/1995", 238232891, "99090212357", "Brasília", "Centro-Oeste",
                "Brasil", "Rua presidente vargas", 1, Calendar.getInstance().getTime());
        Fornecedores f1 = new Fornecedores("Keila", "Distribuidora", "12345", 38319090, "keila.d@gmail.com", "Campinas",
                "São Paulo", "Brasil", "Av. Paulista", 1, Calendar.getInstance().getTime());
        Produto p1 = new Produto("Intenso", 100, 400, "Keila");
        Scanner menu = new Scanner(System.in);
        Listarvendedores lista = new Listarvendedores();
        Listarclientes listaC = new Listarclientes();
        Listarfornecedores listaF = new Listarfornecedores();
        Listarprodutos listaP = new Listarprodutos();
        ListarVendas listaV = new ListarVendas();
        FechamentodoDia closeDay = new FechamentodoDia();
        lista.addVendedores(v1);
        listaC.addClientes(c1);
        listaF.addFornecedores(f1);
        listaP.addProdutos(p1);

        try {
            do {
                sistema();

                opcao = menu.nextInt();


                switch (opcao) {

                    case 1:
                        System.out.println("-----------------------------------------");
                        Scanner s1 = new Scanner(System.in);
                        System.out.print("Nome: ");
                        String nome = s1.nextLine();

                        System.out.print("Sobrenome: ");
                        String sobrenome = s1.nextLine();

                        System.out.print("Data de nascimento: ");
                        String dataNascimento = s1.nextLine();

                        System.out.print("CPF: ");
                        String cpf = s1.nextLine();

                        System.out.print("Cidade: ");
                        String cidade = s1.nextLine();

                        System.out.print("Estado: ");
                        String estado = s1.nextLine();

                        System.out.print("País: ");
                        String pais = s1.nextLine();

                        System.out.print("Endereço: ");
                        String endereco = s1.nextLine();

                        Date dataCadastro = Calendar.getInstance().getTime();

                        System.out.print("Login: ");
                        String login = s1.nextLine();

                        System.out.print("Senha: ");
                        String senha = s1.nextLine();

                        System.out.print("Telefone: ");
                        int telefone = s1.nextInt();

                        Vendedores cadastro = new Vendedores(nome, sobrenome, dataNascimento, telefone, cpf, cidade, estado, pais, endereco, dataCadastro, login, senha);
                        lista.addVendedores(cadastro);
                        break;

                    case 2:
                        System.out.println("-----------------------------------------");
                        Scanner s2 = new Scanner(System.in);
                        System.out.print("Nome: ");
                        String nomeC = s2.nextLine();

                        System.out.print("Sobrenome: ");
                        String sobrenomeC = s2.nextLine();

                        System.out.print("Data de nascimento: ");
                        String dataNascimentoC = s2.nextLine();

                        System.out.print("CPF: ");
                        String cpfC = s2.nextLine();

                        System.out.print("Cidade: ");
                        String cidadeC = s2.nextLine();

                        System.out.print("Estado: ");
                        String estadoC = s2.nextLine();

                        System.out.print("País: ");
                        String paisC = s2.nextLine();

                        System.out.print("Endereço: ");
                        String enderecoC = s2.nextLine();

                        try {

                            System.out.print("Telefone: ");
                            int telefoneC = s2.nextInt();

                            System.out.print("Número: ");
                            int numero = s2.nextInt();

                            Date dataCadastroC = Calendar.getInstance().getTime();

                            Clientes cadastroC = new Clientes(nomeC, sobrenomeC, dataNascimentoC, telefoneC, cpfC, cidadeC, estadoC, paisC, enderecoC, numero, dataCadastroC);
                            listaC.addClientes(cadastroC);
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("-----------------------------------------");
                            System.out.println("Apenas números!");
                            System.out.println("-----------------------------------------");
                        }
                        break;

                    case 3:
                        System.out.println("-----------------------------------------");
                        Scanner s3 = new Scanner(System.in);
                        System.out.print("Nome: ");
                        String nomeF = s3.nextLine();

                        System.out.print("Razão social: ");
                        String razaoSocial = s3.nextLine();

                        System.out.print("Cnpj: ");
                        String cnpj = s3.nextLine();

                        System.out.print("Email: ");
                        String email = s3.nextLine();

                        System.out.print("Cidade: ");
                        String cidadeF = s3.nextLine();

                        System.out.print("Estado: ");
                        String estadoF = s3.nextLine();

                        System.out.print("País: ");
                        String paisF = s3.nextLine();

                        System.out.print("Endereço: ");
                        String enderecoF = s3.nextLine();

                        try {
                            System.out.print("Telefone: ");
                            int telefoneF = s3.nextInt();

                            System.out.print("Número: ");
                            int numeroF = s3.nextInt();

                            Date dataCadastroF = Calendar.getInstance().getTime();

                            Fornecedores cadastroF = new Fornecedores(nomeF, razaoSocial, cnpj, telefoneF, email, cidadeF, estadoF, paisF, enderecoF, numeroF, dataCadastroF);
                            listaF.addFornecedores(cadastroF);
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("-----------------------------------------");
                            System.out.println("Apenas números!");
                            System.out.println("-----------------------------------------");
                        }
                        break;

                    case 4:
                        fornecedorr(listaF.getFornecedores(), listaP);
                        break;

                    case 5:
                        System.out.println("-----------------------------------------");
                        lista.listarVendedores(lista.getVendedores());
                        System.out.println("-----------------------------------------");
                        System.out.println("1. Voltar ao menu");
                        System.out.println("2. Apagar um vendedor");
                        System.out.println("3. Editar os dados de um vendedor ");
                        System.out.println("-----------------------------------------");
                        System.out.print("Insira sua opção: ");
                        Scanner sv = new Scanner(System.in);
                        int op2 = sv.nextInt();
                        if (op2 == 1) {
                            sistema();
                        }
                        if (op2 == 2) {
                            System.out.println("-----------------------------------------");
                            removerV(lista.getVendedores());
                        }
                        if (op2 == 3) {
                            System.out.println("-----------------------------------------");
                            System.out.println("1. Editar telefone");
                            System.out.println("2. Editar endereço");
                            System.out.println("3. Editar cidade");
                            System.out.println("4. Editar estado");
                            System.out.println("5. Editar país");
                            System.out.println("6. Editar login");
                            System.out.println("7. Editar senha" + "\n" + "-----------------------------------------");
                            System.out.print("Insira sua opção: ");
                            Scanner se = new Scanner(System.in);
                            int opE = se.nextInt();
                            if (opE == 1) {
                                alterarTelefonev(lista.getVendedores());
                            }
                            if (opE == 2) {
                                alterarEnderecov(lista.getVendedores());
                            }
                            if (opE == 3) {
                                alterarCidadev(lista.getVendedores());
                            }
                            if (opE == 4) {
                                alterarEstadov(lista.getVendedores());
                            }
                            if (opE == 5) {
                                alterarPaisv(lista.getVendedores());
                            }
                            if (opE == 6) {
                                alterarLoginv(lista.getVendedores());
                            }
                            if (opE == 7) {
                                alterarSenhav(lista.getVendedores());
                            }
                        }
                        break;

                    case 6:
                        System.out.println("-----------------------------------------");
                        listaC.listarClientes(listaC.getClientes());
                        System.out.println("-----------------------------------------");
                        System.out.println("1. Voltar ao menu");
                        System.out.println("2. Apagar um cliente");
                        System.out.println("3. Editar os dados de um cliente");
                        System.out.println("-----------------------------------------");
                        System.out.print("Insira sua opção: ");
                        Scanner sc = new Scanner(System.in);
                        int op3 = sc.nextInt();
                        if (op3 == 1) {
                            sistema();
                        }
                        if (op3 == 2) {
                            System.out.println("-----------------------------------------");
                            removerC(listaC.getClientes());
                        }
                        if (op3 == 3) {
                            System.out.println("-----------------------------------------");
                            System.out.println("1. Editar telefone");
                            System.out.println("2. Editar cidade");
                            System.out.println("3. Editar estado");
                            System.out.println("4. Editar país");
                            System.out.println("5. Editar endereço");
                            System.out.println("6. Editar número" + "\n" + "-----------------------------------------");
                            System.out.print("Insira sua opção: ");
                            Scanner se = new Scanner(System.in);
                            int opE = se.nextInt();
                            if (opE == 1) {
                                alterarTelefonec(listaC.getClientes());
                            }
                            if (opE == 2) {
                                alterarCidadec(listaC.getClientes());
                            }
                            if (opE == 3) {
                                alterarEstadoc(listaC.getClientes());
                            }
                            if (opE == 4) {
                                alterarPaisc(listaC.getClientes());
                            }
                            if (opE == 5) {
                                alterarEnderecoc(listaC.getClientes());
                            }
                            if (opE == 6) {
                                alterarNumeroc(listaC.getClientes());
                            }
                        }
                        break;

                    case 7:
                        System.out.println("-----------------------------------------");
                        listaF.listarFornecedores(listaF.getFornecedores());
                        System.out.println("-----------------------------------------");
                        System.out.println("1. Voltar ao menu");
                        System.out.println("2. Apagar um fornecedor");
                        System.out.println("3. Editar os dados de um fornecedor");
                        System.out.println("-----------------------------------------");
                        System.out.print("Insira sua opção: ");
                        Scanner sf = new Scanner(System.in);
                        int op4 = sf.nextInt();
                        if (op4 == 1) {
                            sistema();
                        }
                        if (op4 == 2) {
                            System.out.println("-----------------------------------------");
                            removerF(listaF.getFornecedores());
                        }
                        if (op4 == 3) {
                            System.out.println("-----------------------------------------");
                            System.out.println("1. Editar email");
                            System.out.println("2. Editar telefone");
                            System.out.println("3. Editar cidade");
                            System.out.println("4. Editar estado");
                            System.out.println("5. Editar país");
                            System.out.println("6. Editar endereço");
                            System.out.println("7. Editar número" + "\n" + "-----------------------------------------");
                            System.out.print("Insira sua opção: ");
                            Scanner ss = new Scanner(System.in);
                            int opA = ss.nextInt();
                            if (opA == 1) {
                                alterarEmail(listaF.getFornecedores());
                            }
                            if (opA == 2) {
                                alterarTelefonef(listaF.getFornecedores());
                            }
                            if (opA == 3) {
                                alterarCidadef(listaF.getFornecedores());
                            }
                            if (opA == 4) {
                                alterarEstadof(listaF.getFornecedores());
                            }
                            if (opA == 5) {
                                alterarPaisf(listaF.getFornecedores());
                            }
                            if (opA == 6) {
                                alterarEnderecof((listaF.getFornecedores()));
                            }
                            if (opA == 7) {
                                alterarNumerof(listaF.getFornecedores());
                            }

                        }
                        break;

                    case 8:
                        System.out.println("-----------------------------------------");
                        listaP.listarProdutos(listaP.getProduto());
                        System.out.println("-----------------------------------------");
                        System.out.println("1. Voltar ao menu");
                        System.out.println("2. Apagar um produto");
                        System.out.println("3. Editar dados de um produto");
                        System.out.println("-----------------------------------------");
                        System.out.print("Insira sua opção: ");
                        Scanner sp = new Scanner(System.in);
                        int op5 = sp.nextInt();
                        if (op5 == 1) {
                            sistema();
                        }
                        if (op5 == 2) {
                            System.out.println("-----------------------------------------");
                            removerP(listaP.getProduto());
                        }
                        if (op5 == 3) {
                            System.out.println("-----------------------------------------");
                            System.out.println("1. Editar descrição");
                            System.out.println("2. Editar quantidade");
                            System.out.println("3. Editar preço");
                            System.out.println("4. Editar fornecedor" + "\n" + "----------------------------------------");
                            System.out.print("Insira sua opção: ");
                            Scanner ssp = new Scanner(System.in);
                            int opP = ssp.nextInt();
                            if (opP == 1) {
                                alterarDescricao(listaP.getProduto());
                            }
                            if (opP == 2) {
                                alterarQuantidade(listaP.getProduto());
                            }
                            if (opP == 3) {
                                alterarPreco(listaP.getProduto());
                            }
                            if (opP == 4) {
                                alterarFornecedor(listaP.getProduto());
                            }
                        }
                        break;

                    case 9:

                        Vendas.vender(listaC.getClientes(), listaP.getProduto(), listaV);
                        break;

                    case 10:

                        listaV.listarVendas(listaV.getVendas());
                        break;

                    case 11:

                        closeDay.fechaDia(listaV.getVendas());
                        break;

                }

            } while (opcao != 12);

        }
        catch (java.util.InputMismatchException e) {
            System.out.println("-----------------------------------------");
            System.out.println("Opção inválida!!");
            System.out.println("-----------------------------------------");
        }
    }

        public static void sistema() {
            System.out.println("Bem vindo ao sistema!" + "\n" + "----------------------------------------");
            System.out.println("1. Cadastrar vendedor");
            System.out.println("2. Cadastrar cliente");
            System.out.println("3. Cadastrar fornecedor");
            System.out.println("4. Cadastrar produto");
            System.out.println("5. Listar vendedores");
            System.out.println("6. Listar clientes");
            System.out.println("7. Listar fornecedores");
            System.out.println("8. Listar produtos");
            System.out.println("9. Registrar vendas");
            System.out.println("10. Listar vendas");
            System.out.println("11. Atividade diária");
            System.out.println("12. Sair" + "\n" + "-----------------------------------------");
            System.out.print("Insira sua opção: ");
        }

        public static void autentica () {
            String user = "adm";
            String senha = "adm123";

            Scanner a = new Scanner(System.in);
            System.out.println("Login sistema administrador");
            System.out.println("-----------------------------------------");
            System.out.print("Usuário: ");
            String usuario = a.nextLine();
            System.out.print("Senha: ");
            String a1 = a.nextLine();


            if (usuario.equals(user) && a1.equals(senha)) {
                System.out.println("-----------------------------------------");
            } else {
                System.out.println("-----------------------------------------");
                System.out.println("Usuário ou senha incorretos!");
                System.out.println("-----------------------------------------");
                autentica();
            }
        }

        public static void removerV (ArrayList < Vendedores > vendedores) {
            autentica();
            System.out.print("Insira o nome do vendedor a ser removido: ");
            Scanner vendedor = new Scanner(System.in);
            String remover = vendedor.next();
            for (int i = 0; i < vendedores.size(); i++) {
                if (vendedores.get(i).getNome().equals(remover)) {
                    System.out.println(remover + " removido do sistema!");
                    remover += vendedores.remove(i);
                    System.out.println("-----------------------------------------");
                }
                else {
                    System.out.println("Vendedor não encontrado");
                }
            }
        }

        public static void removerC (ArrayList < Clientes > clientes) {
            autentica();
            System.out.print("Insira o nome do cliente a ser removido: ");
            Scanner cliente = new Scanner(System.in);
            String remover = cliente.next();
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getNome().equals(remover)) {
                    System.out.println(remover + " removido do sistema!");
                    remover += clientes.remove(i);
                    System.out.println("-----------------------------------------");
                } else {
                    System.out.println("Cliente não encontrado");
                }
            }
        }

        public static void removerF (ArrayList < Fornecedores > fornecedores) {
            autentica();
            System.out.print("Insira o nome do fornecedor a ser removido: ");
            Scanner fornecedor = new Scanner(System.in);
            String remover = fornecedor.next();
            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getNome().equals(remover)) {
                    System.out.println(remover + " removido do sistema!");
                    remover += fornecedores.remove(i);
                    System.out.println("-----------------------------------------");
                } else {
                    System.out.println("Fornecedor não encontrado");
                }
            }
        }

        public static void removerP (ArrayList < Produto > produto) {
            autentica();
            System.out.print("Insira a descrição do produto a ser removido: ");
            Scanner produtos = new Scanner(System.in);
            String remover = produtos.next();
            for (int i = 0; i < produto.size(); i++) {
                if (produto.get(i).getDescricao().equals(remover)) {
                    System.out.println(remover + " removido do sistema!");
                    remover += produto.remove(i);
                    System.out.println("-----------------------------------------");
                } else {
                    System.out.println("Produto não encontrado");
                }
            }
        }

        public static void alterarTelefonev (ArrayList < Vendedores > vendedores) {
            Scanner sa = new Scanner(System.in);
            System.out.println("-----------------------------------------");
            System.out.print("Insira o número de telefone a ser alterado: ");
            int antigo = sa.nextInt();
            System.out.print("Insira o novo número de telefone: ");
            int novo = sa.nextInt();

            for (int i = 0; i < vendedores.size(); i++) {
                if (vendedores.get(i).getTelefone() == antigo) {
                    vendedores.get(i).setTelefone(novo);
                    System.out.println("Número de telefone atualizado!");
                    System.out.println("-----------------------------------------");
                } else {
                    System.out.println("Número de telefone não encontrado!");
                }
            }
        }
        public static void alterarEnderecov (ArrayList < Vendedores > vendedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o endereço a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo endereço: ");
            String novo = sa.nextLine();

            for (int i = 0; i < vendedores.size(); i++) {
                if (vendedores.get(i).getEndereco().equals(antigo)) {
                    vendedores.get(i).setEndereco(novo);
                    System.out.println("Endereço atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Endereço não encontrado!");
                }
            }
        }
        public static void alterarCidadev (ArrayList < Vendedores > vendedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira a cidade a ser alterada: ");
            String antigo = sa.nextLine();
            System.out.print("Insira a nova cidade: ");
            String novo = sa.nextLine();

            for (int i = 0; i < vendedores.size(); i++) {
                if (vendedores.get(i).getCidade().equals(antigo)) {
                    vendedores.get(i).setCidade(novo);
                    System.out.println("Cidade atualizada!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Cidade não encontrada!");
                }
            }
        }
        public static void alterarEstadov (ArrayList < Vendedores > vendedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o estado a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo estado: ");
            String novo = sa.nextLine();

            for (int i = 0; i < vendedores.size(); i++) {
                if (vendedores.get(i).getEstado().equals(antigo)) {
                    vendedores.get(i).setEstado(novo);
                    System.out.println("Estado atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Estado não encontrado!");
                }
            }
        }
        public static void alterarPaisv (ArrayList < Vendedores > vendedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o país a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo país: ");
            String novo = sa.nextLine();

            for (int i = 0; i < vendedores.size(); i++) {
                if (vendedores.get(i).getPais().equals(antigo)) {
                    vendedores.get(i).setPais(novo);
                    System.out.println("País atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else {
                    System.out.println("País não encontrado!");
                }
            }
        }
        public static void alterarLoginv (ArrayList < Vendedores > vendedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o login a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo login: ");
            String novo = sa.nextLine();

            for (int i = 0; i < vendedores.size(); i++) {
                if (vendedores.get(i).getLogin().equals(antigo)) {
                    vendedores.get(i).setLogin(novo);
                    System.out.println("Login atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Login não encontrado!");
                }
            }
        }
        public static void alterarSenhav (ArrayList < Vendedores > vendedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira a senha a ser alterada: ");
            String antigo = sa.nextLine();
            System.out.print("Insira a nova senha: ");
            String novo = sa.nextLine();

            for (int i = 0; i < vendedores.size(); i++) {
                if (vendedores.get(i).getSenha().equals(antigo)) {
                    vendedores.get(i).setSenha(novo);
                    System.out.println("Senha atualizada!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Senha não encontrada!");
                }
            }
        }
        public static void alterarTelefonec (ArrayList < Clientes > clientes) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o número de telefone a ser alterado: ");
            int antigo = sa.nextInt();
            System.out.print("Insira o novo número de telefone: ");
            int novo = sa.nextInt();

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getTelefone() == antigo) {
                    clientes.get(i).setTelefone(novo);
                    System.out.println("Número de telefone atualizado!");
                    System.out.println("-----------------------------------------");
                } else {
                    System.out.println("Número de telefone não encontrado!");
                }
            }
        }
        public static void alterarEnderecoc (ArrayList < Clientes > clientes) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o endereço a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo endereço: ");
            String novo = sa.nextLine();

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getEndereco().equals(antigo)) {
                    clientes.get(i).setEndereco(novo);
                    System.out.println("Endereço atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Endereço não encontrado!");
                }
            }
        }
        public static void alterarCidadec (ArrayList < Clientes > clientes) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira a cidade a ser alterada: ");
            String antigo = sa.nextLine();
            System.out.print("Insira a nova cidade: ");
            String novo = sa.nextLine();

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getCidade().equals(antigo)) {
                    clientes.get(i).setCidade(novo);
                    System.out.println("Cidade atualizada!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Cidade não encontrada!");
                }
            }
        }
        public static void alterarEstadoc (ArrayList < Clientes > clientes) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o estado a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo estado: ");
            String novo = sa.nextLine();

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getEstado().equals(antigo)) {
                    clientes.get(i).setEstado(novo);
                    System.out.println("Estado atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Estado não encontrado!");
                }
            }
        }
        public static void alterarPaisc (ArrayList < Clientes > clientes) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o país a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo país: ");
            String novo = sa.nextLine();

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getPais().equals(antigo)) {
                    clientes.get(i).setPais(novo);
                    System.out.println("País atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else {
                    System.out.println("País não encontrado!");
                }
            }
        }
        public static void alterarNumeroc (ArrayList < Clientes > clientes) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o número a ser alterado: ");
            int antigo = sa.nextInt();
            System.out.print("Insira o novo número: ");
            int novo = sa.nextInt();

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getNumero() == antigo) {
                    clientes.get(i).setNumero(novo);
                    System.out.println("Número atualizado");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Número não encontrado");
                }
            }
        }
        public static void alterarEmail (ArrayList < Fornecedores > fornecedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o email a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo email: ");
            String novo = sa.nextLine();

            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getEmail().equals(antigo)) {
                    fornecedores.get(i).setEmail(novo);
                    System.out.println("Email atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Email não encontrado!");
                }
            }
        }
        public static void alterarTelefonef (ArrayList < Fornecedores > fornecedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o número de telefone a ser alterado: ");
            int antigo = sa.nextInt();
            System.out.print("Insira o novo número de telefone: ");
            int novo = sa.nextInt();

            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getTelefone() == antigo) {
                    fornecedores.get(i).setTelefone(novo);
                    System.out.println("Número de telefone atualizado!");
                    System.out.println("-----------------------------------------");
                } else {
                    System.out.println("Número de telefone não encontrado!");
                }
            }
        }
        public static void alterarCidadef (ArrayList < Fornecedores > fornecedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira a cidade a ser alterada: ");
            String antigo = sa.nextLine();
            System.out.print("Insira a nova cidade: ");
            String novo = sa.nextLine();

            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getCidade().equals(antigo)) {
                    fornecedores.get(i).setCidade(novo);
                    System.out.println("Cidade atualizada!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Cidade não encontrada!");
                }
            }
        }
        public static void alterarEstadof (ArrayList < Fornecedores > fornecedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o estado a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo estado: ");
            String novo = sa.nextLine();

            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getEstado().equals(antigo)) {
                    fornecedores.get(i).setEstado(novo);
                    System.out.println("Estado atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Estado não encontrado!");
                }
            }
        }
        public static void alterarPaisf (ArrayList < Fornecedores > fornecedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o país a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo país: ");
            String novo = sa.nextLine();

            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getPais().equals(antigo)) {
                    fornecedores.get(i).setPais(novo);
                    System.out.println("País atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else {
                    System.out.println("País não encontrado!");
                }
            }
        }
        public static void alterarEnderecof (ArrayList < Fornecedores > fornecedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o endereço a ser alterado: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo endereço: ");
            String novo = sa.nextLine();

            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getEndereco().equals(antigo)) {
                    fornecedores.get(i).setEndereco(novo);
                    System.out.println("Endereço atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Endereço não encontrado!");
                }
            }
        }
        public static void alterarNumerof (ArrayList < Fornecedores > fornecedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira o número a ser alterado: ");
            int antigo = sa.nextInt();
            System.out.print("Insira o novo número: ");
            int novo = sa.nextInt();

            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getNumero() == antigo) {
                    fornecedores.get(i).setNumero(novo);
                    System.out.println("Número atualizado");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Número não encontrado");
                }
            }
        }
        public static void alterarDescricao (ArrayList < Produto > fornecedores) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira a descrição a ser alterada: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo endereço: ");
            String novo = sa.nextLine();

            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getDescricao().equals(antigo)) {
                    fornecedores.get(i).setDescricao(novo);
                    System.out.println("Descrição atualizada!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Descrição não encontrada!");
                }
            }
        }
        public static void alterarQuantidade (ArrayList < Produto > produtos) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira a descrição do produto: ");
            String antigo = sa.nextLine();
            System.out.print("Insira a nova quantidade: ");
            int novo = sa.nextInt();

            for (int i = 0; i < produtos.size(); i++) {
                if (produtos.get(i).getDescricao().equals(antigo)) {
                    produtos.get(i).setQuantidade(novo);
                    System.out.println("Quantidade atualizada!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Descrição não encontrada!");
                }
            }
        }
        public static void alterarPreco (ArrayList < Produto > produtos) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira a descrição do produto: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo preço: ");
            double novo = sa.nextDouble();

            for (int i = 0; i < produtos.size(); i++) {
                if (produtos.get(i).getDescricao().equals(antigo)) {
                    produtos.get(i).setPreco(novo);
                    System.out.println("Preço atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Descrição não encontrada");
                }
            }
        }

        public static void alterarFornecedor (ArrayList < Produto > produtos) {
            Scanner sa = new Scanner(System.in);
            System.out.print("Insira a descrição do produto: ");
            String antigo = sa.nextLine();
            System.out.print("Insira o novo fornecedor: ");
            String novo = sa.nextLine();

            for (int i = 0; i < produtos.size(); i++) {
                if (produtos.get(i).getDescricao().equals(antigo)) {
                    produtos.get(i).setFornecedor(novo);
                    System.out.println("Fornecedor atualizado!");
                    System.out.println("-----------------------------------------");
                }
                else{
                    System.out.println("Descrição não encontrada!");
                }
            }
        }
        public static void fornecedorr (ArrayList < Fornecedores > fornecedores, Listarprodutos listaP) {

            System.out.println("-----------------------------------------");
            Scanner s4 = new Scanner(System.in);
            System.out.print("Descrição: ");
            String descricao = s4.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = s4.nextInt();

            System.out.print("Preço: ");
            double preco = s4.nextDouble();

            System.out.println("-----------------------------------------");
            System.out.println("Fornecedores cadastrados: ");

            for (int i = 0; i < fornecedores.size(); i++) {
                System.out.println(fornecedores.get(i).getNome());
            }

            System.out.println("-----------------------------------------");
            System.out.print("Fornecedor desse produto: ");
            String fornecedor = s4.next();

            for (int j = 0; j < fornecedores.size(); j++) {
                if (fornecedores.get(j).getNome().equals(fornecedor)) {
                    Produto cadastroP = new Produto(descricao, quantidade, preco, fornecedor);
                    listaP.addProdutos(cadastroP);
                    System.out.println("Produto cadastrado!");
                }
                else{
                    System.out.println("Fornecedor não encontrado no sistema!");

                }
            }
        }
}

