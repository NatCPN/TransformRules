public class TIS {

	// outputs
    public int the_indication_lights = 2;
    public int the_flashing_mode = 2;
    public int the_flashing_timer = 0;

    public int primed_the_indication_lights = 2;
    public int primed_the_flashing_mode = 2;
    public int primed_the_flashing_timer = 0;    
    
    public int old_the_turn_indicator_lever = 0;
    public int old_the_emergency_flashing = 0;
    public int old_the_voltage = 79;
    
    public int old_the_flashing_mode = 2;    
//public int ifN = 0;	
	public String run(int TIME, int the_emergency_flashing,
			int the_turn_indicator_lever, int the_voltage) {
		
//		System.out.println(TIME + "-" + the_emergency_flashing
//				+ "-" + the_turn_indicator_lever + "-" + the_voltage);

		
		if ((((!((the_flashing_mode == 3)) && (old_the_turn_indicator_lever == 2)) && (the_turn_indicator_lever == 2)) && (!((old_the_emergency_flashing == 0)) && (the_emergency_flashing == 0)))) {
			primed_the_flashing_mode = 3;
			primed_the_flashing_timer = TIME; //ifN = 1;
		} 
		if (((the_emergency_flashing == 0) && (!((old_the_turn_indicator_lever == 2)) && (the_turn_indicator_lever == 2)))) {
			primed_the_flashing_mode = 3;
			primed_the_flashing_timer = TIME; //ifN = 2;
		} 
		if ((!((old_the_emergency_flashing == 1)) && (the_emergency_flashing == 1))) {
			primed_the_flashing_mode = 0;
			primed_the_flashing_timer = TIME; //ifN = 3;
		} 
		if (((the_emergency_flashing == 0) && (!((old_the_turn_indicator_lever == 1)) && (the_turn_indicator_lever == 1)))) {
			primed_the_flashing_mode = 1;
			primed_the_flashing_timer = TIME; //ifN = 4;
		} 
		if ((((!((old_the_turn_indicator_lever == 2)) && (the_turn_indicator_lever == 2)) && (old_the_emergency_flashing == 1)) && (the_emergency_flashing == 1))) {
			primed_the_flashing_mode = 3;
			primed_the_flashing_timer = TIME; //ifN = 5;
		} 
		if ((((!((the_flashing_mode == 0)) && (!((old_the_turn_indicator_lever == 0)) && (the_turn_indicator_lever == 0))) && (old_the_emergency_flashing == 1)) && (the_emergency_flashing == 1))) {
			primed_the_flashing_mode = 0;
			primed_the_flashing_timer = TIME; //ifN = 6;
		} 
		if ((((!((old_the_turn_indicator_lever == 1)) && (the_turn_indicator_lever == 1)) && (old_the_emergency_flashing == 1)) && (the_emergency_flashing == 1))) {
			primed_the_flashing_mode = 1;
			primed_the_flashing_timer = TIME; //ifN = 7;
		} 
		if ((((!((the_flashing_mode == 1)) && (old_the_turn_indicator_lever == 1)) && (the_turn_indicator_lever == 1)) && (!((old_the_emergency_flashing == 0)) && (the_emergency_flashing == 0)))) {
			primed_the_flashing_mode = 1;
			primed_the_flashing_timer = TIME; //ifN = 8;
		} 
		if ((!((old_the_voltage <= 80)) && (the_voltage <= 80))) {
			primed_the_indication_lights = 2;
			primed_the_flashing_timer = TIME; //ifN = 9;
		} 
		if ((((the_flashing_mode == 1) && (the_voltage > 80)) && ((!((old_the_flashing_mode == 1)) && (the_flashing_mode == 1)) || (!((old_the_voltage > 80)) && (the_voltage > 80))))) {
			primed_the_indication_lights = 1;
			primed_the_flashing_timer = TIME; //ifN = 10;
		} 
		if ((((the_flashing_mode == 0) && (the_indication_lights == 2)) && (the_voltage > 80)) && ((TIME - the_flashing_timer) >= 220)) {
			primed_the_indication_lights = 0;
			primed_the_flashing_timer = TIME; //ifN = 11;
		} 
		if ((((the_flashing_mode == 1) && (the_indication_lights == 2)) && (the_voltage > 80)) && ((TIME - the_flashing_timer) >= 220)) {
			primed_the_indication_lights = 1;
			primed_the_flashing_timer = TIME; //ifN = 12;
		} 
		if ((((the_flashing_mode == 0) && (the_voltage > 80)) && ((!((old_the_flashing_mode == 0)) && (the_flashing_mode == 0)) || (!((old_the_voltage > 80)) && (the_voltage > 80))))) {
			primed_the_indication_lights = 0;
			primed_the_flashing_timer = TIME; //ifN = 13;
		} 
		if (((the_flashing_mode == 2) && (the_voltage > 80))) {
			primed_the_indication_lights = 2;
			primed_the_flashing_timer = TIME; //ifN = 14;
		} 
		if ((((the_indication_lights == 3) || (the_indication_lights == 1)) && (the_voltage > 80)) && ((TIME - the_flashing_timer) >= 340)) {
			primed_the_indication_lights = 2;
			primed_the_flashing_timer = TIME; //ifN = 15;
		} 
		if ((((the_flashing_mode == 3) && (the_indication_lights == 2)) && (the_voltage > 80)) && ((TIME - the_flashing_timer) >= 220)) {
			primed_the_indication_lights = 3;
			primed_the_flashing_timer = TIME; //ifN = 16;
		} 
		if ((((the_flashing_mode == 3) && (the_voltage > 80)) && ((!((old_the_flashing_mode == 3)) && (the_flashing_mode == 3)) || (!((old_the_voltage > 80)) && (the_voltage > 80))))) {
			primed_the_indication_lights = 3;
			primed_the_flashing_timer = TIME; //ifN = 17;
		}
		
		return primed_the_indication_lights
				+ " " + primed_the_flashing_mode;
	}
   
}