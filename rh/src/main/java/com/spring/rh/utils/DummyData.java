package com.spring.rh.utils;
  
import com.spring.rh.model.Empresas;
import com.spring.rh.model.Funcionario;
import com.spring.rh.model.Vagas;
import com.spring.rh.repository.EmpresasRepository;
import com.spring.rh.repository.RhRepository;
import com.spring.rh.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Component
public class DummyData {
    @Autowired
    VagasRepository vgRepository;




    @Autowired
    EmpresasRepository emRepository;
    //@PostConstruct // esse metodo rodara toda vez que a aplicação iniciar

    public void saveVagas(){
        List<Vagas> vgList = new ArrayList<>();
        Vagas v1 = new Vagas();
        v1.setNome("Tecnico em Informática - MV INFORMATICA");
        v1.setDescricao("Tecnico em informática, com experiência, salario a combinar, será responsavel por consertos em desktops e notebooks");

        Vagas v2 = new Vagas();
        v2.setNome("Analista Desenvolvedor de Sistemas JAVA - CL TECNOLOGIA");
        v2.setDescricao("Programador Java, com experiência, spring boot, postgresql");

        Vagas v3 = new Vagas();
        v3.setNome("Assistente Administrativo - SC DESIGNER DIGITAL");
        v3.setDescricao("Assistente administrativo - auxiliar na documentação dos projetos, organização e simplatia são pontos fortes");

        Vagas v4 = new Vagas();
        v4.setNome("Vendedor - SC DESIGNER DIGITAL");
        v4.setDescricao("Tratar propostas para novos e antigos cliente");

        Vagas v5 = new Vagas();
        v5.setNome("Porteiro - Condominio São Viselva");
        v5.setDescricao("Cuidar do monitoramento, entrada e saída");

        vgList.add(v1);
        vgList.add(v2);
        vgList.add(v3);
        vgList.add(v4);
        vgList.add(v5);

        for(Vagas em: vgList){// for para percorrer o array e adicionar os indices no rhRepository.save()
            vgRepository.save(em);
            System.out.println("OLA");
        }





    }

    //@PostConstruct // esse metodo rodara toda vez que a aplicação iniciar
    public void saveEmp(){

       List<Empresas> emList = new ArrayList<>();


        Empresas em1 = new Empresas();
        em1.setNome("MM SANTOS");
        em1.setRamo("Informatica");


        Empresas em2 = new Empresas();
        em2.setNome("Santos Brasil");
        em2.setRamo("Portuário");


        Empresas em3 = new Empresas();
        em3.setNome("Grupo Pão de Açucar");
        em3.setRamo("Hypermercados");

        Empresas em4 = new Empresas();
        em4.setNome("MC Donalds");
        em4.setRamo("Restaurantes");

        Empresas em5 = new Empresas();
        em5.setNome("Tivit");
        em5.setRamo("Telemarketing");


        emList.add(em1);
        emList.add(em2);
        emList.add(em3);
        emList.add(em4);
        emList.add(em5);



        for(Empresas em: emList){// for para percorrer o array e adicionar os indices no rhRepository.save()
            emRepository.save(em);
            System.out.println("OLA");
        }






        /*Funcionario func1 = new Funcionario();
        func1.setCargo("Desenvolvedor de Sistemas");
        func1.setCpf("333.333.333.33");
        func1.setDataCadastro(LocalDate.now());
        func1.setDepartamento("Tecnologia da Informação");
        func1.setEndereco("Rua um, nº 2, Bairro Tal, Sao Viselva");
        func1.setMatricula("111.111");
        func1.setNome("Manoel Vitor da Silva");
        func1.setRg("33.333.333-3");
        func1.setSalario(4800);
        func1.setTel("13-3333-5555");
/*
        Funcionario func2 = new Funcionario();
        func2.setCargo("Analista de Crédito");



        func2.setNome("Martim Afonso");
        func2.setCpf("444.333.444.33");
        func2.setRg("33.444.333-4");
        func2.setDepartamento("Finanças");
        func2.setSalario(3500);
        func2.setDataCadastro(LocalDate.now());
        func2.setTel("13-4444-5555");
        func2.setEndereco("Rua dois, nº 132, Bairro Centro, Sao Viselva");
        func1.setMatricula("222.111");
        funcList.add(func2);


        funcList.add(func1);

        for(Funcionario func: funcList){// for para percorrer o array e adicionar os indices no rhRepository.save()
            Funcionario funcSaved = rhRepository.save(func);
            System.out.println("OLA");
        }

    }
*/
}}
