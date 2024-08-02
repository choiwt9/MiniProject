package historyView;

import java.util.List;

import historyController.TimelineController;
import historyModel.HistoricalEvent;

public class TimeLineView {

	private TimelineController tc;

	public TimeLineView(TimelineController tc) {
	        this.tc = tc;
	 
	 }

	public void ancient() {
		System.out.println("고대사 연표를 보여주겠소");
		List<HistoricalEvent> events = tc.getAncientEvents();
		printEvents(events);
	}

	public void middle() {
		System.out.println("중세사 연표를 보여주겠소");
		List<HistoricalEvent> events = tc.getMiddleEvents();
		printEvents(events);
	}

	public void midModern() {
		System.out.println("근대사 연표를 보여주겠소");
		List<HistoricalEvent> events = tc.getMidModernEvents();
		printEvents(events);
	}

	public void modern() {
		System.out.println("현대사 연표를 보여주겠소");
		List<HistoricalEvent> events = tc.getModernEvents();
		printEvents(events);
	}

	public void printEvents(List<HistoricalEvent> events) {

		for (HistoricalEvent event : events) {
			System.out.println(event);
		}
	}

}
