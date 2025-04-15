class Students extends Person {
    private String GradeLevel;

    public Students(String name, int id){
        super(name, id);
    }

    public Students (String name, int id, String GradeLevel){
        super(name, id);
        this.GradeLevel = GradeLevel;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: "+ GradeLevel);
    }
}