package com.algaworks.testepag.domain.model;

import com.algaworks.testepag.domain.validation.ValidationGroups;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@EqualsAndHashCode (onlyExplicitlyIncluded=true)
@Getter
@Setter

public class Cliente {

    @NotNull(groups = ValidationGroups.ClienteId.class)
    @EqualsAndHashCode.Include
    @Id 
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max=60)
    private String nome;

    @NotBlank
    @Size(max=250)
    @Email
    private String email;

    @NotBlank
    @Size(max=20)
    private String telefone;

}
