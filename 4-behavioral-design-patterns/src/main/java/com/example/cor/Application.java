package com.example.cor;

// Enum for request types
enum RequestType {
    TYPE_A,
    TYPE_B,
    TYPE_C
}

class Request {
    private RequestType type;

    public Request(RequestType type) {
        this.type = type;
    }

    public RequestType getType() {
        return type;
    }
}

interface Handler {
    void setNext(Handler nextHandler);

    void handleRequest(Request request);
}

class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE_A)) {
            System.out.println("Request handled by ConcreteHandlerA");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("End of chain. Request not handled.");
        }
    }
}
class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE_B)) {
            System.out.println("Request handled by ConcreteHandlerB");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("End of chain. Request not handled.");
        }
    }
}


public class Application {
    public static void main(String[] args) {

        Handler handlerA=new ConcreteHandlerA();
        Handler handlerB=new ConcreteHandlerB();

        handlerA.setNext(handlerB); // chain

        Request request1=new Request(RequestType.TYPE_A);
        Request request2=new Request(RequestType.TYPE_B);
        Request request3=new Request(RequestType.TYPE_C);

        handlerA.handleRequest(request1);
        handlerA.handleRequest(request2);
        handlerA.handleRequest(request3);



    }
}
