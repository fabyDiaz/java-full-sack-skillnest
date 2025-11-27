package cl.fabioladiaz.estudiantes_cursos.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    @NotNull
    @Size(min = 3, message = "Debe contener al menos 3 caracteres.")
    private String nombre; 
    private Date fechaCreacion;
    private Date fechaActualizacion;
    @ManyToMany
    @JoinTable(
       name = "curso_estudiante",
       joinColumns = @JoinColumn(name = "id_curso"),
       inverseJoinColumns = @JoinColumn(name = "id_estudiante"))
    private List<Estudiante> estudiantes;

    public Curso() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @PrePersist
    public void onCreate(){
        this.fechaCreacion = new Date();
        this.fechaActualizacion = new Date();
    }

    @PreUpdate
    public void onUpdate(){
        this.fechaActualizacion = new Date();
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion="
                + fechaActualizacion + ", estudiantes=" + estudiantes + "]";
    }

    

}
