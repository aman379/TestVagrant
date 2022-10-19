package teamDetails;

import org.json.JSONArray;
import org.json.JSONObject;

public class RCB {
	static int ForeignPlayersCount = 0;
	static int WicketKeeperCount = 0;

	public static void ReadThroughJson() {

		String RCBDetailsJson = Payload.RCBDetailsJson();
		JSONObject jsonObject = new JSONObject(RCBDetailsJson);
		JSONArray PlayerArray = jsonObject.getJSONArray("player");

		for (int i = 0; i < PlayerArray.length(); i++) {
			if (!PlayerArray.getJSONObject(i).getString("country").equals("India")) {
				ForeignPlayersCount++;

			}
			if (PlayerArray.getJSONObject(i).getString("role").equals("Wicket-keeper")) {
				WicketKeeperCount++;

			}
		}
	}

	public void VerifyCriteria() {
		if (ForeignPlayersCount == 4)
			System.out.println("Test Case 1 Passed");

		else
			System.out.println("Test Case 1 Failed");

		if (WicketKeeperCount >= 1)
			System.out.println("Test Case 2 Passed");
		else
			System.out.println("Test Case 2 Failed");
	}
}
