package hu.terray.leanpoker.gsontest;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestApp {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("src/main/resources/json/game_state.json");

        Player player = new Player();
        int playersBetBasedOnState = Player.betRequest(new Gson().fromJson(fileReader, JsonElement.class));
    }
}
