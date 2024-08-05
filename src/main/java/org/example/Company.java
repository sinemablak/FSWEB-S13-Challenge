package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id,String name,double giro,String[] developerNames){
        this.id=id;
        this.name=name;
        this.giro = Math.max(giro, 0);
        this.developerNames=developerNames;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGiro(){
        return giro;
    }
    public String[] getDeveloperNames(){
        return developerNames;
    }
    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Index is out of bounds.");
        } else if (developerNames[index] != null && !developerNames[index].isEmpty()) {
            System.out.println("Index " + index + " is already occupied.");
        } else {
            developerNames[index] = name;
            System.out.println("Employee added at index " + index + ": " + name);
        }
    }
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + String.join(", ", developerNames) +
                '}';
    }

}
