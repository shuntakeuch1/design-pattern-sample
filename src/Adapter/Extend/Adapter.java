package Adapter.Extend;

public class Adapter extends OldSystem implements Target{
	@Override
	public void process(){
		oldProcess();
		System.out.println("現処理");
	}

}
