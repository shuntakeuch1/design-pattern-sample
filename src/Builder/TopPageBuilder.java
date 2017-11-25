package Builder;

public class TopPageBuilder implements Builder{

	private Page page;

	public TopPageBuilder(){
		this.page = new Page();
	}

	@Override
	public void createHeader(){
		this.page.setHeader("Header");
	}


	@Override
	public void createContents() {
		this.page.setContents("Contents");
	}

	@Override
	public void createFooter() {
		this.page.setFooter("Footer");
	}

	@Override
	public Page getResult() {
		return this.page();
	}

	private Page page() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}


}
