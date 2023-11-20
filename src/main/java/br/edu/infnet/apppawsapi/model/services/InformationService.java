package br.edu.infnet.apppawsapi.model.services;

import br.edu.infnet.apppawsapi.model.domain.Information;
import br.edu.infnet.apppawsapi.model.repositories.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {

    @Autowired
    private InformationRepository informacaoRepository;

    public List<Information> getlist() {
        return (List<Information>) informacaoRepository.findAll();
    }

    public Information save(Information informacao) {
        return informacaoRepository.save(informacao);
    }
}
