
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

<<<<<<< HEAD:TerminKalender/src/TerminBL.java

public class TerminBL extends AbstractListModel<Termin>
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
/**
 *
 * @author Christoph Mautner
 */
public class AppointmentBL extends AbstractListModel<Appointment>
>>>>>>> master:TerminKalender/src/AppointmentBL.java
{

    private ArrayList<Appointment> termine = new ArrayList<>();

    @Override
    public int getSize()
    {
        return termine.size();
    }

    @Override
    public Appointment getElementAt(int i)
    {
        return termine.get(i);
    }

    public void add(Appointment e)
    {
        termine.add(e);
        fireIntervalAdded(this, termine.size() - 1, termine.size() - 1);
    }

    public void delete(int i)
    {
        termine.remove(i);
        fireIntervalRemoved(this, i, i);
    }
    
    public void change(Appointment appoint, int index)
    {
        termine.set(index, appoint);
        fireContentsChanged(this, 0, termine.size()-1);
    }

    public void save() throws Exception
    {
        try {
            File file = new File(".\\Termin.bin");

            FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject((java.util.ArrayList) termine);
            oos.flush();
            fos.close();
        } catch (HeadlessException | IOException e) {
            throw e;
        }
    }

    public void load() throws Exception
    {
        termine.removeAll(termine);
        try {
            File file = new File(".\\Termin.bin");
            
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            ObjectInputStream ois = new ObjectInputStream(fis);
            termine = (ArrayList<Appointment>) ois.readObject();
            fis.close();
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void sort(){
        this.termine.sort(new Sortieren());
        fireContentsChanged(this, 0, termine.size()-1);
    }
    
<<<<<<< HEAD:TerminKalender/src/TerminBL.java
    private File choose()throws Exception{
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
            
            File file = null;
            int result = chooser.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
            }
            return file;
        } catch (Exception e) {
            throw e;
        }
    }
    

=======
    }
>>>>>>> master:TerminKalender/src/AppointmentBL.java



<<<<<<< HEAD:TerminKalender/src/TerminBL.java

=======
>>>>>>> master:TerminKalender/src/AppointmentBL.java
