package csv;

import com.opencsv.CSVReader;
import csv.dao.EllipseDao;
import csv.dao.ManycornerDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileReader;
import java.util.List;

public class Main {

    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        EllipseDao ellipseDao = new EllipseDao();

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(1);
        ellipse.setCenterY(1);
        ellipse.setlengthAxisA(5);
        ellipse.setlengthAxisB(2);
        ellipseDao.save(ellipse);

        ManycornerDao manycornerDao = new ManycornerDao();

        Manycorner manycorner = new Manycorner();
        manycorner.setCoordinateX(3);
        manycorner.setCoordinateY(6);
        manycorner.setNumberOfSides(5);
        manycorner.setSideLength(6);

        try (CSVReader reader = new CSVReader(new FileReader("C:/Users/ПК/IdeaProjects/lab1/resources/data.csv"))) {
            List<String[]> lines = reader.readAll();

            try (Session session = sessionFactory.openSession()) {
                session.beginTransaction();

                for (int i = 1; i < lines.size(); i++) {
                    String[] row = lines.get(i);
                    String shapeType = row[0];

                    if ("ellipse".equalsIgnoreCase(shapeType)) {
                        ellipse.setCenterX(Double.parseDouble(row[1]));
                        ellipse.setCenterY(Double.parseDouble(row[2]));
                        ellipse.setlengthAxisA(Double.parseDouble(row[3]));
                        ellipse.setlengthAxisB(Double.parseDouble(row[4]));
                        session.save(ellipse);
                    } else if ("manycorner".equalsIgnoreCase(shapeType)) {
                        manycorner.setCoordinateX(Double.parseDouble(row[1]));
                        manycorner.setCoordinateY(Double.parseDouble(row[2]));
                        manycorner.setNumberOfSides(Integer.parseInt(row[4]));
                        manycorner.setSideLength(Double.parseDouble(row[3]));
                        session.save(manycorner);
                    }
                }

                session.getTransaction().commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}
