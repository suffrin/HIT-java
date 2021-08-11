package project2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;

public class Sendsms {
	public static void sendSms(String message,String number)
	{
		try
		{
		String apiKey="CEAfPiGtYKQI8L24ZzWBkapO1X7SHRjhgvUMbsmnld0o9DxN3F1g08YlOrTHoaN2DmkqBuUdtCG4WFbp";
		String sendId="TXTIND";
		message=URLEncoder.encode(message, "UTF-8");
		String route="v3";
		String myUrl="https://www.fast2sms.com/dev/bulkV2?authorization="+apiKey+"&sender_id="+sendId+"&message="+message+"&route="+route+"&numbers="+number;	
		URL url=new URL(myUrl);
		HttpsURLConnection con=(HttpsURLConnection)url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent","Chrome/92.0.4515.131");
		con.setRequestProperty("cache-control", "no-cache");
		System.out.println("Wait..");
		int code=con.getResponseCode();
		System.out.println("Response code : "+code);
		StringBuffer response=new StringBuffer();
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
		while(true)
		{
			String line=br.readLine();
			if(line==null)
			{
				break;
			} 
			response.append(line);
		}
		System.out.println(response);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("Started");
		Sendsms.sendSms("This message sent using java code ..."+new Date(),"8144871867");		
	}
}