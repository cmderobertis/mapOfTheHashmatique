import java.util.HashMap;

public class Map {
    HashMap getTracklist() {
        HashMap<String, String> tracklist = new HashMap<>();
        tracklist.put("Map of the Problematique", "Fear, and panic in the air\nI want to be free\nFrom desolation and despair\nAnd I feel like everything I saw\nIs being swept away\nWhen I refuse to let you go");
        tracklist.put("Yesterday", "Yesterday\n" +
                "All my troubles seemed so far away\n" +
                "Now it looks as though they're here to stay\n" +
                "Oh, I believe in yesterday");
        tracklist.put("Santeria", "I don't practice Santeria, I ain't got no crystal ball\n" +
                "Well, I had a million dollars but I'd, I'd spend it all");
        tracklist.put("The Devil Went Down to Georgia", "The devil went down to Georgia, he was lookin' for a soul to steal\n" +
                "He was in a bind 'cause he was way behind\n" +
                "And he was willin' to make a deal");
        return tracklist;
    }
}
