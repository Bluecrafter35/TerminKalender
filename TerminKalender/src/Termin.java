
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.util.converter.LocalDateTimeStringConverter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class Termin implements Serializable
{
    private LocalDateTime datum;
    private String text;

    public Termin(LocalDateTime datum, String text)
    {
        this.datum = datum;
        this.text = text;
    }
    
    @Override
    public String toString()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH.mm");
        return String.format("%s --> %s", datum.format(dtf), text);
    }
    
}
