package com.spring.rh.controller;


import com.spring.rh.model.Empresas;
import com.spring.rh.model.Funcionario;
import com.spring.rh.model.Vagas;
import com.spring.rh.service.EmService;
import com.spring.rh.service.RhService;
import com.spring.rh.service.VgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.context.ApplicationContext;


import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
public class RhController {
    @Autowired
    private ApplicationContext context;

    @Autowired
    VgService vgService;

    @Autowired
    RhService rhService;
    // não precisa chamar o RhServiceImp, como o esta implementando já , pode ser referenciado da mesma maneira.
    @Autowired
    EmService emService;

    @RequestMapping(value = "/funcs", method = RequestMethod.GET) // CAMINHO PARA ACIONAR O  METODO, METODO DE REQUISIÇÃO GET
    public ModelAndView getFunc(){   // CLASSE DO TIPO ModelAndView RETORNARÁ O MODEL E VIEW: OU SEJA DADOS DO BANCO E OS TEMPLATES HTML
        ModelAndView mv = new ModelAndView("funcs");
        List<Funcionario> funcs = rhService.findAll(); // para retornar todas as linhas do banco de dados, em forma de lista
        mv.addObject("funcs", funcs);
        return mv;
    }

    @RequestMapping(value = "/emp", method = RequestMethod.GET) // CAMINHO PARA ACIONAR O  METODO, METODO DE REQUISIÇÃO GET
    public ModelAndView getEmp(){   // CLASSE DO TIPO ModelAndView RETORNARÁ O MODEL E VIEW: OU SEJA DADOS DO BANCO E OS TEMPLATES HTML
        ModelAndView mv = new ModelAndView("emp");
        List<Empresas> emp = emService.findAll(); // para retornar todas as linhas do banco de dados, em forma de lista
        mv.addObject("emp", emp);
        return mv;

    }

    @RequestMapping(value = "/vg", method = RequestMethod.GET) // CAMINHO PARA ACIONAR O  METODO, METODO DE REQUISIÇÃO GET
    public ModelAndView getVg(){   // CLASSE DO TIPO ModelAndView RETORNARÁ O MODEL E VIEW: OU SEJA DADOS DO BANCO E OS TEMPLATES HTML
        ModelAndView mv = new ModelAndView("vg");
        List<Vagas> vg = vgService.findAll(); // para retornar todas as linhas do banco de dados, em forma de lista
        mv.addObject("vg", vg);
        return mv;

    }


    @RequestMapping(value = "/funcs/{id}", method = RequestMethod.GET)
    public ModelAndView getFuncDetalhes(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("funcsDetalhes");
        Funcionario func = rhService.findById(id);
        mv.addObject("func", func);
        return mv;
    }



    @RequestMapping(value = "/atualizar/{id}", method = RequestMethod.GET)
    public ModelAndView getFuncUp(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("funcsUpdate");
        Funcionario func = rhService.findById(id);
        mv.addObject("func", func);
        return mv;
    }

    @RequestMapping(value="/consult",method = RequestMethod.GET)
    public String getConsult(){
        return "redirect:/funcs";
    }



    @RequestMapping(value="/novoFunc",method = RequestMethod.GET)
    public String getFuncForm(){
        return "/funcsForm";
    }

    @RequestMapping(value="/novoFunc",method = RequestMethod.POST)
    public String saveFunc(@Valid Funcionario func , BindingResult result, RedirectAttributes att){
        if(result.hasErrors()) {
            att.addFlashAttribute("mensagem","Verifique se os campos obrigatórios foram preenchidos");
            //SEMPRE QUE O ATRIBUTO MENSAGEM FOR CHAMADO NO THYMELEAF SERA ACIONADO A MENSAGEM
            return "redirect:/novoFunc";
        }
        func.setDataCadastro(LocalDate.now());
        rhService.save(func);
        return "redirect:/funcs";
    }




    @RequestMapping(value="/up/{id}",method = RequestMethod.POST)
    public String upFunc(@Valid Funcionario func , BindingResult result, RedirectAttributes att, @PathVariable("id") long id){
        if(result.hasErrors()) {
            att.addFlashAttribute("mensagem","Verifique se os campos obrigatórios foram preenchidos");
            //SEMPRE QUE O ATRIBUTO MENSAGEM FOR CHAMADO NO THYMELEAF SERA ACIONADO A MENSAGEM
            return "redirect:/funcs";
        }
        func.setId(id);
        rhService.save(func);
        return "redirect:/funcs";
    }


    @RequestMapping(value="/apagar/{id}",method = RequestMethod.POST)
    public String deletar(@PathVariable("id") long id){
        rhService.deleteById(id);
        return "redirect:/funcs";
    }





}
