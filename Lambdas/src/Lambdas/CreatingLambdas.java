package Lambdas;

public class CreatingLambdas {
    interface Greeting{
        public String sayHello(String name);
    }
    public  void testGreeting(String s, Greeting g){
        String result =g.sayHello(s);
        System.out.println("Result: "+result);
    }

    public static void main(String[] args) {
        //input->body
        //(String s)->"Hello, "+s
        new CreatingLambdas().testGreeting("Saketh",(String s)->"Hello, "+s);
        new CreatingLambdas().testGreeting("Ganesh",(String s)->"Hello, "+s);
        new CreatingLambdas().testGreeting("",(String s) ->! s.isEmpty()? "Hello, "+s:"Did you miss something");
    }
}
