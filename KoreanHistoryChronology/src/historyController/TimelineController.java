package historyController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import historyModel.EraComparator;
import historyModel.HistoricalEvent;
import historyModel.InitialData;

public class TimelineController {

	private List<HistoricalEvent> ancientEvents;
    private List<HistoricalEvent> middleEvents;
    private List<HistoricalEvent> midModernEvents;
    private List<HistoricalEvent> modernEvents;
    
public TimelineController() {
	ancientEvents = new ArrayList<>();
    middleEvents = new ArrayList<>();
    midModernEvents = new ArrayList<>();
    modernEvents = new ArrayList<>();


	ancientEvents = InitialData.getAncientEvents();
	middleEvents = InitialData.getMiddleEvents();
	midModernEvents= InitialData.getMidModernEvents();
	modernEvents= InitialData.getModernEvents();
	
	sortEvents();
}

public void sortEvents() {
	Collections.sort(ancientEvents, new Comparator<HistoricalEvent>() {
		 public int compare(HistoricalEvent e1, HistoricalEvent e2) {
             return EraComparator.compareYears(e1.getYear(), e2.getYear());
	}
	});
	 Collections.sort(middleEvents, new Comparator<HistoricalEvent>() {
         public int compare(HistoricalEvent e1, HistoricalEvent e2) {
             return EraComparator.compareYears(e1.getYear(), e2.getYear());
         }
     });
	 Collections.sort(midModernEvents, new Comparator<HistoricalEvent>() {
         public int compare(HistoricalEvent e1, HistoricalEvent e2) {
             return EraComparator.compareYears(e1.getYear(), e2.getYear());
         }
     });
	 Collections.sort(modernEvents, new Comparator<HistoricalEvent>() {
         public int compare(HistoricalEvent e1, HistoricalEvent e2) {
             return EraComparator.compareYears(e1.getYear(), e2.getYear());
         }
     });
 }

public List<HistoricalEvent> getAncientEvents() {
	 sortEvents();
	return ancientEvents;
}

public List<HistoricalEvent> getMiddleEvents() {
	 sortEvents();
	return middleEvents;
}

public List<HistoricalEvent> getMidModernEvents() {
	 sortEvents();
	return midModernEvents;
}

public List<HistoricalEvent> getModernEvents() {
	 sortEvents();
	return modernEvents;
}

public void addAncientEvent(HistoricalEvent event) {
	ancientEvents.add(event);
	sortEvents();
}

public void addMiddleEvent(HistoricalEvent event) {
	middleEvents.add(event);
	sortEvents();
}

public void addMidModernEvent(HistoricalEvent event) {
	midModernEvents.add(event);
	sortEvents();
}

public void addModernEvent(HistoricalEvent event) {
	modernEvents.add(event);
	sortEvents();
}

public void deleteEvent(int choice, String year) {
	
	List<HistoricalEvent> events = null;


	switch (choice) {
	
	case 1:
		events = ancientEvents;
		break;
	case 2:
		events = middleEvents;
		break;
	case 3:
		events = midModernEvents;
		break;
	case 4:
		events = modernEvents;
		break;
	default:
		System.out.println("잘못된 시대입니다.");
		return ;
	}
	
	 
	for (int i = 0; i < events.size(); i++) {
		HistoricalEvent event = (HistoricalEvent) events.get(i);
		if (event.getYear().equals(year)) {
			events.remove(i);
			System.out.println("사건을 지워드렸소이다.");
			return;
		}
	}System.out.println("해당 연도가 없소이다");
	}


	public List<HistoricalEvent> searchEvents(String Keyword) {
		List<HistoricalEvent> result = new ArrayList<>();

		List<List<HistoricalEvent>> allEvents = List.of(ancientEvents, middleEvents, midModernEvents, modernEvents);

		for (List<HistoricalEvent> periodEvents : allEvents) {
			for (HistoricalEvent event : periodEvents) {
				if (event.getDescription().contains(Keyword)) {
					result.add(event);
				}
			}
		}
		return result;
	}

	public List<HistoricalEvent> searchEventsByYear(String year) {
		List<HistoricalEvent> result = new ArrayList<>();

		List<List<HistoricalEvent>> allEvents = List.of(ancientEvents, middleEvents, midModernEvents, modernEvents);

		for (List<HistoricalEvent> periodEvents : allEvents) {
			for (HistoricalEvent event : periodEvents) {
				 String eventYear = event.getYear();
		            if (eventYear.equals(year)) {
		                result.add(event);
		            } else if (year.equals("BC") && eventYear.contains("BC")) {
		                result.add(event);
		            } else {
				try {
					 int eventYearNum = Integer.parseInt(eventYear.replace(" BC", "").trim());
	                    int searchYearNum = Integer.parseInt(year);
	                    if (eventYear.contains("BC") && -eventYearNum == searchYearNum) {
	                        result.add(event);
				   }
	            } catch (NumberFormatException e) {
	               
	                }
	            }
	        }
	    }
	    return result;
	}

public List<HistoricalEvent> getAllEvents() {

	List<HistoricalEvent> allEvents = new ArrayList<>();
	allEvents.addAll(ancientEvents);
	allEvents.addAll(middleEvents);
	allEvents.addAll(midModernEvents);
	allEvents.addAll(modernEvents);
	return allEvents;
}
}

