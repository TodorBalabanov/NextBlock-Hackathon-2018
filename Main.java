import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONException;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.ClientProtocolException;

public class Main{
	public static void main(String args[]) throws ClientProtocolException, IOException {
		HttpClient client = new DefaultHttpClient();
		client.getParams().setParameter("http.protocol.content-charset", "UTF-8");
		HttpPost post = new HttpPost("https://api.kraken.com/0/public/OHLC?pair=xxbtzeur&interval=21600");

		HttpResponse response = client.execute(post);
		JSONObject result = new JSONObject(EntityUtils.toString(response.getEntity(), "UTF-8"));

		System.out.println( result.getJSONObject("result").getJSONArray("XXBTZEUR") );
	}
}
