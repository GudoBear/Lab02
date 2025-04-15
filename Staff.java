class Staff extends Person {
    private String department;
    
    public Staff(String name, int id){
        super(name, id);
    }

    public Staff(String name, int id, String department) {
        super( name,  id);
        this.department = department;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department:" + department);
    }
}