package Classes;

public class Reserva {
    String nomeHospede;
    String dataCheckIn;
    String dataCheckOut;
    int numeroQuartosReservados;
    String tipoQuartoReservado;

    public Reserva(String nomeHospede, String dataCheckIn, String dataCheckOut, int numeroQuartosReservados, String tipoQuartoReservado) {
        this.nomeHospede = nomeHospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.numeroQuartosReservados = numeroQuartosReservados;
        this.tipoQuartoReservado = tipoQuartoReservado;
    }
}
