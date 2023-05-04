package com.ps.registro.services;
import com.ps.registro.modelo.Registro;
import com.ps.registro.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class RegistroService implements  IRegistroService {

    @Autowired
    RegistroRepository registroRepository;
    @Autowired
    PersonaService personaService;

    @Transactional()
    @Override
    public Registro guardar(Registro registro) throws Exception {



        if (registro.getRegistro() == null || registro.getRegistro().equals("")) {
            throw new Exception("La fecha es requerida para crear el registro");
        }

        if (registro.getPersona() == null) {
            throw new Exception("El usuario es requerido para realizar el registro");
        }
        personaService.consultar(registro.getPersona().getId());


        return registroRepository.save(registro);
    }

    @Override
    @Transactional()
    public Registro consultar(Long id) throws Exception {

        if (id == null || id < 1) {
            throw new Exception("El id enviado no es valido");
        }

        Optional<Registro> optionalRegistro = registroRepository.findById(id);
        if (!optionalRegistro.isPresent()){
            throw new Exception("El id enviado no es valido");

        }
        return optionalRegistro.get();
    }

    @Override
    @Transactional()
    public Registro actualizar(Registro registro) throws Exception {

        Registro resultado = consultar((long) registro.getId());

        if (registro.getRegistro() == null || registro.getRegistro().equals("")) {
            throw new Exception("El usuario no tiene fecha de registro");
        }

        if (registro.getPersona() == null || registro.getPersona().equals("")) {
            throw new Exception("El usuario no tiene asignado ID");
        }


        return registroRepository.save(registro);
    }


    @Override
    @Transactional()
    public void borrar(Long id) throws Exception {

        if (id == null || id < 1) {
            throw new Exception("El id enviado no es valido");
        }

        registroRepository.deleteById(id);
    }

}
