package Com.br.varsolutions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import  java.util.*;
import java.util.Scanner;


@RestController
@RequestMapping("/pessoa")
@CrossOrigin(origins="*")
@Slf4j
public class PessoaController {

    //EndPoint

    @GetMapping
    public ResponseEntity<Object> get(){
        PessoaRequest pessoaRequest1 = new PessoaRequest();
        pessoaRequest1.setNome("Pedro");
        pessoaRequest1.setSobrenome("Leonardo");
        pessoaRequest1.setEndereco("Estrada do pequia");
        pessoaRequest1.setIdade(23);
        pessoaRequest1.setSalario(2000.00);

        return ResponseEntity.ok(pessoaRequest1);
    }


    @GetMapping("/resumo")
    public ResponseEntity<Object> getPessoa(@RequestBody PessoaRequest pessoaRequest){
        String imc = null;
        int idade = 0;
        String impostoRenda = null;
        String validaTime = null;

        if (!pessoaRequest.getNome().isEmpty()){

        log.info("iniciando o processo de resumo da pessoa: ", pessoaRequest);

        if (Objects.nonNull(pessoaRequest.getAltura()) && Objects.nonNull(pessoaRequest.getPeso())){
            log.info("iniciando o calculo de IMC ");
            imc = calculandoIMC(pessoaRequest.getPeso(), pessoaRequest.getAltura());
        }

        if (Objects.nonNull(pessoaRequest.getIdade())){
        log.info("Calculando a idade ");
        idade = calculandoIdade(pessoaRequest.getIdade());
        }

        if (Objects.nonNull(pessoaRequest.getSalario())){
        log.info("iniciando o calculldo imposto de renda");
        impostoRenda=calculoImposto(pessoaRequest.getSalario());
        }

        if(Objects.nonNull(pessoaRequest.getTime())){
        log.info("Verifiando o time");
         validaTime= calculoTime(pessoaRequest.getTime());
        }

        if(Objects.nonNull(pessoaRequest.getSaldo())){
            log.info("Convertendo Real em dolar ");
            validaTime= ConverteReal(pessoaRequest.getSaldo());
        }

                log.info("montando objeto de retorno para o FrontEnd");
        Object resumo = montarRespostaFrondEnd(imc, idade, impostoRenda, validaTime);


        return ResponseEntity.ok(resumo);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    private String ConverteReal(double saldo) {
        return null;
    }

    private Object montarRespostaFrondEnd(String imc, int idade, String impostoRenda, String validaTime) {
        return null;
    }

    private String calculoTime(String time) {
        return null;
    }

    private String calculoImposto(double salario) {
        return null;
    }

    private int calculandoIdade(int idade) {
        return 0;
    }

    private String calculandoIMC(float peso, float altura) {
        return null;
    }























    //Fiz por conta e nao funciona do jeito esperado
    public List<String> resumoPessoa (){
        PessoaRequest person = new PessoaRequest();
        Scanner scan = new Scanner(System.in);
        List<String> Listresumo = new ArrayList<>();


        for(int i = 0;i<2;i++) {
            System.out.println("Qual seu nome ? ");
            String nome = scan.next();

            String resumo = "Seu nome é " + nome;
        Listresumo.add(resumo);
        }
        return Listresumo;

        }

}
