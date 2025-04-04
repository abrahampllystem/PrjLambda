package pe.com.demo.java.prjlambda.real_applications;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ConcurrenceLambdas {


    static Runnable printerSum = ()->{
        long result=0;
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<10000000;i++) {
            result+=i;
        }
        System.out.println("Sum result: "+result);
    };


    static Callable<Long> getSum =() ->{
        long result=0;
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<10000000;i++) {
            result+=i;
        }
        return result;
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        var exec = Executors.newSingleThreadExecutor();
        exec.submit(printerSum);

        var result =exec.submit(getSum);
        System.out.println("Result :" + result.get());

        exec.shutdown();


    }
}
