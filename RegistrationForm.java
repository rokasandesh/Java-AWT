import java.awt.*;
public class RegistrationForm {
    public static void main (String[] args) {
        Frame f = new Frame("Registration Form");

        f.setLayout(null);

        Label name = new Label("Full Name: ");
        Label regiNo = new Label("Registration Number: ");
        Label gender = new Label("Gender: ");
        Label hobby = new Label("Hobbies: ");
        Label sem = new Label("Semester: ");

        TextField nameField = new TextField();
        TextField regField = new TextField();

        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, false);
        Checkbox female = new Checkbox("Female", genderGroup, false);

        Checkbox sports = new Checkbox("Sports");
        Checkbox Singing = new Checkbox("Singing");
        Checkbox Dancing = new Checkbox("Dancing");

        Choice semester = new Choice();
        semester.add("1st Sem");
        semester.add("2nd Sem");
        semester.add("3rd Sem");
        semester.add("4th Sem");
        semester.add("5th Sem");
        semester.add("6th Sem");
        semester.add("7th Sem");
        semester.add("8th Sem");

        name.setBounds(50, 50, 120, 20);
        nameField.setBounds(200, 50, 150, 20);

        regiNo.setBounds(50, 90, 120, 20);
        regField.setBounds(200, 90, 150, 20);

        gender.setBounds(50, 130, 120, 20);
        male.setBounds(200, 130, 60, 20);
        female.setBounds(270, 130, 70, 20);

        hobby.setBounds(50, 170, 120, 20);
        sports.setBounds(200, 170, 70, 20);
        Singing.setBounds(280, 170, 70, 20);
        Dancing.setBounds(360, 170, 80, 20);

        sem.setBounds(50, 210, 120, 20);
        semester.setBounds(200, 210, 150, 20);

        f.add(name);
        f.add(nameField);
        f.add(regiNo);
        f.add(regField);
        f.add(gender);
        f.add(male);
        f.add(female);
        f.add(hobby);
        f.add(sports);
        f.add(Singing);
        f.add(Dancing);
        f.add(sem);
        f.add(semester);

        f.setSize(500, 300);
        f.setVisible(true);
    }

    }
