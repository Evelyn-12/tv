/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author HP
 */
public class AdvancedRemote extends BasicRemote {
  public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Control remoto: silencio");
        device.setVolume(0);
    }  
}
