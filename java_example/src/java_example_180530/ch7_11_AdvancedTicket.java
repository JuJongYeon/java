package java_example_180530;

public class ch7_11_AdvancedTicket extends ch7_11_Ticket{
	ch7_11_Ticket t = new ch7_11_Ticket();
	
	public String sajun ="사전예약";
	public int day;
	public int now (int day) {
		++t.ticketNumber;
		if(day<=30 && day >= 10 ) {
			ticket=t.ticket/2;
			System.out.println(sajun+"구매가격은:"+(int)ticket+"원입니다."/*+"티켓번호:"+t.ticketNumber*/);
		}
		if(day<=10 && day>=5 ) {
			ticket=t.ticket*0.8;
			System.out.println(sajun+"구매가격은:"+(int)ticket+"원입니다."/*+"티켓번호:"+t.ticketNumber*/);
		}
		if(day<=5 && day>=1 ) {
			ticket=t.ticket*0.9;
			System.out.println(sajun+"구매가격은:"+(int)ticket+"원입니다."/*+"티켓번호:"+t.ticketNumber*/);
		}
		return day;
	}
	/*public ch7_11_AdvancedTicket() {
		super(ticketNumber);
		this.day=day;
	}
	public double getTicket() {
		++t.ticketNumber;
		if(day<=30 && day >= 10 ) {
			ticket=ticket*0.5;
			System.out.println(sajun+"구매가격은:"+(int)ticket+"원입니다."+"티켓번호:"+t.ticketNumber);
		}
		if(day<=10 && day>=5 ) {
			ticket=t.ticket*0.8;
			System.out.println(sajun+"구매가격은:"+(int)ticket+"원입니다."+"티켓번호:"+t.ticketNumber);
		}
		if(day<=5 && day>=1 ) {
			ticket=t.ticket*0.9;
			System.out.println(sajun+"구매가격은:"+(int)ticket+"원입니다."+"티켓번호:"+t.ticketNumber);
		}
		return ticket;
	}*/
}
