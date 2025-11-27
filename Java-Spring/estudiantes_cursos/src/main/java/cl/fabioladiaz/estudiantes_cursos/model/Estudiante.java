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
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @NotNull
    @Size(min = 3, message = "Debe contener al menos 3 caracteres.")
    public String nombre; 
    @NotNull
    @Size(min = 3, message = "Debe contener al menos 3 caracteres.")
    public String apellido;
    @Min(1)
    public Integer edad;
    public Date fechaCreacion;
    public Date fechaActualizacion;
   
    @ManyToMany
    @JoinTable(
       name = "curso_estudiante",
       joinColumns = @JoinColumn(name = "id_estudiante"),
       inverseJoinColumns = @JoinColumn(name = "id_curso"))
    public List<Curso> cursos;

    public Estudiante() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
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
        return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
                + ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion=" + fechaActualizacion + ", cursos="
                + cursos + "]";
    }

    

}
