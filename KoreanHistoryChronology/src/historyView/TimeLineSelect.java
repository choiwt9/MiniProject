package historyView;

import java.util.List;
import java.util.Scanner;

import historyController.TimelineController;
import historyModel.HistoricalEvent;
import historyView.TimeLineView;

public class TimeLineSelect {
	
	Scanner sc = new Scanner(System.in);
	TimelineController tc = new TimelineController();

	public void main() {
		
		while (true) {
			System.out.println("무엇을 하시겠소?");
			System.out.println("1. 모든 시대 보기");
			System.out.println("2. 각 시대 보기");
			System.out.println("3. 키워드 검색");
			System.out.println("4. 역사적 사건 추가");
			System.out.println("5. 잘못된 사실 삭제");
			System.out.println("6. 프로그램을 종료하시겠소?");
			System.out.print("수행할 역사(事)를 선택하시오 : ");
			int num = sc.nextInt();
			  sc.nextLine();
			switch (num) {
			case 1:
				viewAllEvents();
				break;
			case 2:
				viewEvent();
				break;
			case 3:
				searchEvent();
				break;
			case 4:
				addEvent();
				break;
			case 5:
				delEvent();
				break;
			case 6:
				System.out.println("프로그램을 종료하오");
				return;
			default:
				System.out.println("잘못 입력 하셨소이다. 다시 입력 하시오");
				break;
			}
			sc.nextLine();
		}
	}
	public void viewAllEvents() {
		List<HistoricalEvent> allEvents = tc.getAllEvents();
		System.out.println("전체 연표:");
		for (HistoricalEvent event : allEvents) {
	        System.out.println(event);
	    }
	}
	

	public void viewEvent() {
		TimeLineView tlv = new TimeLineView(tc);
		 System.out.println("1. 고대");
		 System.out.println("2. 중세");
		 System.out.println("3. 근대");
		 System.out.println("4. 현대");
		System.out.print("가고 싶은 시대를 골라보시오");
		int num = sc.nextInt();
		  sc.nextLine();
		switch (num) {
		case 1:
			tlv.ancient();
			break;
		case 2:
			tlv.middle();
			break;
		case 3:
			tlv.midModern();
			break;
		case 4:
			tlv.modern();
			break;
		default:
			System.out.println("잘못 입력 하셨소이다. 다시 입력 하시오");
             return;
		}

	}
	
	public void searchEvent() {
		System.out.println("1. 키워드별 검색");
		System.out.println("2. 연도별 검색");
		System.out.print("검색 방법을 선택하시오");
		int choice = sc.nextInt();
		sc.nextLine();
		if (choice == 1) {
			System.out.print("키워드를 적으시오 : ");
			String Keyword = sc.nextLine();
			List<HistoricalEvent> results = tc.searchEvents(Keyword);

			if (results.isEmpty()) {
				System.out.println("키워드에 해당하는 사건이 없소");
			} else {
				System.out.println("검색한 결과를 불러오겠소");
				for (HistoricalEvent event : results) {
					System.out.println(event);
				}
			}
		} else if (choice == 2) {
			System.out.println("연도를 적으시오");
			String year = sc.nextLine();
			
			
			List<HistoricalEvent> results = tc.searchEventsByYear(year);
			
			if (results.isEmpty()) {
				System.out.println("연도에 해당하는 사건이 없소");
			} else {
				System.out.println("검색한 결과를 불러오겠소");
				for (HistoricalEvent event : results) {
					System.out.println(event);
		}
	}
		}else {
				System.out.println("잘못 입력하셨소. 다시 입력해주시오");
			}
			}

	public void addEvent() {
		
		 System.out.println("1. 고대");
		 System.out.println("2. 중세");
		 System.out.println("3. 근대");
		 System.out.println("4. 현대");
		 System.out.print("추가하고 싶은 시대를 선택하시오 : ");
	        int choice = sc.nextInt();
	        sc.nextLine();
	        System.out.print("연도: ");
	        String year = sc.nextLine();
	        if (year.contains("bc")) {
	            year = year.replace("bc", "BC");}
	        System.out.print("사건 설명: ");
	        String description = sc.nextLine();
	        
	        HistoricalEvent event = new HistoricalEvent(year, description);
	        
	        switch (choice) {
            case 1:
            	tc.addAncientEvent(event);
                break;
            case 2:
            	tc.addMiddleEvent(event);
                break;
            case 3:
            	tc.addMidModernEvent(event);
                break;
            case 4:
            	tc.addModernEvent(event);
                break;
           default:
                System.out.println("잘못된 시대요.");
                return;
        }
        System.out.println("사건이 추가되었소.");
	  }
    
	
	public void delEvent() {
		System.out.println("1. 고대");
		System.out.println("2. 중세");
		System.out.println("3. 근대");
		System.out.println("4. 현대");
		System.out.print("삭제하고 싶은 시대를 선택하시오: ");
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice < 1 || choice > 4) {
			System.out.println("잘못된 시대요.");
			}else {
		System.out.print("삭제할 사건의 연도: ");	
		String year = sc.nextLine();
		tc.deleteEvent(choice, year);
		
		}
	}


}
