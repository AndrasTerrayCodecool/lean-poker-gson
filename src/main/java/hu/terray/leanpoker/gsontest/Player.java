package hu.terray.leanpoker.gsontest;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonObject rootObject = request.getAsJsonObject();

        // Get value based on key from root level
        String smallBlind = rootObject.get("small_blind").getAsString();
        System.out.println(smallBlind);

        // Get object (array/object) from the root level based on key
        JsonArray playersArrayChildObject = rootObject.getAsJsonArray("players"); // get place object
        JsonObject firstPlayer = playersArrayChildObject.get(0).getAsJsonObject();
        int firstPlayerStack = firstPlayer.get("stack").getAsInt();
        System.out.println(firstPlayerStack);

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}