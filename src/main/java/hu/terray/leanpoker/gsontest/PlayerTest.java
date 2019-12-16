package hu.terray.leanpoker.gsontest;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;

public class PlayerTest {

    private static final String TWO_PLAYERS_BEFORE_FLOP = "{\n" +
            "  \"players\":[\n" +
            "    {\n" +
            "      \"name\":\"Player 1\",\n" +
            "      \"stack\":1000,\n" +
            "      \"status\":\"active\",\n" +
            "      \"bet\":0,\n" +
            "      \"hole_cards\":[],\n" +
            "      \"version\":\"Version name 1\",\n" +
            "      \"id\":0\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\":\"Player 2\",\n" +
            "      \"stack\":1000,\n" +
            "      \"status\":\"active\",\n" +
            "      \"bet\":0,\n" +
            "      \"hole_cards\":[],\n" +
            "      \"version\":\"Version name 2\",\n" +
            "      \"id\":1\n" +
            "    }\n" +
            "  ],\n" +
            "  \"tournament_id\":\"550d1d68cd7bd10003000003\",\n" +
            "  \"game_id\":\"550da1cb2d909006e90004b1\",\n" +
            "  \"round\":0,\n" +
            "  \"bet_index\":0,\n" +
            "  \"small_blind\":10,\n" +
            "  \"orbits\":0,\n" +
            "  \"dealer\":0,\n" +
            "  \"community_cards\":[],\n" +
            "  \"current_buy_in\":0,\n" +
            "  \"pot\":0\n" +
            "}";


    private static final String TWO_PLAYERS_AFTER_FLOP = "{\n" +
            "  \"tournament_id\":\"550d1d68cd7bd10003000003\",\n" +
            "\n" +
            "  \"game_id\":\"550da1cb2d909006e90004b1\",\n" +
            "  \"round\":0,\n" +
            "  \"bet_index\":0,\n" +
            "  \"small_blind\": 10,\n" +
            "  \"current_buy_in\": 320,\n" +
            "  \"pot\": 400,\n" +
            "  \"minimum_raise\": 240,\n" +
            "  \"dealer\": 1,\n" +
            "  \"orbits\": 7,\n" +
            "  \"in_action\": 1,\n" +
            "  \"players\": [\n" +
            "    {\n" +
            "      \"id\": 0,\n" +
            "      \"name\": \"Albert\",\n" +
            "      \"status\": \"active\",\n" +
            "      \"version\": \"Default random player\",\n" +
            "      \"stack\": 1010,\n" +
            "      \"bet\": 320\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"name\": \"Bob\",\n" +
            "      \"status\": \"active\",\n" +
            "      \"version\": \"Default random player\",\n" +
            "      \"stack\": 1590,\n" +
            "      \"bet\": 80,\n" +
            "      \"hole_cards\": [\n" +
            "        {\n" +
            "          \"rank\": \"6\",\n" +
            "          \"suit\": \"hearts\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"rank\": \"K\",\n" +
            "          \"suit\": \"spades\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"name\": \"Chuck\",\n" +
            "      \"status\": \"out\",\n" +
            "      \"version\": \"Default random player\",\n" +
            "      \"stack\": 0,\n" +
            "      \"bet\": 0\n" +
            "    }\n" +
            "  ],\n" +
            "  \"community_cards\": [\n" +
            "    {\n" +
            "      \"rank\": \"4\",\n" +
            "      \"suit\": \"spades\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"rank\": \"A\",\n" +
            "      \"suit\": \"hearts\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"rank\": \"6\",\n" +
            "      \"suit\": \"clubs\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static void main(String[] args) throws FileNotFoundException {
        //Reading from resource
        //FileReader fileReader = new FileReader("src/main/resources/json/game_state.json");

        Player player = new Player();
        int playersBetBasedOnState = Player.betRequest(new Gson().fromJson(TWO_PLAYERS_BEFORE_FLOP, JsonElement.class));
        System.out.println(playersBetBasedOnState);

        int playersBetBasedOnState2 = Player.betRequest(new Gson().fromJson(TWO_PLAYERS_BEFORE_FLOP, JsonElement.class));
        System.out.println(playersBetBasedOnState2);

    }
}
