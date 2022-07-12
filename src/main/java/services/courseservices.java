package services;
import java.util.List;

import entities.COurse;

public interface courseservices {
public List<COurse> getCourse();
public COurse getCourse(long courseId);
COurse getCourses(long cid);
public COurse addCourse(COurse course);
	

}
