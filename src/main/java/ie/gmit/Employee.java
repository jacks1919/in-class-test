//  Jack Sheridan
//  G00326495
//  LabExam
//  10-03-21

package ie.gmit;

public class Employee {

    private String name;
    private String id;

    public Employee(String name, String id) {
        setName(name);
        setId(id);
    }

    private void setId(String id) {

        if (id.length() < 5) {
            throw new IllegalArgumentException("Invalid id");
        } else {
            this.id = id;
        }
    }

    private void setName(String name) {

        if (name.length() < 5) {
            throw new IllegalArgumentException("Invalid name");
        } else {
            this.name = name;
        }
    }
}
