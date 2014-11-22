package notepad;
import javax.swing.filechooser.FileFilter;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
///////////////////////////////////////////////////////////////////////////////
public class TextFileFilter extends FileFilter
{
   public boolean accept(File file) {
        if(file.getName().endsWith("txt"))
            return true;
        else
            return false;
    }
    
    public String getDescription() {
        return ".txt";
    }
   
}
///////////////////////////////////////////////////////////////////////////////