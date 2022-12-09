package com.api.api_user.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nome;
    String login;
    String senha;
    String email;
}
//create table usuario( id int not null AUTO_INCREMENT, nome varchar(255) NOT NULL DEFAULT '', login varchar(255) NOT NULL DEFAULT '', 
//senha varchar(255) NOT NULL DEFAULT '', 
//email varchar(255) NOT NULL DEFAULT '', primary key (id) )