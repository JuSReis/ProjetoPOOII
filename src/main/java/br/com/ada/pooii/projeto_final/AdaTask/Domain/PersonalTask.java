package br.com.ada.pooii.projeto_final.AdaTask.Domain;

public class PersonalTask extends BaseTask {
    private String categoria;
    public PersonalTask();{
    }
    public PersonalTask (String title, String description, String deadline, String categoria) {
        super(title, description, deadline);
        this.categoria = categoria;
        }
        public String getCategoria
        return categoria;
    }

    public void setCategory(String category) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "PersonalTask{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", category='" + categoria + '\'' +
                '}';
    }
}

