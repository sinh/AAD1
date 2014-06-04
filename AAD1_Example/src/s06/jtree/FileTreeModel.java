/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s06.jtree;

import java.io.File;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class FileTreeModel implements TreeModel {

    private final File directory;

    public FileTreeModel(File directory) {
        this.directory = directory;
    }

    @Override
    public Object getRoot() {
        return directory;
    }

    @Override
    public Object getChild(Object parent, int index) {
        if (parent instanceof File) {
            File p = (File) parent;
            if (p.isDirectory()) {
                return p.listFiles()[index];
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public int getChildCount(Object parent) {
        if (parent instanceof File) {
            File p = (File) parent;
            if (p.isDirectory()) {
                return p.listFiles().length;
            }
        }
        return 0;
    }

    @Override
    public boolean isLeaf(Object node) {
        if (node instanceof File) {
            return ((File) node).isFile();
        }
        return true;
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (parent instanceof File && child instanceof File) {
            File list[] = ((File) parent).listFiles();
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals(child)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("Add");
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
