package testgroup.model;

public class Task {
    private Integer id;
    private Integer priority;
    private String description;
    private boolean isDone;

    public void setId(Integer id) {
        this.id = id;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public Integer getId() {
        return this.id;
    }
    public Integer getPriority() {
        return this.priority;
    }
    public String getDescription() {
        return this.description;
    }
    public boolean getIsDone() {
        return this.isDone;
    }

    //public String toString() {return this.title + " " + this.year;}

}
