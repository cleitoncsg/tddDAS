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
		else return 1;
	}

	public String valueFor(String string) {
		String[] value = getQuery().split("=");
		return value[1];
	}
}
