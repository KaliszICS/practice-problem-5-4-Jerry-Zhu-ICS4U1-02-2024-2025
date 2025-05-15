class RadioPlayer implements Player{
    private boolean onOff;
    private double[] stationList;
    private double station;
    private int volume;
    private int stationNumber;

    public RadioPlayer(double[] stationList){
        this.stationList = stationList;
        this.onOff = false;
        this.station = 0;
        this.volume = 0;
        this.stationNumber = 0;
    }

@Override
    public void start(){
        if(!onOff){
            this.station = this.stationList[0];
            this.onOff = true;
            this.stationNumber = 0;
        }
    }

    @Override
    public void stop(){
        if(onOff){
            this.station = 0;
            this.onOff = false;
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override 
    public void volumeUp(){
        this.volume += 2;
    }

    @Override 
    public void volumeDown(){
        this.volume -= 2;
    }

    @Override 
    public int getVolume(){
        return this.volume;
    }

    public void next(){
        this.stationNumber++;
        this.station = this.stationList[stationNumber];
    }

    public void previous(){
        this.stationNumber--;
        this.station = this.stationList[stationNumber];
    }

    public double getStation(){
        return this.station;
    }
}