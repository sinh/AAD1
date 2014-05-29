/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05.lists.model;

import java.util.List;
import javax.swing.ComboBoxModel;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class ClassesComboBoxModel extends ClassesListModel implements ComboBoxModel {

    private Classes selectedItem;

    public ClassesComboBoxModel(List<Classes> data) {
        super(data);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if (anItem instanceof Classes) {
            selectedItem = (Classes) anItem;
        }
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

}
