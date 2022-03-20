package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void bonjour(String nom, String prenom){
        if(nom != null){
            if(prenom != null){
                render(nom,prenom);
            } else {
                render(nom,prenom="localhost");
            }      
        } else {
            if(prenom != null){
                render(nom="localhost",prenom);
            } else {
                render(nom="localhost",prenom="127.0.0.1");
            }
        }
    }
        
}