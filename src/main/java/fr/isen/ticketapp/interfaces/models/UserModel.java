package fr.isen.ticketapp.interfaces.models;

import java.util.Date;
import fr.isen.ticketapp.interfaces.models.enums.STATUTS;

public class UserModel {
    public int id;

    public String nom;

    public STATUTS statut;

    public Date dateDerniereConnexion;

    public String motDePasse;

    public String email;

}
