package services;

import java.util.ArrayList;
import java.util.List;

import entities.COurse;

public class courseservicipml implements courseservices {
	
	List<COurse>list;
	public courseservicipml() {
		list=new ArrayList<>();
		list.add( new COurse(123,"java ","jdk"));
		list.add( new COurse(1293,"jira ","jdk"));
	}
	@Override
public List<COurse> getCourse(){
	return list;

}
	@Override
	 public COurse getCourses( long courseId) {
		COurse c=null;
		for(COurse course: list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
		
	}
	public COurse addcourse(COurse course) {
		list.add(course);
		return course;
		
	}
	@Override
	public COurse getCourse(long courseId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public COurse addCourse(COurse course) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
