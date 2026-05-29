package domain.repository;

import domain.exceptions.ArchivoPersonajeException;
import domain.model.Personaje;

import java.util.List;

public interface PersonajeRepository {
     List<Personaje> getListaPersonajes() throws ArchivoPersonajeException;
}
