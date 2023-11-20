package br.edu.infnet.apppawsapi.model.repositories;

import br.edu.infnet.apppawsapi.model.domain.Information;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository extends CrudRepository<Information, Integer> {
}
