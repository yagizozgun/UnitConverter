package webApi.controllers;

import business.conceretes.UnitManager;
import model.dto.UnitRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UnitController {

    @Autowired
    private UnitManager unitManager;

    @PostMapping(value = "/convert", consumes = MediaType.APPLICATION_JSON_VALUE)
    public int convertUnit(@RequestBody UnitRequest request) throws Exception {
        return unitManager.convertUnit(request);
    }

}
