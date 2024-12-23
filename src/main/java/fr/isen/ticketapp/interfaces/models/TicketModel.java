package fr.isen.ticketapp.interfaces.models;

import java.util.Date;
import fr.isen.ticketapp.interfaces.models.enums.ETATSTICKETS;
import fr.isen.ticketapp.interfaces.models.enums.IMPACTS;

public class TicketModel {
    public int id;

    public IMPACTS impact;

    public String titre;

    public String description;

    public ETATSTICKETS etat;

    public String typeDeDemande;

    public Date DateEtHeureCreationEtMiseAJour;

    public UserModel UtilisateurCreateur;

    public DeviceModel PosteInformatique;

}
