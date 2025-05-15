class MusicPlayer implements Player{
    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    private int songNumber;

    public MusicPlayer(String[] musicList){
        this.musicList = musicList;
        this.onOff = false;
        this.currentSong = "";
        this.volume = 0;
        this.songNumber = 0;
    }

    @Override
    public void start(){
        if(!onOff){
            this.currentSong = this.musicList[0];
            this.onOff = true;
            this.songNumber = 0;
        }
    }

    @Override
    public void stop(){
        if(onOff){
            this.currentSong = "";
            this.onOff = false;
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override 
    public void volumeUp(){
        this.volume++;
    }

    @Override 
    public void volumeDown(){
        this.volume--;
    }

    @Override 
    public int getVolume(){
        return this.volume;
    }

    public void next(){
        this.songNumber++;
        this.currentSong = this.musicList[songNumber];
    }

    public void previous(){
        this.songNumber--;
        this.currentSong = this.musicList[songNumber];
    }

    public String getCurrentSong(){
        return this.currentSong;
    }
}