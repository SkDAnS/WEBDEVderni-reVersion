package fr.isen.ticketapp.interfaces.models;

import fr.isen.ticketapp.interfaces.models.enums.ETATSPOSTES;

public class DeviceModel {
    public int id;

    public UserModel utilisateurAffecte;

    public ETATSPOSTES etat;

    public String configuration;

}
