package br.com.ada.pooii.projeto_final.AdaTask.Domain;

public class WorkTask extends BaseTask {
    private String project;
    }

    public WorkTask ();

    public WorkTask(String title, String description, String deadline, String project) {
        super(title, description, deadline);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "WorkTask{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + deadline +
                ", project='" + project + '\'' +
                '}';
    }
}




