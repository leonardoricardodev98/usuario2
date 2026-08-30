package com.leonardoricardo.usuario.business;


import com.leonardoricardo.usuario.infrastructure.clients.ViaCepClient;
import com.leonardoricardo.usuario.infrastructure.clients.ViaCepDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor

public class ViaCepService {

    private final ViaCepClient client;

    public ViaCepDTO buscarDadosEndereco(String cep) {
            return client.buscaDadosEndereco(processarCep(cep));
    }

    private String processarCep(String cep){
        String cepFormatado = cep.replace(" ", "").
                replace("-", "");

        if (!cepFormatado.matches("\\d+")
                || !Objects.equals(cepFormatado.length(), 8 )) {
            throw new IllegalArgumentException("O cep contem caracteres invalidos, por favor verifique");

        }
        return cepFormatado;
    }

}
