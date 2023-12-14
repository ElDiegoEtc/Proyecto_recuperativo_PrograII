package logica.command;

import logica.ArchivoPizarra;
import logica.Pizarra;
import logica.command.Command;

import java.io.Serializable;

public class CommandCargarArchivoPizarra implements Command, Serializable {
    public ArchivoPizarra ar;
    public Pizarra pizarra;
    public CommandCargarArchivoPizarra(ArchivoPizarra ar, Pizarra pizarra){
        this.ar = ar;
        this.pizarra = pizarra;
    }

    @Override
    public void execute() {
        ar.cargar(pizarra);
    }

}
