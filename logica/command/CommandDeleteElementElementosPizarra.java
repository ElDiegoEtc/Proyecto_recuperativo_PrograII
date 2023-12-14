package logica.command;

import logica.ElementosPizarra;
import logica.command.Command;

import java.io.Serializable;

public class CommandDeleteElementElementosPizarra implements Command, Serializable {

    public ElementosPizarra ep;

    public CommandDeleteElementElementosPizarra(ElementosPizarra ep){
        this.ep = ep;
    }

    @Override
    public void execute() {
        ep.DeleteElement();
    }

}
