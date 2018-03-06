// This is mutant program. 
// Author : ysma 

public class NPP309
{

    public int the_safety_injection_mode = 1;

    public boolean the_overridden_mode = false;

    public int the_pressure_mode = 1;

    public int primed_the_safety_injection_mode = 1;

    public boolean primed_the_overridden_mode = false;

    public int primed_the_pressure_mode = 1;

    public boolean old_the_blockage_button = false;

    public int old_the_water_pressure = 0;

    public boolean old_the_reset_button = false;

    public int old_the_pressure_mode = 0;

    public java.lang.String run( boolean the_blockage_button, int the_water_pressure, boolean the_reset_button )
    {
        if (the_water_pressure >= 9 && old_the_water_pressure < 9 && the_pressure_mode >= 1) {
            primed_the_pressure_mode = 2;
        } else {
            if (the_water_pressure >= 10 && old_the_water_pressure < 10 && the_pressure_mode == 2) {
                primed_the_pressure_mode = 0;
            } else {
                if (the_water_pressure < 9 && old_the_water_pressure >= 9 && the_pressure_mode == 2) {
                    primed_the_pressure_mode = 1;
                } else {
                    if (the_water_pressure < 10 && old_the_water_pressure >= 10 && the_pressure_mode == 0) {
                        primed_the_pressure_mode = 2;
                    }
                }
            }
        }
        if (the_blockage_button == true && !(old_the_blockage_button == true) && !(the_pressure_mode == 0) && !(the_reset_button == true)) {
            primed_the_overridden_mode = true;
        } else {
            if (the_reset_button == true && !(old_the_reset_button == true) && !(the_pressure_mode == 0)) {
                primed_the_overridden_mode = false;
            } else {
                if (the_pressure_mode == 0 && !(old_the_pressure_mode == 0)) {
                    primed_the_overridden_mode = false;
                } else {
                    if (!(the_pressure_mode == 0) && !(!(old_the_pressure_mode == 0))) {
                        primed_the_overridden_mode = false;
                    }
                }
            }
        }
        if (the_overridden_mode == true && the_pressure_mode == 1) {
            primed_the_safety_injection_mode = 0;
        } else {
            if (the_overridden_mode == false && the_pressure_mode == 1) {
                primed_the_safety_injection_mode = 1;
            } else {
                if (the_pressure_mode == 0 || the_pressure_mode == 2) {
                    primed_the_safety_injection_mode = 0;
                }
            }
        }
        return primed_the_safety_injection_mode + " " + primed_the_overridden_mode + " " + primed_the_pressure_mode;
    }

}
