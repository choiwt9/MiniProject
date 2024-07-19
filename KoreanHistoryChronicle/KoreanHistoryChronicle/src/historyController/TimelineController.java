package historyController;

import java.util.ArrayList;
import java.util.List;

import historyModel.HistoricalEvent;

public class TimelineController {
	
	    private ArrayList ancientEvents;
	    private ArrayList middleEvents;
	    private ArrayList midModernEvents;
	    private ArrayList modernEvents;
	    
	    public TimelineController() {
	        ancientEvents = new ArrayList();
	        middleEvents = new ArrayList();
	        midModernEvents = new ArrayList();
	        modernEvents = new ArrayList();
	        
	        ancientEvents.add(new HistoricalEvent("2333 BC", "고조선 건국"));
	        ancientEvents.add(new HistoricalEvent("57 BC", "신라 건국"));
	        middleEvents.add(new HistoricalEvent("918", "고려 건국"));
	        middleEvents.add(new HistoricalEvent("1392", "조선 건국"));
	        midModernEvents.add(new HistoricalEvent("1910", "일제 강점기 시작"));
	        midModernEvents.add(new HistoricalEvent("1945", "광복"));
	        modernEvents.add(new HistoricalEvent("1948", "대한민국 정부 수립"));
	    }
	    public ArrayList getAncientEvents() {
	    	 return ancientEvents;
	    }
	    	
	    public ArrayList getMiddleEvents() {
	        return middleEvents;
	    }
	    
	    public ArrayList getMidModernEvents() {
	        return midModernEvents;
	    }

	    public ArrayList getModernEvents() {
	        return modernEvents;
	    }
	    public void addEvent(String period, HistoricalEvent event) {
	        switch (period.toLowerCase()) {
	            case "ancient":
	                ancientEvents.add(event);
	                break;
	            case "middle":
	                middleEvents.add(event);
	                break;
	            case "midmodern":
	                midModernEvents.add(event);
	                break;
	            case "modern":
	                modernEvents.add(event);
	                break;
	            default:
	                System.out.println("잘못된 시대입니다.");
	        }
	    }

	    public void deleteEvent(String period, String date) {
	        ArrayList events = null;

	        switch (period.toLowerCase()) {
	            case "ancient":
	                events = ancientEvents;
	                break;
	            case "middle":
	                events = middleEvents;
	                break;
	            case "midmodern":
	                events = midModernEvents;
	                break;
	            case "modern":
	                events = modernEvents;
	                break;
	            default:
	                System.out.println("잘못된 시대입니다.");
	                return;
	        }

	        for (int i = 0; i < events.size(); i++) {
	            HistoricalEvent event = (HistoricalEvent) events.get(i);
	            if (event.getYear().equals(date)) {
	                events.remove(i);
	                break;
	            }
	        }
	    }

}
