/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.projectsocialmedia.dto;


import java.util.Date;
import lombok.Data;

/**
 *
 * @author Assia
 */
@Data
public class GroupeDto {
    
    private Long id;
    private String libelle;
    private String Description;
    private UtilisateurDto administrateur;
    private Date dateCreation;
    
}
