import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    public void testInscripcionAprobada(){
        Materia disenio_Sist = new Materia("Diseño de Sistemas");
        Materia paradigmas_Prog = new Materia("Paradigmas de Programacion");
        Materia algoritmos = new Materia("Algoritmos");

        disenio_Sist.agregarCorrelativa(paradigmas_Prog);
        paradigmas_Prog.agregarCorrelativa(algoritmos);

        Alumno dami = new Alumno("Dami");
        dami.aprobar(algoritmos);
        dami.aprobar(paradigmas_Prog);

        List<Materia> materiasDeseadas = new ArrayList<>();
        materiasDeseadas.add(disenio_Sist);

        Inscripcion inscripcionTest1 = new Inscripcion(dami, materiasDeseadas);

        assertTrue(inscripcionTest1.aprobada(), "La inscripcion debería estar aprobada.");

    }

    @Test
    public void testInscripcionDesaprobada(){
        Materia disenio_Sist = new Materia("Diseño de Sistemas");
        Materia paradigmas_Prog = new Materia("Paradigmas de Programacion");
        Materia algoritmos = new Materia("Algoritmos");

        disenio_Sist.agregarCorrelativa(paradigmas_Prog);
        paradigmas_Prog.agregarCorrelativa(algoritmos);

        Alumno dami = new Alumno("Dami");
        dami.aprobar(algoritmos);

        List<Materia> materiasDeseadas = new ArrayList<>();
        materiasDeseadas.add(disenio_Sist);

        Inscripcion inscripcionTest2 = new Inscripcion(dami, materiasDeseadas);

        assertFalse(inscripcionTest2.aprobada(), "La inscripcion debería estar Desaprobada.");

    }

    @Test
    public void MultiplesMateriasCorrelativasAprobada(){

        Materia fisicaInicial = new Materia("Fisica 1");
        Materia analisisInicial = new Materia("Analisis Matematico 1");
        Materia fisicaAvanzada = new Materia("Fisica 2");

        fisicaAvanzada.agregarCorrelativa(fisicaInicial);
        fisicaAvanzada.agregarCorrelativa(analisisInicial);


        Alumno dami = new Alumno("Dami");
        dami.aprobar(fisicaInicial);
        dami.aprobar(analisisInicial);

        List<Materia> materiasDeseadas = new ArrayList<>();
        materiasDeseadas.add(fisicaAvanzada);

        Inscripcion inscripcionTest3 = new Inscripcion(dami, materiasDeseadas);

        assertTrue(inscripcionTest3.aprobada(), "La inscripcion debería estar Aprobada.");

    }

    @Test
    public void MultiplesMateriasCorrelativasDesprobada(){

        Materia fisicaInicial = new Materia("Fisica 1");
        Materia analisisInicial = new Materia("Analisis Matematico 1");
        Materia fisicaAvanzada = new Materia("Fisica 2");

        fisicaAvanzada.agregarCorrelativa(fisicaInicial);
        fisicaAvanzada.agregarCorrelativa(analisisInicial);


        Alumno dami = new Alumno("Dami");
        dami.aprobar(fisicaInicial);


        List<Materia> materiasDeseadas = new ArrayList<>();
        materiasDeseadas.add(fisicaAvanzada);

        Inscripcion inscripcionTest4 = new Inscripcion(dami, materiasDeseadas);

        assertFalse(inscripcionTest4.aprobada(), "La inscripcion debería estar Desprobada.");

    }

    @Test
    public void MultiplesMateriasDeseadasAprobada(){

        Materia disenio_Sist = new Materia("Diseño de Sistemas");
        Materia paradigmas_Prog = new Materia("Paradigmas de Programacion");
        Materia algoritmos = new Materia("Algoritmos");

        disenio_Sist.agregarCorrelativa(paradigmas_Prog);
        paradigmas_Prog.agregarCorrelativa(algoritmos);


        Materia fisicaInicial = new Materia("Fisica 1");
        Materia analisisInicial = new Materia("Analisis Matematico 1");
        Materia fisicaAvanzada = new Materia("Fisica 2");

        fisicaAvanzada.agregarCorrelativa(fisicaInicial);
        fisicaAvanzada.agregarCorrelativa(analisisInicial);


        Alumno dami = new Alumno("Dami");
        dami.aprobar(fisicaInicial);
        dami.aprobar(analisisInicial);
        dami.aprobar(algoritmos);
        dami.aprobar(paradigmas_Prog);


        List<Materia> materiasDeseadas = new ArrayList<>();
        materiasDeseadas.add(fisicaAvanzada);
        materiasDeseadas.add(disenio_Sist);

        Inscripcion inscripcionTest5 = new Inscripcion(dami, materiasDeseadas);

        assertTrue(inscripcionTest5.aprobada(), "La inscripcion debería estar Aprobada.");

    }

    @Test
    public void MultiplesMateriasDeseadasDesaprobada(){

        Materia disenio_Sist = new Materia("Diseño de Sistemas");
        Materia paradigmas_Prog = new Materia("Paradigmas de Programacion");
        Materia algoritmos = new Materia("Algoritmos");

        disenio_Sist.agregarCorrelativa(paradigmas_Prog);

        Materia fisicaInicial = new Materia("Fisica 1");
        Materia analisisInicial = new Materia("Analisis Matematico 1");
        Materia fisicaAvanzada = new Materia("Fisica 2");

        fisicaAvanzada.agregarCorrelativa(fisicaInicial);
        fisicaAvanzada.agregarCorrelativa(analisisInicial);


        Alumno dami = new Alumno("Dami");
        dami.aprobar(fisicaInicial);
        dami.aprobar(analisisInicial);
        dami.aprobar(algoritmos);
        dami.aprobar(paradigmas_Prog);


        List<Materia> materiasDeseadas = new ArrayList<>();
        materiasDeseadas.add(fisicaAvanzada);
        materiasDeseadas.add(disenio_Sist);

        Inscripcion inscripcionTest6 = new Inscripcion(dami, materiasDeseadas);

        assertTrue(inscripcionTest6.aprobada(), "La inscripcion debería estar Aprobada.");

    }

}