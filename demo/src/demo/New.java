package demo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

//生产json
public class New {
	  public static void main(String[] args) {
		  try {
				JSONArray arr = new JSONArray();
				
				JSONObject item1 = new JSONObject();
				item1.put("flag", "开心1");
				JSONObject item2 = new JSONObject();
				item2.put("flag", "开心2");
				JSONObject item3 = new JSONObject();
				item3.put("flag", "开心3");
				JSONObject item4 = new JSONObject();
				item4.put("flag", "开心4");
				JSONObject item5 = new JSONObject();
				item5.put("flag", "开心5");
				
				arr.add(item1);
				arr.add(item2);
				arr.add(item3);
				arr.add(item4);
				arr.add(item5);
				
				for(int i=0;i <arr.size();i++) {
					JSONObject item = arr.getJSONObject(i);
					if(item.get("flag").equals("开心3") || item.get("flag").equals("开心5")) {
						arr.remove(i);
						arr.add(0, item);
					}
				}
				
				System.out.println(arr.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
  
}
