package org.campus02.exceptions.ue.transporter;

public class Transporter {

    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {

        double probability = Math.random();

        if(urgent && probability < 0.5)
            throw new TransporterMalfunctionException("Systems Failed");

        System.out.println(person + " has been beamed from " + from + " to " + to);
    }

    public void shutdown(){
        System.out.println("Shutting Down");
    }

}
