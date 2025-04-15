class Teacher extends Person {
    private String Subject;

    
    public Teacher(String name, int id){
        super(name, id);
    }

    public Teacher(String name, int id, String Subject) {
        super( name, id);
        this.Subject = Subject;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject:" + Subject);
    }
}
    
