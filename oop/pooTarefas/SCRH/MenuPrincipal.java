package SCRH;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        int contador = 0;
        Reserva[] reservas = new Reserva[10];  // 10 por ser op maximo pedido na tarefa
        Scanner sc = new Scanner(System.in);
        String respost;

        System.out.println("Bem vindo ao nosso hotel");
        System.out.println("Qual das opções deseja?");
        do {
        System.out.println("----------------------- MENU PRNCIPAL -----------------------");
        System.out.println("1 - Cadastrar nova reserva");
        System.out.println("2 - Listar reservas");
        System.out.println("3 - Buscar reservas");
        System.out.println("4 - Ordenar reservas");
        System.out.println("5 - Sair");

        respost = sc.nextLine();

        switch (respost.toLowerCase()){
            case "1": // cadastrar nova reserva
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite seu CPF: ");
                String cpf = sc.nextLine();

                String tipo;  //criando variaveis sem valores para usalas dentro do escopos para não correr o risco de nn serem inicializadas em outros metodos
                double valorQuatos = 0;
                boolean valido = false;
                do{
                System.out.println("Digite o tipo de quarto que deseja: ");
                System.out.println("1 - Standard" + " (Quarto mais simples que temos e mais barato)");
                System.out.println("2 - Luxo" + " (Quarto de alto padrão com adicionais, mais caro)");
                System.out.println("3 - Presidencial" + " (Quarto de maior padrão, com adicionais melhores e hidromassagem)");
                tipo = sc.nextLine();
                if (tipo.equals("1") || tipo.equals("2") || tipo.equals("3")){  //condicional para verificar as 3 unicas opções de quartos
                    switch (tipo){
                        case "1":
                            tipo =  "Standard";
                            valorQuatos = 75.0;
                            break;
                        case "2":
                            tipo = "Luxo";
                            valorQuatos = 150.0;
                            break;
                        case "3":
                            tipo = "Presidencial";
                            valorQuatos = 300.0;
                            break;
                    }
                    break;
                }else {
                    System.out.println("OPÇÃO INVALIDA!!! ");
                    System.out.println();
                    valido = false;
                }
                }while (!valido); //pode não ser a melhor forma, mais funciona

                int dias;

                do{
                System.out.println("Digite a quantidade de dias que deseja se hospedar: "); //condicional para verificar que os dias não sejam negativos
                    dias = sc.nextInt();
                    if (dias <= 0 ){
                        System.out.println("DIGITE UMA QUANTIDADE VALIDA DE DIAS!!!");
                        System.out.println();
                        System.out.println("Digite novamente!");
                        System.out.println();
                    }
                    }while(dias <= 0);

                sc.nextLine();
                Reserva Hospedagem = new Reserva(nome, tipo, cpf, dias, valorQuatos); //criação do objeto RESERVA
                reservas[contador] = Hospedagem;
                contador++;
                    System.out.println("Reserva Cadastrada com sucesso!");

                break;
            case "2":// Listar as reservas ja feitas com condicional caso nenhuma reserva tenha sido feita
                if (contador == 0) {
                    System.out.println("Nenhuma reserva encontrada!");
                    System.out.println();
                    break;
                }
                System.out.println("------------------------------------LISTA DE HOPEDAGEM------------------------------------");
                for (int i = 0; i < contador; i++) {
                    System.out.println("HOSPEDAGEM DE NUMERO " + (i + 1));
                    System.out.println(reservas[i].toString());
                    System.out.println();

                    }
                break;
            case "3": //fazer busca de rezervas atraves de nome ou CPF
                System.out.println("Deseja buscar por:");
                System.out.println("1 - Nome");
                System.out.println("2 - CPF");

                String Busca = sc.nextLine();

                switch (Busca){  //opções para busca de nome e cpf
                    case "1": {
                        System.out.println("Digite o nome que deseja buscar: ");
                        String nomeBusca = sc.nextLine();
                        boolean encontrar = false;

                        for (int i = 0; i < contador; i++) {
                            if (nomeBusca.equalsIgnoreCase(reservas[i].getNomeHospede())) {
                                System.out.println("Reserva encontrada!");
                                System.out.println();
                                System.out.println("HOSPEDAGEM DE NUMERO " + (i + 1));
                                System.out.println(reservas[i].toString());
                                encontrar = true;
                            }
                        }

                        if (!encontrar){
                            System.out.println("Nenhuma reserva encontrada!");
                        }

                        break;

                    }

                    case "2": {
                        System.out.println("Digite o CPF que deseja buscar: ");
                        String cpfBusca = sc.nextLine();

                        boolean encontrar =  false;

                        for (int i = 0; i < contador; i++) {
                            if(cpfBusca.equalsIgnoreCase(reservas[i].getCpf())){
                                System.out.println("Reserva encontrada!");
                                System.out.println();
                                System.out.println("HOSPEDAGEM DE NUMERO " + (i + 1));
                                System.out.println(reservas[i].toString());

                                encontrar = true;
                            }
                        }

                        if (!encontrar){
                            System.out.println("Nenhuma reserva encontrada!");
                        }
                        break;
                    }

                }
                break;
            case "4", "Ordenar reservas": // usando bubble sort para fazer a reorganização dos vetores de reservas
                for (int i = 0; i < contador; i++) {
                    for (int j = i; j < contador; j++) {
                        if (reservas[j].getNumeroDiasDiaria() > reservas[i].getNumeroDiasDiaria()) {
                            int aux =  reservas[i].getNumeroDiasDiaria();
                            reservas[i].setNumeroDiasDiaria(reservas[j].getNumeroDiasDiaria());
                            reservas[j].setNumeroDiasDiaria(aux);
                        }
                    }
                }
                for (int i = 0; i < contador; i++) {
                    System.out.println("============================ RESERVAS ORDENADAS POR DIAS ============================");
                    System.out.println(reservas[i].toString());
                }
            }
        }while(!respost.equalsIgnoreCase("5")); //final do menu
        sc.close();
    }
}
