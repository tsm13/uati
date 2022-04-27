package br.com.uati.utils;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClientWebTarget {
	@Value("${service.url}")
	private String url;
	
    public WebTarget client(){
        Client client = ClientBuilder.newClient();
        return client.target(url);
    }
}