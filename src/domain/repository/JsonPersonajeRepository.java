package domain.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.exceptions.ArchivoPersonajeException;
import domain.model.Personaje;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonPersonajeRepository implements PersonajeRepository {
    private final String ruta;
    public JsonPersonajeRepository(String ruta){
        this.ruta= ruta;
    }

    @Override
    public List<Personaje> getListaPersonajes() throws ArchivoPersonajeException {
        final List<Personaje> personajes = new ArrayList<>();
        try{
            final ObjectMapper mapper = new ObjectMapper();
            final PersonajeData[] datos = mapper.readValue(new File(ruta), PersonajeData[].class);
            final List<PersonajeData> listaDatos = Arrays.asList(datos);
            for(PersonajeData data: listaDatos){
                final Personaje personaje = PersonajeFactory.crearDesdeData(data);
                personajes.add(personaje);
            }
        }catch (Exception e){
            throw new ArchivoPersonajeException("No se pueden cargar los archivos JSON",e);
        }
        return personajes;
    }
}
