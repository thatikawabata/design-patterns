package br.com.designPatterns.command;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Command> commands;

    public Queue(){
        commands = new ArrayList<>();
    }

    public void add(Command command){
        this.commands.add(command);
    }

    public void process(){
        for(Command command: commands){
            command.execute();
        }
    }
}
