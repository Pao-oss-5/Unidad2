package Consulta;

import Pacientes.Pacientes;

public class Consulta {

    public int id;
    public String fechaHora;
    public Pacientes paciente;
    public medicos.Medico medico;
    public Consultorios.Consultorio consultorio;
    public int getConsultorio;


    public Consulta(int id) {
        this.id = id;
    }

    public Consulta(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Consulta(int id, String fechaHora, Pacientes paciente, medicos.Medico medico) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public Consulta(int id, String fechaHora, Pacientes paciente, medicos.Medico medico, Consultorios.Consultorio consultorio) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public int getId() {
        return id;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public medicos.Medico getMedico() {
        return medico;
    }

    public Consultorios.Consultorio getConsultorio() {
        return consultorio;
    }

    public Object getNumeroConsultorio() {
        return consultorio.getNumeroConsultorio();
    }
}
