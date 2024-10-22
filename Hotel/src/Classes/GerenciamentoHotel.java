package Classes;

import java.util.Scanner;

public class GerenciamentoHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        
        hotel.cadastrarQuarto(new Quarto(101, "Solteiro", 100.0));
        hotel.cadastrarQuarto(new Quarto(102, "Casal", 150.0));
        hotel.cadastrarQuarto(new Quarto(201, "Suite", 200.0));

        
        while (true) {
            System.out.println("1- Cadastrar Reserva");
            System.out.println("2- Check-in");
            System.out.println("3- Check-out");
            System.out.println("4- Gerar Relatório de Ocupação");
            System.out.println("5- Gerar Histórico de Reservas");
            System.out.println("6- Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    System.out.println("Nome do Hospede:");
                    String nome = scanner.nextLine();
                    System.out.println("Data de Check-in:");
                    String dataCheckIn = scanner.nextLine();
                    System.out.println("Data de Check-out:");
                    String dataCheckOut = scanner.nextLine();
                    System.out.println("Numero de Quartos Reservados:");
                    int numeroQuartos = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.println("Tipo de Quarto Reservado:");
                    String tipoQuarto = scanner.nextLine();
                    hotel.cadastrarReserva(new Reserva(nome, dataCheckIn, dataCheckOut, numeroQuartos, tipoQuarto));
                    break;
                case 2:
                    System.out.println("Nome do Hóspede para Check-in:");
                    String nomeCheckIn = scanner.nextLine();
                    hotel.checkIn(nomeCheckIn);
                    break;
                case 3:
                    System.out.println("Nome do Hóspede para Check-out:");
                    String nomeCheckOut = scanner.nextLine();
                    hotel.checkOut(nomeCheckOut);
                    break;
                case 4:
                    hotel.gerarRelatorioOcupacao();
                    break;
                case 5:
                    hotel.gerarHistoricoReservas();
                    break;
                case 6:
                    System.out.println("Obrigado Por Utilizar..");
                    return;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}
