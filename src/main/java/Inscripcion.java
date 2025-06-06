import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno, List<Materia> materias){
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean aprobada(){
        return materias.stream().
                flatMap(m -> m.getCorrelativas().stream()).
                allMatch(correlativa -> alumno.aprobo(correlativa));
    }
}
