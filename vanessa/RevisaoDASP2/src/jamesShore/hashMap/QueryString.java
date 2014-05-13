package jamesShore.hashMap;

public class QueryString {
	private String query;

	public QueryString(String queryString) {
		if (queryString == null){
			throw new NullPointerException("query Nula");
		}
		setQuery(queryString);
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
	public int count() {
		if(getQuery()=="")
			return 0;
		else{
			String[] pairs = getQuery().split("&");
			return pairs.length;
		}
	}

	public String valueFor(String name) {
		String[] pairs = getQuery().split("&");
		
		for (String pair : pairs){
			String[] nameAndValue = pair.split("=");
			if(nameAndValue[0].equals(name))
				return nameAndValue[1];
		}
		throw new RuntimeException(name+"não foi encontrado");
	}
}
