package com.leonardoricardo.usuario.business.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EnderecoDTO {

    private Long id;

    private String rua;

    private Long numero;

    private String complemento;

    private String cidade;

    private String estado;

    private String cep;

}
