package Classes;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Quarto> quartos;
    List<Reserva> reservas;

    public Hotel() {
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void cadastrarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void cadastrarReserva(Reserva reserva) {
        reservas.add(reserva);
        for (Quarto quarto : quartos) {
            if (quarto.tipo.equals(reserva.tipoQuartoReservado) && quarto.disponibilidade) {
                quarto.disponibilidade = false;
                break;
            }
        }
    }

    public void checkIn(String nomeHospede) {
        for (Reserva reserva : reservas) {
            if (reserva.nomeHospede.equals(nomeHospede)) {
                System.out.println("Check-in realizado para " + nomeHospede);
                
                for (Quarto quarto : quartos) {
                    if (quarto.tipo.equals(reserva.tipoQuartoReservado)) {
                        quarto.disponibilidade = false;
                        break;
                    }
                }
                return;
            }
        }
        System.out.println("Reserva não encontrada para " + nomeHospede);
    }

    public void checkOut(String nomeHospede) {
        for (Reserva reserva : reservas) {
            if (reserva.nomeHospede.equals(nomeHospede)) {
                System.out.println("Check-out realizado para " + nomeHospede);
                
                for (Quarto quarto : quartos) {
                    if (quarto.tipo.equals(reserva.tipoQuartoReservado)) {
                        quarto.disponibilidade = true;
                        break;
                    }
                }
                return;
            }
        }
        System.out.println("Reserva não encontrada para " + nomeHospede);
    }

    public void gerarRelatorioOcupacao() {
        int quartosOcupados = 0;
        for (Quarto quarto : quartos) {
            if (!quarto.disponibilidade) {
                quartosOcupados++;
            }
        }
        System.out.println("Numero de quartos ocupados: " + quartosOcupados);
    }

    public void gerarHistoricoReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("Nome do hospede: " + reserva.nomeHospede);
            System.out.println("Data de check-in: " + reserva.dataCheckIn);
            System.out.println("Data de check-out: " + reserva.dataCheckOut);
            System.out.println("Numero de quartos reservados: " + reserva.numeroQuartosReservados);
            System.out.println("Tipo de quarto reservado: " + reserva.tipoQuartoReservado);
            System.out.println("-----");
        }
    }
}
