package Java02;

public class StOperations01 {

	final static int APPLES_CNT = 58923;
	final static int WHOLESALE_PRICE = 120;
	final static int RETAIL_PRICE = 200;
	final static int CUSTOMER = 258;
	
	public static void main(String[] args) {
		
		int totalCost = APPLES_CNT * WHOLESALE_PRICE;
		int eachShare = APPLES_CNT / CUSTOMER;
		int costPerPerson = eachShare * RETAIL_PRICE;
		int everyoneCost = costPerPerson *CUSTOMER;
		int notSoldApples = APPLES_CNT % CUSTOMER;
		int notSoldApplesCost = notSoldApples * WHOLESALE_PRICE;
		int profit = everyoneCost -totalCost -notSoldApplesCost;
		
		System.out.println("사과 도매 구매 가격 : "+ totalCost + "원");
		System.out.println("구매자의 지불 비용 : " + costPerPerson + "원");
		System.out.println("팔지 못 한 사과 개수 : " + notSoldApples + "개");
		System.out.println("팔지 못 한 사과 도매가 : " + notSoldApplesCost + "원");
		System.out.println("순수익 : " + profit + "원");
	}

}
