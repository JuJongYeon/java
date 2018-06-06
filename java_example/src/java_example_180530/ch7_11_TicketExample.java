package java_example_180530;

public class ch7_11_TicketExample extends ch7_11_Ticket{

	public static void main(String[] args) {
		
		ch7_11_AdvancedTicket ad = new ch7_11_AdvancedTicket();
		ch7_11_WalkUpTicket wu = new ch7_11_WalkUpTicket();

		System.out.println(ad.now(27)+"일전에 구매하였습니다."+"당신의 티켓번호는"+ticketNumber+"입니다.");
		System.out.println(ad.now(9)+"일전에 구매하였습니다."+"당신의 티켓번호는"+ticketNumber+"입니다.");
		System.out.println(ad.now(4)+"일전에 구매하였습니다."+"당신의 티켓번호는"+ticketNumber+"입니다.");
		System.out.println(wu.now(30)+"일전에 구매하였습니다."+"당신의 티켓번호는"+ticketNumber+"입니다.");
		System.out.println(wu.now(8)+"일전에 구매하였습니다."+"당신의 티켓번호는"+ticketNumber+"입니다.");
		System.out.println(wu.now(3)+"일전에 구매하였습니다."+"당신의 티켓번호는"+ticketNumber+"입니다.");
		System.out.println(ad.now(2)+"일전에 구매하였습니다."+"당신의 티켓번호는"+ticketNumber+"입니다.");
	}
}
