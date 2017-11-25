package Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory implements Entity{
	private String name;
	private List<Entity> list;

	public Directory(String name) {
		this.name = name;
		this.list = new ArrayList<>();
	}

	@Override
	public void add(Entity entity) {
		list.add(entity);
	}

	@Override
	public void remove() {
		Iterator<Entity> itr = list.iterator();
		while (itr.hasNext()) {
			Entity entity = (Entity) itr.next();
			entity.remove();
		}
		System.out.println(this.name + "を削除しました。");

	}

	@Override
	public void rename(String name) {
		this.name = name;
	}
}
