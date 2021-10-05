package com.kodilla.stream;

/*import com.kodilla.stream.beautifier.FunctionalBeautifier;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;*/

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        /*System.out.println("Welcome to module 7 - Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        processor.execute(new ExecuteSaySomething());

        Executor codeToExecute = () -> System.out.println("This is an example text from lambda expression with Executor variable.");
        processor.execute(codeToExecute);

        processor.execute(() -> System.out.println("This is an example text from lambda expression as method argument."));

        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(4, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(4, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(4, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(4, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(4, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(4, 5, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(4, 5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(4, 5, FunctionalCalculator::divideAByB);

        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("Example text.", FunctionalBeautifier::upperCase);
        beautifier.beautify("Example text.", FunctionalBeautifier::addStars);
        beautifier.beautify("Example text.", FunctionalBeautifier::replacingUpperX);
        beautifier.beautify("Example text.", FunctionalBeautifier::concatingText);

        System.out.println("Using Stream to generate even numbers from 1 to 20.");
        NumbersGenerator.generateEven(20);*/

        /*People.getList().stream()
                .filter(s -> s.length() > 11)
                .map(s -> s.toUpperCase())
                .map(s -> s.substring(0, s.indexOf(' ') + 2) +".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMap = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMap.size());
        theResultMap.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining("\n","<<",">>"));
        System.out.println(theResultStringOfBooks);*/

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthdayDate().getYear() < 2001)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(forumUser -> forumUser.getID(), forumUser -> forumUser));

        System.out.println(theResultMap.toString());
    }
}
