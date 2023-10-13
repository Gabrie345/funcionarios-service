package br.com.example.funcionariosservice.funcionariosservice.controller.mapper;

import br.com.example.funcionariosservice.funcionariosservice.controller.dto.FuncionarioDto;
import br.com.example.funcionariosservice.funcionariosservice.controller.exception.InvalidCpfException;
import br.com.example.funcionariosservice.funcionariosservice.entity.FuncionarioEntity;

public class FuncionarioMapper {
    public FuncionarioEntity passerFuncionarioDtoParaFuncionario(FuncionarioDto funcionarioDto) throws Exception {
        FuncionarioEntity entity = new FuncionarioEntity();
        entity.setNome(funcionarioDto.getNome());
        entity.setSobrenome(funcionarioDto.getSobrenome());
        entity.setSexo(funcionarioDto.getSexo());
        entity.setCargo_id(funcionarioDto.getCargoId());
        entity.setSalario(funcionarioDto.getSalario());
        entity.setCidade(funcionarioDto.getCidade());
        entity.setEstado(funcionarioDto.getEstado());
        entity.setCep(funcionarioDto.getCep());
        entity.setEmail(funcionarioDto.getEmail());
        entity.setNumeroDeTelefone(funcionarioDto.getNumeroDeTelefone());

        //precisa validar
        entity.setChefiaId(funcionarioDto.getChefiaId());
        entity.setChefiaNome(funcionarioDto.getChefiaNome());
        entity.setEnderecoCompleto(funcionarioDto.getCidade()+
                ", "+funcionarioDto.getEstado()+
                ", "+funcionarioDto.getCep());

        //precisa validar se as datas estão corretas
        entity.setDataDeContratacao(funcionarioDto.getDataDeContratacao());
        entity.setDataDeNascimento(funcionarioDto.getDataDeNascimento());
        if(isValidCPF(funcionarioDto.getCpf())) entity.setCpf(funcionarioDto.getCpf());
        return entity;
    }


    public static boolean isValidCPF(String cpf) throws Exception {
        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            throw new InvalidCpfException("CPF deve ter 11 dígitos");
        }
        // Calcula o primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(cpf.charAt(i));
            sum += digit * (10 - i);
        }
        int remainder = sum % 11;
        int firstVerifier = (remainder < 2) ? 0 : (11 - remainder);
        // Verifica o primeiro dígito verificador
        if (Character.getNumericValue(cpf.charAt(9)) != firstVerifier) {
            throw new InvalidCpfException("CPF invalido");
        }
        // Calcula o segundo dígito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            int digit = Character.getNumericValue(cpf.charAt(i));
            sum += digit * (11 - i);
        }
        remainder = sum % 11;
        int secondVerifier = (remainder < 2) ? 0 : (11 - remainder);
        // Verifica o segundo dígito verificador
        return Character.getNumericValue(cpf.charAt(10)) == secondVerifier;
    }
}

