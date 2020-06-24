package com.utn.resttemplateSwagger.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Integer id;

    private String user;

    private String password;

    private String name;

    private String lastname;

    private String dni;


}