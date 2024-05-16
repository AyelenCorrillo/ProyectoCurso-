package ar.org.centro35.colegio.test;

import ar.org.centro35.colegio.entities.Alumnos;
import ar.org.centro35.colegio.repositories.AlumnoRepository;


public class TestAlumnoRepository {

    public static void main(String[] args) {
        
        AlumnoRepository alumnoRepository=new AlumnoRepository();
        Alumnos alumno=new Alumnos();
        alumnoRepository.save(alumno);
        System.out.println(alumno);
        System.out.println("********************************************************************");
        System.out.println(alumnoRepository.getById(10));
        alumnoRepository.remove(alumnoRepository.getById(14));
        System.out.println("********************************************************************");
        alumnoRepository.getAll().forEach(System.out::println);

        System.out.println("********************************************************************");
        alumnoRepository.getLikeNombre("ja").forEach(System.out::println);

    }
    
}
