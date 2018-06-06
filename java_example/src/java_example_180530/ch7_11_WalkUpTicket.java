package java_example_180530;

public class ch7_11_WalkUpTicket extends ch7_11_Ticket{

	ch7_11_Ticket t = new ch7_11_Ticket();

	public String ilban = "일반예약";
	
	public int now (int day) {
		++t.ticketNumber;
		if(day<=30 && day >= 10 ) {
			ticket=t.ticket/2+(ticket*0.05);
			System.out.println(ilban+"구매가격은:"+(int)ticket+"원입니다."/*+"티켓번호:"+t.ticketNumber*/);
		}
		if(day<=10 && day>=5) {
			ticket=t.ticket*0.8+(ticket*0.05);
			System.out.println(ilban+"구매가격은:"+(int)ticket+"원입니다."/*+"티켓번호:"+t.ticketNumber*/);
		}
		if(day<=5 && day>=1) {
			ticket=(int)t.ticket*0.9+(ticket*0.05);
			System.out.println(ilban+"구매가격은:"+(int)ticket+"원입니다."/*+"티켓번호:"+t.ticketNumber*/);
		}
		return day;
	}
}
