package 建造模式.工厂方法;

public class IpadFactory implements Factory {

	@Override
	public Product factory() {
		
		return new Ipad();
	}

}
