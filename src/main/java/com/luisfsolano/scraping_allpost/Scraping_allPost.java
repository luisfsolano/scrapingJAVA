/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.scraping_allpost;

/**
 *
 * @author lsolano
 */
import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraping_allPost {
	
    public static final String url = "http://200.46.245.230:8080/PortalCAE-WAR-MODULE/SesionPortalServlet?accion=6&NumDistribuidor=99&NomUsuario=usuInternet&NomHost=AFT&NomDominio=aft.cl&Trx=&RutUsuario=0&NumTarjeta=32202680&bloqueable=";
    public static final int maxPages = 20;
	
	
    public static void main (String args[]) {
		
        
            int x=0;
            String urlPage = String.format(url, 1);
            System.out.println("Comprobando entradas de: "+urlPage);
			
            // Compruebo si me da un 200 al hacer la petición
            if (getStatusConnectionCode(urlPage) == 200) {
				
                // Obtengo el HTML de la web en un objeto Document2
                Document document = getHtmlDocument(urlPage);
				
                // Busco todas las historias de meneame que estan dentro de: 
                Elements entradas = document.select("td.verdanabold-ckc");
				
                // Paseo cada una de las entradas
                for (Element elem : entradas) {
                    String saldo = elem.getElementsByClass("verdanabold-ckc").text();
		    if(x==1){
                        System.out.println("saldo todal: "+saldo);
                        x=0;
                    }
                    
                    if (saldo.equals("Saldo tarjeta:")) {
                        x=1;
                    }
                    
                    
					
                }
		
            }else{
                System.out.println("El Status Code no es OK es: "+getStatusConnectionCode(urlPage));
            }
        
    }
	
	
    /**
     * Con esta método compruebo el Status code de la respuesta que recibo al hacer la petición
     * EJM:
     * 		200 OK			300 Multiple Choices
     * 		301 Moved Permanently	305 Use Proxy
     * 		400 Bad Request		403 Forbidden
     * 		404 Not Found		500 Internal Server Error
     * 		502 Bad Gateway		503 Service Unavailable
     * @param url
     * @return Status Code
     */
    public static int getStatusConnectionCode(String url) {
		
        Response response = null;
		
        try {
            response = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).ignoreHttpErrors(true).execute();
        } catch (IOException ex) {
            System.out.println("Excepción al obtener el Status Code: " + ex.getMessage());
        }
        return response.statusCode();
    }
	
	
    /**
     * Con este método devuelvo un objeto de la clase Document con el contenido del
     * HTML de la web que me permitirá parsearlo con los métodos de la librelia JSoup
     * @param url
     * @return Documento con el HTML
     */
    public static Document getHtmlDocument(String url) {

        Document doc = null;

        try {
            doc = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).get();
        } catch (IOException ex) {
            System.out.println("Excepción al obtener el HTML de la página" + ex.getMessage());
        }

        return doc;

    }
}