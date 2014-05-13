package jamesShore.hashMap;

import java.util.HashMap;

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
		HashMap<String, String> map = new HashMap<String, String>();
		String[] pairs = getQuery().split("&");
		
		for (String pair : pairs){
			String[] nameAndValue = pair.split("=");
			map.put(nameAndValue[0], nameAndValue[1]);
		}
		if(map.get(name)==null)
				throw new RuntimeException(name+"não encontrabdo");
		else return map.get(name);
	}
}
