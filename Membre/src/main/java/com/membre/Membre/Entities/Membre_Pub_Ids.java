package com.membre.Membre.Entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Membre_Pub_Ids implements Serializable {
    private Long publication_id;
    private Long auteur_id;
}
