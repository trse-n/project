package csv;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ellipse")
public class Ellipse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double centerX;
    private double centerY;
    private double lengthAxisA;
    private double lengthAxisB;
    private Set<Presentation> present= new LinkedHashSet<>();

    // Getters and Setters
    @Column(name = "id")
    public Long getId() {
        return id; }
    public void setId(Long id) {
        this.id = id; }
    @Column(name = "center x")
    public double getCenterX() {
        return centerX; }
    public void setCenterX(double centerX) {
        this.centerX = centerX; }
    @Column(name = "center y")
    public double getCenterY() {
        return centerY; }
    public void setCenterY(double centerY) {
        this.centerY = centerY; }
    @Column(name = "lengthAxisA")
    public double getlengthAxisA() {
        return lengthAxisA; }
    public void setlengthAxisA(double lengthAxisA) {
        this.lengthAxisA = lengthAxisA; }
    @Column(name = "lengthAxisB")
    public double getlengthAxisB() {
        return lengthAxisB; }
    public void setlengthAxisB(double lengthAxisB) {
        this.lengthAxisB = lengthAxisB; }

    @OneToMany(mappedBy = "ellipse")
    public Set<Presentation> getPresent() {
        return present;
    }

    public void setPresent(Set<Presentation> present) {
        this.present = present;
    }
}
