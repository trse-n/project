package csv;

import javax.persistence.*;

@Entity
@Table(name = "presentation")
public class Presentation {
    private int id;
    private String Name;
    private int Slides;
    private Ellipse ellipse;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    @Basic
    @Column(name = "name presentation")
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Basic
    @Column(name = "number slides")
    public int getSlides() {
        return Slides;
    }

    public void setSlides(int slides) {
        Slides = slides;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ellipse_id")
    public Ellipse getEllipse() {
        return ellipse;
    }

    public void setEllipse(Ellipse ellipse) {
        this.ellipse = ellipse;
    }
}
