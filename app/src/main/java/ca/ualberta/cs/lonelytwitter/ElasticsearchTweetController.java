package ca.ualberta.cs.lonelytwitter;

import android.os.AsyncTask;
import android.util.Log;

import com.searchly.jestdroid.DroidClientConfig;
import com.searchly.jestdroid.JestClientFactory;
import com.searchly.jestdroid.JestDroidClient;

import io.searchbox.core.Index;

/**
 * Created by romansky on 10/20/16.
 */
public class ElasticsearchTweetController {

    JestDroidClient client = null;

    public static void addTweets(Tweet tweet){
        setClient();
    }

    public static void setClient(){
        if (client == null){

        }
    }

}