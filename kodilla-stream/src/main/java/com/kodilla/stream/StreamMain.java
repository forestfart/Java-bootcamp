package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        //simple lambda expression example
            //Processor processor = new Processor();
            //Executor codeToExecute = () -> System.out.println("This is an example text executed by lambda fucntion");
            //processor.execute(codeToExecute);

        //more advanced lambda expressions (passing an arguments)
            //ExpressionExecutor expressionExecutor = new ExpressionExecutor();

            //System.out.println("Calculating expressions with lambdas");
            //expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
            //expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
            //expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
            //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

            //System.out.println("Calculating expressions with method references");
            //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
            //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
            //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
            //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //Zadanie z modułu 7.1
        /*String rawPoem = new String ("Jedzą, piją, lulki palą,\n" +
                "Tańce, hulanka, swawola;\n" +
                "Ledwie karczmy nie rozwalą,\n" +
                "Cha cha, chi chi, hejza, hola!\n" +
                "\n" +
                "Twardowski siadł w końcu stoła.\n" +
                "Podparł się w boki jak basza;\n" +
                "\"Hulaj dusza! hulaj!\" - woła,\n" +
                "Śmieszy, tumani, przestrasza.\n" +
                "\n" +
                "Żołnierzowi, co grał zucha,\n" +
                "Wszystkich łaje i potrąca,\n" +
                "Świsnął szablą koło ucha,\n" +
                "Już z żołnierza masz zająca.");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(rawPoem,(Str) -> {
            System.out.println("-------------------\nLambda expression #1\n");
            return Str.toUpperCase();
        });

        poemBeautifier.beautify(rawPoem,(Str) -> {
            System.out.println("-------------------\nLambda expression #2\n");
            return Str.substring(110,200);
        });

        poemBeautifier.beautify(rawPoem,(Str) -> {
            System.out.println("-------------------\nLambda expression #3\n");
            return "ABC   ->>>> " + Str + " <<<<- CBA";
        });

        poemBeautifier.beautify(rawPoem,(Str) -> {
            System.out.println("-------------------\nLambda expression #4\n");
            return Str.replace("Twardowski", "POLITYCZNIE POPRAWNY CZLOWIEK");
        });*/

        //moduł7.2
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
