package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {	
        render();
    }
    //route: /saudacao
    public static void saudacao(){
    	System.out.println("Seja bem vindo");
    }
    
    public static void outra(){
    	// renderiza uma pg cuja o seu caminho de diretorio foi passado como parametro 
    	render("Application/outra-pg.html");
    }
    
    public static void imagens(){
    	render("Application/imagens.html");
    }
    // o metodo renderJSON() eh usado para renderizar objetos puramente
    
    
    public static void postaTexto( long id, String titulo, String conteudo, String autor) {
        Texto txt = Texto.findById(id);
        txt.save();
    }
}