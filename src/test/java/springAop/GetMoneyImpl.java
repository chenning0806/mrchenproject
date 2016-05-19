package springAop;

public class GetMoneyImpl implements GetMoney{

	@Override
	public String get() {
		System.out.println("get money!");
		return "successful";
	}

}
