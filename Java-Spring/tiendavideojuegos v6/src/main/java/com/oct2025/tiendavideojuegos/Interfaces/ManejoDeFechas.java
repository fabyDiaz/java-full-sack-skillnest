package com.oct2025.tiendavideojuegos.Interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface ManejoDeFechas {
final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
 final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    default LocalDate formatearFecha(String fecha) {
        LocalDate date = LocalDate.parse(fecha, formatter);
        return date;
    }
}
