package strtegy;
1234
public interface SearchStrategy {
	public void search();
}

class SearchStratagyAll implements SearchStrategy {
	public void search() {
		System.out.println("SEARCH ALL");
		// 전체검색하는 코드
	}
}

class SearchStratagyImage implements SearchStrategy {
	public void search() {
		System.out.println("SEARCH IMAGE");
		// 이미지검색하는 코드
	}
}

class SearchStratagyNews implements SearchStrategy {
	public void search() {
		System.out.println("SEARCH NEWS");
		// 뉴스검색하는 코드
	}
}

class SearchStratagyMap implements SearchStrategy {
	public void search() {
		System.out.println("SEARCH MAP");
		// 지도검색하는 코드
	}
}

class search() {
	if(all) {
		System.out.println("SEARCH ALL");
	} else if(image) {
		ystem.out.println("SEARCH IMAGE");
	}else if(News) {
		System.out.println("SEARCH NEWS");
	}else if(Map) {
		System.out.println("SEARCH MAP");
	}
	
}
