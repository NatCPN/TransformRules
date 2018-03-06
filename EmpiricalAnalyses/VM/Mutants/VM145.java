// This is mutant program. 
// Author : ysma 

public class VM145
{

    public int the_system_mode = 1;

    public int the_coffee_machine_output = 0;

    public float the_request_timer = 0;

    public int primed_the_system_mode = 1;

    public int primed_the_coffee_machine_output = 0;

    public float primed_the_request_timer = 0;

    public boolean old_the_coin_sensor = false;

    public boolean old_the_coffee_request_button = false;

    public java.lang.String run( boolean the_coffee_request_button, boolean the_coin_sensor, float TIME )
    {
        if (TIME - the_request_timer <= 30.0 && TIME - the_request_timer >= 10.0 && the_system_mode == 3) {
            primed_the_coffee_machine_output = 1;
            primed_the_system_mode = 1;
        } else {
            if (TIME - the_request_timer <= 50.0 && TIME - the_request_timer >= 30.0 && the_system_mode == 2) {
                primed_the_coffee_machine_output = 0;
                primed_the_system_mode = 1;
            } else {
                if (the_coin_sensor == true && !(old_the_coin_sensor == true) && the_system_mode == 1) {
                    primed_the_request_timer = TIME;
                    primed_the_system_mode = 0;
                } else {
                    if (the_coffee_request_button == true && !(old_the_coffee_request_button == true) && old_the_coin_sensor == false && the_coin_sensor == false && TIME - the_request_timer <= 30.0 && the_system_mode == 0) {
                        primed_the_request_timer = TIME;
                        primed_the_system_mode = 3;
                    } else {
                        if (the_coffee_request_button == true && !(old_the_coffee_request_button == true) && old_the_coin_sensor == false && !the_coin_sensor == false && TIME - the_request_timer > 30.0 && the_system_mode == 0) {
                            primed_the_request_timer = TIME;
                            primed_the_system_mode = 2;
                        }
                    }
                }
            }
        }
        return primed_the_system_mode + " " + primed_the_coffee_machine_output;
    }

}
