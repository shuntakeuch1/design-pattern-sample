package Command;

import lombok.Getter;
import lombok.Setter;

public class Book {

	@Setter @Getter
	private double amount;

	public Book(double amount){
		this.amount = amount;
	}

}
