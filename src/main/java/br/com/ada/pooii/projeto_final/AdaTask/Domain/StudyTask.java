package br.com.ada.pooii.projeto_final.AdaTask.Domain;

public class StudyTask extends BaseTask {

    private String subject;

    public StudyTask() {
    }

    public StudyTask(String title, String description, String deadline, String subject) {
        super(title, description, deadline);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "StudyTask{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + deadline +
                ", subject='" + subject + '\'' +
                '}';
    }
}
