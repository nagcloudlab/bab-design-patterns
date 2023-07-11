package com.example.proxy;


class VIP {
    public String getService1() {
        return "service-1 from VIP";
    }

    public String getService2() {
        return "service-2 from VIP";
    }
}


class VIPProxy extends VIP {
    class Security {
        public void auth() {
            System.out.println("Auth");
        }
    }

    class Logging {
        public void log() {
            System.out.println("Logging");
        }
    }

    VIP vip = new VIP();
    Security security = new Security();
    Logging logging = new Logging();

    public String getService1() {
        logging.log();
        security.auth();
        return vip.getService1();
    }

    public String getService2() {
        logging.log();
        security.auth();
        return vip.getService2();
    }
}

class Client {
    VIPProxy vipProxy = new VIPProxy();

    public void doSomething() {
        String serv = vipProxy.getService1();
        System.out.println("VIP service :" + serv);
    }
}


public class Application {
    public static void main(String[] args) {

        Client client = new Client();
        client.doSomething();

    }
}
