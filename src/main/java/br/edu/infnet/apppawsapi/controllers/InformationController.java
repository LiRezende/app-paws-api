package br.edu.infnet.apppawsapi.controllers;

import br.edu.infnet.apppawsapi.model.domain.Information;
import br.edu.infnet.apppawsapi.model.services.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/informacao")
public class InformationController {

    @Autowired
    private InformationService informationService;

    @GetMapping(value = "/lista")
    public List<Information> getList() {
        return informationService.getlist();
    }

    @PostMapping(value = "/incluir")
    public Information save(@RequestBody Information information) {
        return informationService.save(information);
    }
}
