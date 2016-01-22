package controllers;

import java.util.ArrayList;
import java.util.Date;

import models.Pessoa;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public Result index() {
    	
    	return ok();
    }
    
    public Result pessoas() {
    	
    	ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    	
    	for(int i=0; i<10; i++) {
    		Pessoa pesAtual = new Pessoa();
    		
    		pesAtual.setNome("Robo " + i);
    		pesAtual.setSobrenome("Alias " + Math.random() );
    		pesAtual.setDataNascimento(new Date());
    		
    		listaPessoas.add(pesAtual);
    	}
    	return ok(Json.toJson(listaPessoas));
    }
    
    public Result testeMudanca() {
    	
    	return ok("FUNCIONA");
    	
    }

}
