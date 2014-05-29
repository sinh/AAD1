/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05.lists.model;

import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class ClassesListModel extends AbstractListModel {

    private List<Classes> data;

    public ClassesListModel(List<Classes> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Object getElementAt(int index) {
        return data.get(index);
    }
}
