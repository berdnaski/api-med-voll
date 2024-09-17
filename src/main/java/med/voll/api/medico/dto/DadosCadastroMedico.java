package med.voll.api.medico.dto;

import med.voll.api.medico.enums.Especialidade;
import med.voll.api.paciente.dto.DadosEndereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEndereco endereco
) {
}
