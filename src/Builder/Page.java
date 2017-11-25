package Builder;

import lombok.Getter;
import lombok.Setter;

public class Page {

	@Setter
	@Getter
	private String header;

	@Setter
	@Getter
	private String contents;

	@Setter
	@Getter
	private String footer;

}
