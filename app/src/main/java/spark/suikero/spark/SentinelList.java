package spark.suikero.spark;

import android.provider.Telephony;

import java.util.ArrayList;
import java.util.List;


public class SentinelList {

    private ArrayList<Sentinel> sentinels;

    public SentinelList() {

        this.sentinels = new ArrayList<>();

    }

    public void addSentinel(Sentinel sentinel) {

        sentinels.add(sentinel);

    }




}
