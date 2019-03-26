/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1sdev2;

/**
 *
 * @ANDREW TEETERS x00139120
 */
public class Radio {
    private String manufacturer;
    private boolean power;
    private String band;
    private double stationNo;
    private int volume;
    
    public Radio(){
        power = false;
        stationNo = 0;
        volume = 0;
        manufacturer = "";
        band = "";
    }
    public Radio(String manufacturerIn){
        manufacturer = manufacturerIn;
        power = false;
		band = "FM";
		stationNo = 88;
		volume = 20;
    }
	
	public String getManufacturer(){
		return manufacturer;
	}
	
	public boolean getPower(){
		return power;
	}
	
	public String getBand(){
		return band;
	}
	
	public double getStation(){
		return stationNo;
	}
	
	public int getVolume(){
		return volume;
	}
	
	public void powerOff(){
		power = false;
	}
	
	public void powerOn(){
		power = true;
	}
	
	public void increaseVolume(){
		volume++;
	}
	
	public void decreaseVolume(){
		volume--;
	}
	
	public boolean setStation(String newBand, double newStationNo){
		if(newBand.equals("AM")){
			if(newStationNo >= 535 && newStationNo <= 1605){
				band = newBand;
				stationNo = newStationNo;
				return true;
			}
			else{
				return false;
			}
		}
		else if(newBand.equals("FM")){
			if(newStationNo >= 88 && newStationNo <= 108){
				band = newBand;
				stationNo = newStationNo;
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
}

