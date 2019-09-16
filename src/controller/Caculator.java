package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Caculator {

    @RequestMapping("/calculate")

    public ModelAndView calculate(@RequestParam(name="firstOperand", defaultValue = "0") float firstNumber,
                                  @RequestParam(name="secondOperand", defaultValue = "0") float secondNumber,
                                  @RequestParam(name="operator", defaultValue = "addition") String operator) {
        ModelAndView modelAndView = new ModelAndView("caculator");
        modelAndView.addObject("firstOperand", firstNumber);
        modelAndView.addObject("secondOperand", secondNumber);
        modelAndView.addObject("operator", operator);
        float result;
        switch (operator) {
            case "addition":
                result = firstNumber + secondNumber;
                break;
            case "subtraction":
                result = firstNumber - secondNumber;
                break;
            case "multiplication":
                result = firstNumber * secondNumber;
                break;
            case "division":
                result = firstNumber / secondNumber;
                break;
            default:
                result = 0;




        }
        modelAndView.addObject("result", result);

        return modelAndView;
    }
}
