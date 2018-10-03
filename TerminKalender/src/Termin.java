
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.util.converter.LocalDateTimeStringConverter;

public class Termin implements Serializable
{
    private LocalDateTime datum;
    private String text;

    public Termin(LocalDateTime datum, String text)
    {
        this.datum = datum;
        this.text = text;
    }

    public LocalDateTime getDatum()
    {
        return datum;
    }

    public void setDatum(LocalDateTime datum)
    {
        this.datum = datum;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }
    
    @Override
    public String toString()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH.mm");
        return String.format("%s --> %s", datum.format(dtf), text);
    }
    
}
