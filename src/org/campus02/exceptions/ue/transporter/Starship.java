package org.campus02.exceptions.ue.transporter;

public class Starship {

    private String name;
    private Transporter transporter;

    public Starship(String name, Transporter transporter) {
        this.name = name;
        this.transporter = transporter;
    }

    public void beamUp(String person, String from){
        try {
            this.transporter.beam(person, from, this.name, true);
        } catch (TransporterMalfunctionException e) {
            // e.printStackTrace();
            System.out.println("Beaming Process Failed");
        }
        this.transporter.shutdown();
    }

}
