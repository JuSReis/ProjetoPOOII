package br.com.ada.pooii.projeto_final.AdaTask.Domain;

public class BaseTask {
    private String title;
    private String description;
    private String deadline;

    public BaseTask(String title, String description, String deadline)
        this.title = title;
        this.description = description;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "BaseTask{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline='" + deadline + '\'' +
                '}';
    }


}
