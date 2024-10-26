package csv.dao;

import csv.Presentation;
import org.hibernate.query.Query;

import java.util.List;

public class PresentationDao extends BaseDaompl <Presentation, Integer> {
    public PresentationDao() {
        super(Presentation.class);
    }

    public List<Presentation> getAllNumberPresentation(String Slides) {
        Query q = getSession().createQuery("FROM Presentation WHERE slides = \"" +  Slides + "\"");
        return q.list();
    }
}
