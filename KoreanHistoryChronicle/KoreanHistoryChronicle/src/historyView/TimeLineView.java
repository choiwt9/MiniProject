package historyView;

import java.util.List;
import java.util.Scanner;

import historyController.TimelineController;
import historyModel.HistoricalEvent;

public class TimeLineView {
	Scanner sc = new Scanner(System.in);
	TimelineController tc = new TimelineController();

	public void main() {

		System.out.println("무엇을 하시겠소?");
		System.out.println("1. 각 시대 보기");
		System.out.println("2. 역사적 사건 추가");
		System.out.println("3. 잘못된 사실 삭제");
		System.out.print("수행할 역사(事)를 선택하시오 : ");
		int num = sc.nextInt();

		while (true) {

			switch (num) {
			case 1:
				ancient();
				break;
			case 2:
				middle();
				break;
			case 3:
				midModern();
				break;
			case 4:
				modern();
				break;
			case 5:
				addEvent();
				break;
			case 6:
				delEvent();
				break;
			default:
				System.out.println("잘못 입력 하셨소이다. 다시 입력 하시오");

			}

		}

	}

	private void ancient() {
		// 고대 역사를 보여주는 메소드

	}

	private void middle() {
		// 중세 역사를 보여주는 메소드

	}

	private void midModern() {
		// 근대 역사를 보여주는 메소드

	}

	private void modern() {
		// 현대역사를 보여주는 메소드

	}

	private void addEvent() {
		// 새로운 사건을 추가하는 메소드

	}

	private void delEvent() {
		// 연표에서 사건을 삭제하는 메소드

	}
}
