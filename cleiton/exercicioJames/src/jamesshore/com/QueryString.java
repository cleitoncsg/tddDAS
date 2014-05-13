package jamesshore.com;

import java.util.HashMap;

public class QueryString {
	
	  private HashMap<String, String> _map = new HashMap<String, String>();
	
	  public QueryString(String queryString) {
	      if (queryString == null) throw new NullPointerException();
	      parseQueryString(queryString);
	  }
	
	  public int count() {
	      return _map.size();
	  }
	
	  public String valueFor(String name) {
	      return _map.get(name);
	  }
	
	  private void parseQueryString(String query) {
	      if ("".equals(query)) return;
	
	      String[] pairs = query.split("&");
	      for (String pair : pairs) {
	          String[] nameAndValue = pair.split("=");
	          _map.put(nameAndValue[0], nameAndValue[1]);
	      }
	  }
}
