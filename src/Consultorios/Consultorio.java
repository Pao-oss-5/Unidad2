package Consultorios;

public class Consultorio {

    public int id;
    public int piso;
    public int numeroConsultorio;
    private Consultorios.Consultorio Consultorio;
    public int getConsultorio;
    public Consultorio(int id, int piso, int numeroConsultorio) {
        this.id = id;
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }
    public Consultorio getConsultorio() {
        return Consultorio;
    }

    public int getId() {
        return id;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

}
