package com.example.demo.Controller;

import com.example.demo.Entity.Piste;
import com.example.demo.Service.IPisteService;
import com.example.demo.Service.PisteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/piste")
public class PisteController {
    @Autowired
    private IPisteService service;


    @GetMapping("/get-all-pistes")
    public List<Piste> getAllPistes() {
        List<Piste> listPistes = service.getAllPiste();
        return listPistes;

    }

    @Operation(description="recuperer une piste")
    @ApiResponses(value={
            @ApiResponse(responseCode="200",description="piste trouve",
            content={@Content (mediaType="application/json",
            schema=@Schema (implementation=Piste.class))}),
            @ApiResponse(responseCode="400",description="piste ID invalid", content = @Content),
            @ApiResponse(responseCode="404",description="piste NON trouve", content = @Content)

    })
    @GetMapping("/get-piste/{piste-num}")
    public Piste getPiste(@PathVariable( "piste-num")Long id) {
        Piste piste = service.getpisteById(id);
        return piste;

    }
    @PostMapping("/add-piste")
    public Piste addPiste(@RequestBody Piste p) {
        Piste piste = service.addPiste(p);
       return  p ;
    }
    @DeleteMapping("/remove-piste/{piste-num}")
    public void removePiste(@PathVariable("piste-num") Long numPiste) {
        service.deletePiste(numPiste);
    }
    @PutMapping("/update-piste")
    public void updatePiste(@RequestBody Piste p) {
        service.updatePiste(p);

    }
}