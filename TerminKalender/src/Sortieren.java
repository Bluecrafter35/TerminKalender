
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class Sortieren implements Comparator<Termin>
{

    @Override
    public int compare(Termin t, Termin t1)
    {
        if(t.getDatum().isBefore(t1.getDatum()))
        {
            return 1;
        }
        else if(t.getDatum().isAfter(t1.getDatum()))
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
}
