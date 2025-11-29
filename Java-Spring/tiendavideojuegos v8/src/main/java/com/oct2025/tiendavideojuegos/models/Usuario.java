package com.oct2025.tiendavideojuegos.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(nullable = false)
    @NotBlank(message = "Este campo es obligatorio")
    @Size(min = 3, message = "Debe contener al menos 3 caracteres.")
    private String nombre;
    //@Column(nullable = false)
   @NotBlank(message = "Este campo es obligatorio")
    @Size(min = 3, message = "Debe contener al menos 3 caracteres.")
    private String apellido;
    //@Column(nullable = false)
    @NotBlank(message = "Este campo es obligatorio")
    @Email(message = "El email ingresado no es válido")
    private String email;
    //@Column(nullable = false)
    @NotBlank(message = "Este campo es obligatorio.")
    @Size(min = 8, message = "El password necesita tener al menos 8 catacteres.")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$", message = "El password necesita incluir al menos una letra mayúscula, una letra minúscula y un número")
    private String password;
    @Transient
    public String confirmarPassword;
    //@Column(nullable = false)
    private Double coins = 200.0;

    @OneToOne
    @JoinColumn(name = "id_videojuego")
    @Transient
    private VideoJuego miVideoJuego;

    @ManyToMany
    @JoinTable(name = "usuario_videojuego",
                joinColumns = @JoinColumn(name = "id_usuario"),
                inverseJoinColumns = @JoinColumn(name = "id_videojuego")
    )
    List<VideoJuego> comprados;


    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.miVideoJuego = new VideoJuego();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCoins() {
        return coins;
    }

    public void setCoins(Double coins) {
        this.coins = coins;
    }

    public VideoJuego getMiVideoJuego() {
        return miVideoJuego;
    }

    public void setMiVideoJuego(VideoJuego miVideoJuego) {
        this.miVideoJuego = miVideoJuego;
    }

    public List<VideoJuego> getComprados() {
        return comprados;
    }

    public void setComprados(List<VideoJuego> comprados) {
        this.comprados = comprados;
    }
    

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
                + ", password=" + password + "]";
    }

    public String getConfirmarPassword() {
        return confirmarPassword;
    }

    public void setConfirmarPassword(String confirmarPassword) {
        this.confirmarPassword = confirmarPassword;
    }

    
}