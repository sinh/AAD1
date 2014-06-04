/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s06.jtable;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author macbookpro
 */
public class StudentTableModel extends AbstractTableModel {

    public static final int ROLLNO_INDEX = 0;
    public static final int NAME_INDEX = 1;
    public static final int AGE_INDEX = 2;
    public static final int GENDER_INDEX = 3;
    private String[] columnNames = {"RollNo", "Full Name", "Age", "Gender"};
    private List<Student> data;

    public StudentTableModel(List<Student> data) {
        this.data = data;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if (column == ROLLNO_INDEX) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Class getColumnClass(int column) {
        switch (column) {
            case ROLLNO_INDEX:
            case NAME_INDEX:
                return String.class;
            case AGE_INDEX:
                return Integer.class;
            case GENDER_INDEX:
                return Boolean.class;
            default:
                return Object.class;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        Student s = (Student) data.get(row);
        switch (column) {
            case ROLLNO_INDEX:
                return s.getRollNo();
            case NAME_INDEX:
                return s.getName();
            case AGE_INDEX:
                return s.getAge();
            case GENDER_INDEX:
                return s.isGender();
            default:
                return new Object();
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        Student s = (Student) data.get(row);
        switch (column) {
            case ROLLNO_INDEX:
                s.setRollNo(String.valueOf(value));
                break;
            case NAME_INDEX:
                s.setName(String.valueOf(value));
                break;
            case AGE_INDEX:
                int a = Integer.valueOf((String.valueOf(value)));
                if (a >= 10) {
                    s.setAge(a);
                }
                break;
            case GENDER_INDEX:
                s.setGender(Boolean.valueOf(String.valueOf(value)));
                break;
            default:
                System.out.println("invalid index");
        }
        fireTableCellUpdated(row, column);
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    public boolean hasEmptyRow() {
        if (data.isEmpty()) {
            return false;
        }
        Student s = (Student) data.get(data.size() - 1);
        return s.getRollNo().trim().equals("")
                && s.getName().trim().equals("")
                && s.getAge() > 0;
    }

    public void addEmptyRow() {
        data.add(new Student());
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    public void addRow(Student s) {
        data.add(s);
    }
}
