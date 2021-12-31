package by.academy.homework7.Ex3;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {
    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("Тест начался: " + description.getMethodName());
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("Произошла ошибка: " + failure.getException());
    }

    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("Тест завершился: " + description.getMethodName());
    }
}
