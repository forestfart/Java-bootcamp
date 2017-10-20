package com.kodilla.stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
//import com.kodilla.stream.person.People;
//import com.kodilla.stream.beautifier.PoemBeautifier;
//import com.kodilla.stream.beautifier.PoemDecorator;
//import com.kodilla.stream.iterate.NumbersGenerator;
//import com.kodilla.stream.lambda.*;
//import com.kodilla.stream.reference.FunctionalCalculator;
//import com.kodilla.stream.book.Book;
//import com.kodilla.stream.book.BookDirectory;
//import java.util.List;


public class StreamMain {
    public static void main(String[] args) {

        //zadanie z modułu 7.3

        Forum forumDirectory = new Forum();

        Map<Integer, ForumUser> theResultMapOfForum = forumDirectory.getList().stream()
                .filter(user -> Period.between(user.getUserDOB(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getUserPostCount() >= 1)
                .filter(user -> user.getUserSex() == (char)'M')
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForum.size());
        theResultMapOfForum.entrySet().stream()
                .map(user -> user.getKey() + ": " + user.getValue())
                .forEach(System.out::println);


        //moduł 7.3
        /*People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/

        // metoda Collectors.toList()
//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);*/

//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);


        // metoda Collectors.toMap(key, value)
        //BookDirectory theBookDirectory = new BookDirectory();

/*        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

        //metoda Collectors.joining(..., ..., ...)

/*        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

    //moduł7.1
/*    simple lambda expression example
    Processor processor = new Processor();
    Executor codeToExecute = () -> System.out.println("This is an example text executed by lambda fucntion");
    processor.execute(codeToExecute);

    more advanced lambda expressions (passing an arguments)
    ExpressionExecutor expressionExecutor = new ExpressionExecutor();

    System.out.println("Calculating expressions with lambdas");
    expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
    expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
    expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
    expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

    System.out.println("Calculating expressions with method references");
    expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
    expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
    expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
    expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/

    //Zadanie z modułu 7.1
/*        String rawPoem = new String ("Jedzą, piją, lulki palą,\n" +
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
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
    }
}
