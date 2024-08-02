package historyModel;

import java.util.ArrayList;
import java.util.List;

public class InitialData {
	
	public static List<HistoricalEvent>getAncientEvents() {
        List<HistoricalEvent> ancientEvents = new ArrayList<>();
        ancientEvents.add(new HistoricalEvent("2333 BC", "고조선 건국"));
        ancientEvents.add(new HistoricalEvent("108 BC", "고조선 멸망"));
        ancientEvents.add(new HistoricalEvent("57 BC", "신라 건국"));
        ancientEvents.add(new HistoricalEvent("37 BC", "고구려 건국"));
        ancientEvents.add(new HistoricalEvent("18 BC", "백제 건국"));
        ancientEvents.add(new HistoricalEvent("660", "백제 멸망"));
        ancientEvents.add(new HistoricalEvent("668", "고구려 멸망"));
        ancientEvents.add(new HistoricalEvent("676", "신라 삼국 통일"));
        ancientEvents.add(new HistoricalEvent("698", "발해 건국"));
        return ancientEvents;
    }
	
	public static List<HistoricalEvent> getMiddleEvents() {
        List<HistoricalEvent> middleEvents = new ArrayList<>();
        middleEvents.add(new HistoricalEvent("918", "고려 건국"));
        middleEvents.add(new HistoricalEvent("935", "신라 멸망"));
        middleEvents.add(new HistoricalEvent("936", "후백제 멸망"));
        middleEvents.add(new HistoricalEvent("993", "서희의 담판"));
        middleEvents.add(new HistoricalEvent("1019", "귀주 대첩"));
        middleEvents.add(new HistoricalEvent("1070", "무신정변"));
        middleEvents.add(new HistoricalEvent("1231", "몽골 1차 침공"));
        middleEvents.add(new HistoricalEvent("1388", "위화도 회군"));
        middleEvents.add(new HistoricalEvent("1392", "조선 건국"));
        middleEvents.add(new HistoricalEvent("1443", "훈민정음 창제"));
        middleEvents.add(new HistoricalEvent("1453", "계유정난"));
        middleEvents.add(new HistoricalEvent("1592", "임진왜란"));
        middleEvents.add(new HistoricalEvent("1397", "정유재란"));
        middleEvents.add(new HistoricalEvent("1627", "정묘호란"));
        middleEvents.add(new HistoricalEvent("1636", "병자호란"));
        return middleEvents;
    }

    public static List<HistoricalEvent> getMidModernEvents() {
        List<HistoricalEvent> midModernEvents = new ArrayList<>();
        midModernEvents.add(new HistoricalEvent("1876", "강화도 조약"));
        midModernEvents.add(new HistoricalEvent("1884", "갑신정변"));
        midModernEvents.add(new HistoricalEvent("1894", "동학농민운동"));
        midModernEvents.add(new HistoricalEvent("1894", "갑오개혁"));
        midModernEvents.add(new HistoricalEvent("1894", "청일전쟁"));
        midModernEvents.add(new HistoricalEvent("1895", "을미사변"));
        midModernEvents.add(new HistoricalEvent("1897", "대한제국 수립"));
        midModernEvents.add(new HistoricalEvent("1907", "국채보상운동"));
        midModernEvents.add(new HistoricalEvent("1909", "안중근 의거"));
        midModernEvents.add(new HistoricalEvent("1910", "경술국치, 일제 강점기 시작"));
        midModernEvents.add(new HistoricalEvent("1920", "청산리 전투"));
        midModernEvents.add(new HistoricalEvent("1942", "조선어학회 사건"));
        midModernEvents.add(new HistoricalEvent("1945", "광복"));
        return midModernEvents;
    }

    public static List<HistoricalEvent> getModernEvents() {
        List<HistoricalEvent> modernEvents = new ArrayList<>();
        modernEvents.add(new HistoricalEvent("1948", "대한민국 정부 수립"));
        modernEvents.add(new HistoricalEvent("1950", "6.25 전쟁"));
        modernEvents.add(new HistoricalEvent("1960", "4.19혁명"));
        modernEvents.add(new HistoricalEvent("1970", "유신체제 출범"));
        modernEvents.add(new HistoricalEvent("1987", "박종철 고문치사 사건"));
        modernEvents.add(new HistoricalEvent("1991", "남북 UN 동시가입"));
        return modernEvents;
    }

}
