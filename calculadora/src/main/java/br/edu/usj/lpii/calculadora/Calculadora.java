package br.edu.usj.lpii.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



    
    @Controller
    public class Calculadora {
        Double resultado;
        String calculo ="";
        @PostMapping(value="/calcular")

        public ModelAndView postCalcular(@RequestParam String num1, @RequestParam String num2, @RequestParam String operacao) {
            
            ModelAndView modelAndView = new ModelAndView("index");
            
            Double num1Double = Double.valueOf(num1);
            Double num2Double = Double.valueOf(num2);
            String operacaoString = String.valueOf(operacao);
            if (operacaoString.equals("+"))
            {
                resultado = num1Double+num2Double;
                calculo = num1 + " + " + num2 + "=" + resultado;
            }
            else if (operacaoString.equals("-")){
                resultado = num1Double-num2Double;
                calculo = num1 + " - " + num2 + "=" + resultado;
            }
            else if (operacaoString.equals("*")){
                resultado = num1Double*num2Double;
                calculo = num1 + " * " + num2 + "=" + resultado;
            }
            else if (operacaoString.equals("/")){
                resultado = num1Double/num2Double;
               
            }
            
            calculo = num1 + operacao + num2 + "=" + resultado;
           

            modelAndView.addObject("calculo", calculo);

            return modelAndView;
        }
        


        }
        

