package csv;

import javax.persistence.*;

@Entity
@Table(name = "manycorner")
public class Manycorner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double coordinateX;
    private double coordinateY;
    private int numberOfSides;
    private double sideLength;

    // Getters and Setters
    @Column(name = "id")
    public Long getId() {
        return id; }
    public void setId(Long id) {
        this.id = id; }
    @Column(name = "coordinate x")
    public double getCoordinateX() {
        return coordinateX; }
    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX; }
    @Column(name = "coordinate y")
    public double getCoordinateY() {
        return coordinateY; }
    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY; }
    @Column(name = "numberOfSides")
    public int getNumberOfSides() {
        return numberOfSides; }
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides; }
    @Column(name = "sideLength")
    public double getSideLength() {
        return sideLength; }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength; }
}
