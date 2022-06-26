package testgroup.model;


import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "priority")
    private Integer priority;
    @Column(name = "description")
    private String description;
    @Column(name = "isDone")
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
