package org.factoriaf5.appfa.config;

import org.factoriaf5.appfa.models.Paciente;
import org.factoriaf5.appfa.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Profile("local")
public class FakeDataLoader {

    private PacienteRepository pacienteRepository;

    @Autowired
    public FakeDataLoader(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @PostConstruct
    void loadFakeData() {
        pacienteRepository.deleteAll();
        pacienteRepository.saveAll(
                List.of(
                        new Paciente (1L, "403998", "646474723", true, false, "archivo.jpg"),
                        new Paciente(2L, "503998", "546474723",false, true, "archivo.png"),
                        new Paciente(2L, "503998", "546474723",  false, true, "archivo.png")

                )
        );
    }
}
