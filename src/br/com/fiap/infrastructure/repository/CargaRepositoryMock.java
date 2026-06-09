package br.com.fiap.infrastructure.repository;

import br.com.fiap.domain.entity.Carga;
import br.com.fiap.domain.repository.CargaRepository;

import java.util.ArrayList;
import java.util.List;

public class CargaRepositoryMock implements CargaRepository {

    private List<Carga> cargas = new ArrayList<>();

    @Override
    public void salvar(Carga carga) {
        cargas.add(carga);
    }

    @Override
    public Carga buscarPorId(Long id) {

        for (Carga carga : cargas) {
            if (carga.getId().equals(id)) {
                return carga;
            }
        }

        return null;
    }

    @Override
    public List<Carga> listar() {
        return cargas;
    }

    @Override
    public void remover(Long id) {

        Carga carga = buscarPorId(id);

        if (carga != null) {
            cargas.remove(carga);
        }

    }

}