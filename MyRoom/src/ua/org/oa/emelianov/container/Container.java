package ua.org.oa.emelianov.container;

import java.util.Map;
import java.util.TreeMap;

import ua.org.oa.emelianov.entity.Carpet;
import ua.org.oa.emelianov.entity.Subject;
import ua.org.oa.emelianov.entity.clock.AlarmClock;
import ua.org.oa.emelianov.entity.clock.WallClock;
import ua.org.oa.emelianov.entity.furniture.Chair;
import ua.org.oa.emelianov.entity.furniture.Sofa;
import ua.org.oa.emelianov.entity.furniture.Table;
import ua.org.oa.emelianov.entity.multimedia.Computer;
import ua.org.oa.emelianov.entity.multimedia.TV;

public class Container {

	private static Map<String, Subject> subjectContainer = new TreeMap<String, Subject>();

	private static void put(String name, Subject subject) {
		if (subjectContainer.get(name) != null) {
			throw new IllegalArgumentException("This subject is already exists: " + name);
		}
		subjectContainer.put(name, subject);
	}

	static {
		put("Table ¹1", new Table("Big Table", 1.5, 2.5, 1.5, 30));
		put("Table ¹2", new Table("Small Table", 0.5, 1.5, 1.0, 15));
		put("Chair ¹1", new Chair("First chair", 1.5, 0.5, 0.5, 5, false));
		put("Chair ¹2", new Chair("Second Chair", 1.5, 0.5, 0.5, 5, false));
		put("Chair ¹3", new Chair("Third Chair", 1.5, 0.5, 0.5, 5, true));
		put("Sofa", new Sofa("Sofa", 1.5, 1.5, 4, 50, true));
		put("Alarm clock ¹1", new AlarmClock("Alarm Clock (Samsung)", 1, "AAA", 6, 0.1));
		put("Wall clock ¹1", new WallClock("Wall Clock (Sony)", 2, "AA", 3, 1));
		put("TV", new TV("LG_1032", "China", "01.05.2015", false, 60, 5));
		put("Computer", new Computer("LENOVO", "Germany", "05.08.2010", true, "i3", "GeForce 710", 4, 3));
		put("Carpet", new Carpet("Persian carpet", 5, 3, 10));
	}

	public static void printAllSubjectsFromMyRoom() {

		for (Map.Entry<String, Subject> entry : subjectContainer.entrySet()) {
			String name = entry.getKey();
			String value = entry.getValue().extractAttributes();
			System.out.println(name + ": \n" + value);
		}
	}

}
