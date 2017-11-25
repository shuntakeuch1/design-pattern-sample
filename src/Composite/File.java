package Composite;

public class File implements Entity{
	private String name;

	public File(String name){
		this.name = name;
	}

	@Override
	public void add(Entity entity) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove() {
		System.out.println(name + "を削除しました。");
	}

	@Override
	public void rename(String name) {
		this.name = name;
	}

}
