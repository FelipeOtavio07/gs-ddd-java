import br.com.fiap.application.LogisticaApplication;
import br.com.fiap.domain.entity.Carga;
import br.com.fiap.domain.repository.CargaRepository;
import br.com.fiap.domain.repository.EnvioRepository;
import br.com.fiap.domain.service.ServicoLogistica;
import br.com.fiap.domain.valueobject.Destino;
import br.com.fiap.domain.valueobject.Prioridade;
import br.com.fiap.infrastructure.repository.CargaRepositoryMock;
import br.com.fiap.infrastructure.repository.EnvioRepositoryMock;

public class Main {

    public static void main(String[] args) {

    }
}
public static void main(String[] args) {

    CargaRepository cargaRepository = new CargaRepositoryMock();
    EnvioRepository envioRepository = new EnvioRepositoryMock();

    ServicoLogistica servicoLogistica =
            new ServicoLogistica();

    LogisticaApplication application =
            new LogisticaApplication(
                    cargaRepository,
                    envioRepository,
                    servicoLogistica
            );

    System.out.println("========================================");
    System.out.println(" SISTEMA DE LOGÍSTICA DE SUPRIMENTOS");
    System.out.println("          PARA BASE LUNAR");
    System.out.println("========================================");

    Carga carga = new Carga(
            101L,
            "Oxigênio",
            120,
            Prioridade.ALTA,
            Destino.MODULO_HABITACIONAL
    );

    System.out.println("\nCarga criada:");
    carga.exibirInformacoes();

    application.cadastrarCarga(carga);

    System.out.println("\nCarga cadastrada com sucesso.");

    System.out.println("\nIniciando envio da carga...");

    application.enviarCarga(101L);

    System.out.println("Carga enviada para a Base Lunar.");

    System.out.println("\nStatus atual da carga:");
    carga.exibirInformacoes();

    System.out.println("\n===== FIM DA SIMULAÇÃO =====");
}