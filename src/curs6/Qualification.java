package curs6;

public class Qualification extends Teacher {
	
	public Qualification(String course, int experienceYears, String schedule) { //constructorul care seteaza caracteristicile din Teacher (sper)
		this.setCourse(course);
		this.setExperienceYears(experienceYears);
		this.setSchedule(schedule);
	}
	
	public String verify() {
		
			if(ExperienceYears > 3 && Course.equals("Java") && Schedule.equals("Afternoon")) {
				return ("You qualify to teach at this school!");
			} else {
				return ("You do not qualify!");
			}
	}


}
