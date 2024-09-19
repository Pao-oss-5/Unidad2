package Hospital;

import Consulta.Consulta;
import Consultorios.Consultorio;
import medicos.Medico;
import Paciente.Paciente;

import java.util.ArrayList;

public class hospital {

    public ArrayList<Paciente> listaPacientes = new ArrayList<>();

    public ArrayList<Medico> listaMedicos= new ArrayList<>();

    public ArrayList<Consulta> listaConsultas = new ArrayList<>();

    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();
    private Consultorios.Consultorio consultorio;

    public void registrarPaciente(Paciente paciente){
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico){
        this.listaMedicos.add(medico);
    }

    public void registrarConsulta(Consulta consulta){
        //Consulta consulta1 = new Consulta(12,"24-08-10", Pac1, Med1, Cons1);
        // no exista una consulta en esa fecha

        if(!validarDisponibilidadFechaConsulta(consulta.getFechaHora(), consulta.getConsultorio(), consulta.getNumeroConsultorio())){
            System.out.println("Ya existe una consulta registrada para esa fecha ");
            return;
        }

        // validar que no exista consulta en esa misma fecha y consultorio
        // que la fecha sea valida
        // que el medico esté disponible
        // que el paciente no tenga consultas en esa fecha

    }

    public boolean validarDisponibilidadFechaConsulta(String fechaHora, Consultorio  consultorio, Object numeroConsultorio) {
        this.consultorio = consultorio;
        return false;
    }

    public void registrarConsultorio(Consultorio consultorio){
        this.listaConsultorios.add(consultorio);
    }

    private boolean validarDisponibilidadFechaConsulta(String fechaDeseada, int numeroConsultorio) {
        for (Consulta consulta : this.listaConsultas) {
            if (consulta.getFechaHora().equals(fechaDeseada))
                if (numeroConsultorio == consulta.getConsultorio) {
                    return false;
                }
        }
        return false;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
}
