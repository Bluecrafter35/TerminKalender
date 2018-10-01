
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class TerminBL extends AbstractListModel<Termin>
{
    private ArrayList<Termin> termine = new ArrayList<>();
    
    @Override
    public int getSize()
    {
        return termine.size();
    }

    @Override
    public Termin getElementAt(int i)
    {
        return termine.get(i);
    }
    
}