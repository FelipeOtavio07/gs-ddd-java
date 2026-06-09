package br.com.fiap.application;

import br.com.fiap.domain.entity.Carga;
import br.com.fiap.domain.entity.Envio;
import br.com.fiap.domain.repository.CargaRepository;
import br.com.fiap.domain.repository.EnvioRepository;
import br.com.fiap.domain.service.ServicoLogistica;

public class LogisticaApplication {

    private CargaRepository cargaRepository;
    private EnvioRepository envioRepository;
    private ServicoLogistica servicoLogistica;

    public LogisticaApplication(
            CargaRepository cargaRepository,
            EnvioRepository envioRepository,
            ServicoLogistica servicoLogistica
    ) {
        this.cargaRepository = cargaRepository;
        this.envioRepository = envioRepository;
        this.servicoLogistica = servicoLogistica;
    }

    public void cadastrarCarga(Carga carga) {
        cargaRepository.salvar(carga);
    }

    public void enviarCarga(Long id) {

        Carga carga = cargaRepository.buscarPorId(id);

        if (carga == null) {
            throw new IllegalArgumentException(
                    "Carga não encontrada."
            );
        }

        servicoLogistica.enviarCarga(carga);

        Envio envio = new Envio(
                System.currentTimeMillis(),
                carga
        );

        envioRepository.salvar(envio);
    }

}