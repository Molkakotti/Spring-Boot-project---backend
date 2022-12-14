package com.membre.Membre.proxies;


import com.membre.Membre.beans.PublicationBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface PublicationProxyServices {

    @GetMapping("/publication/{id}")
    public PublicationBean recupererUnePublication(@PathVariable(name="id") Long id);
}
