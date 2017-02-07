/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.controller;

import br.com.biblioteca.models.Pessoa;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import br.com.biblioteca.repository.PessoaDao;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pessoa")
@Transactional
public class PessoaController {
    
    @Autowired

    private PessoaDao repository;
    
    @RequestMapping(value = "/listar", method=RequestMethod.POST)
    public String formPessoa(Model model){
        List<Pessoa> pessoas = new ArrayList<>();
           model.addAttribute("pessoas", pessoas);
           return ("listar-pessoas");
    }
    
   @RequestMapping(value = "/listar", method = RequestMethod.GET)
   public ModelAndView list(@ModelAttribute ArrayList<Pessoa> pessoas)
   {
      ModelAndView modelAndView = new ModelAndView("product/list");
      pessoas=(ArrayList<Pessoa>) repository.findAll();
      return modelAndView;
   }
    
    
   @RequestMapping("/cadastro")
   public String cadastro(Model model){
       model.addAttribute("pessoa", new Pessoa());
       return "cadastro-pessoa";
   }
   

   
     @RequestMapping("/cadastrar")
   public String cadastrar(@Valid @ModelAttribute Pessoa pessoa, BindingResult bindingResult){
       Pessoa p = repository.findByNome(pessoa.getNome());
       if(p!=null){
           //usuario ja cadastrado
           bindingResult.rejectValue("nome", "error.pessoa", "Pessoa "+p.getNome()+" Já Cadastrada");
            return ("cadastro-pessoa");
          
       }
       if(bindingResult.hasErrors()){
           return "cadastro-pessoa";
       }
       
       repository.save(pessoa);
       return "redirect:listar-pessoas";
   }
     
    
}
    