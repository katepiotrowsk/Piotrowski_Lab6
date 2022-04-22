package com.example.k2022_03_08_rv.model

import kotlin.collections.MutableList

var stations: MutableList<RadioStation> = mutableListOf(RadioStation("name", "http://stream.whus.org:8000/whusfm"))


class RadioStations() {

    init {
        stations.add(RadioStation("Radio Caroline", "http://sc6.radiocaroline.net:8040/mp3"))
        stations.add(RadioStation("Harlem 105 Germany", "http://stream.haarlem105.nl:8000/haarlem105low.mp3"))
        stations.add(RadioStation("KMOJ", "https://kmojfm.streamguys1.com/live-mp3"))
    }

    public fun getStations() : MutableList<RadioStation> {

        return stations
    }

    public fun size() : Int {
        return stations.size
    }
}

