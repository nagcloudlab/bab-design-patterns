package com.example.command;


// Command interface
interface Command {
    void execute();
}

class Light {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}

class TurnOnCommand implements Command {
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
class TurnOffCommand implements Command {
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

// Invoker class
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

public class Application {
    public static void main(String[] args) {

        Light light=new Light();

        RemoteControl remoteControl = new RemoteControl();


        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        // Turning on the light
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        // Turning off the light
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();

    }
}
