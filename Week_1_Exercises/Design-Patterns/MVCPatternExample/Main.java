public class Main {
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("Khushi");
        model.setId(50);
        model.setGrade("A");

        StudentView view = new StudentView();
        StudentController studentController = new StudentController(model, view);
        studentController.updateView();

        studentController.setStudentName("Riya");
        studentController.updateView();
    }
}
