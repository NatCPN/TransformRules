// This is mutant program. 
// Author : ysma 

public class PC125
{

    public int the_command_in_control_output = 3;

    public boolean old_the_left_priority_button = false;

    public boolean old_the_right_priority_button = false;

    public java.lang.Integer run( boolean the_left_priority_button, boolean the_right_command, boolean the_left_command, boolean the_right_priority_button )
    {
        if (the_right_command == true && the_left_command == true && !(the_right_priority_button == true) && !(the_left_priority_button == true)) {
            the_command_in_control_output = 0;
        } else {
            if (the_right_command == true && !(the_left_command == true) && !(the_right_priority_button == true) && !(the_left_priority_button == true)) {
                the_command_in_control_output = 1;
            } else {
                if (!(the_right_command == true) && the_left_command == true && !(the_right_priority_button == true) && !(the_left_priority_button == true)) {
                    the_command_in_control_output = 2;
                } else {
                    if (!(the_right_command == true) && !(the_left_command == true) && !(the_right_priority_button == true) && !(the_left_priority_button == true)) {
                        the_command_in_control_output = 3;
                    } else {
                        if (!(the_right_priority_button == true) && the_left_priority_button == true) {
                            the_command_in_control_output = 4;
                        } else {
                            if (the_right_priority_button == true && !(the_left_priority_button == true)) {
                                the_command_in_control_output = 5;
                            } else {
                                if (the_right_priority_button == true && old_the_right_priority_button == false && old_the_left_priority_button == true && the_left_priority_button == true) {
                                    the_command_in_control_output = 4;
                                } else {
                                    if (the_left_priority_button == true && old_the_right_priority_button != true && old_the_left_priority_button == false && the_right_priority_button == true) {
                                        the_command_in_control_output = 5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return the_command_in_control_output;
    }

}
