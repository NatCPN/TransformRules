package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test001"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    java.lang.Integer i18 = pC0.run(true, false, false, false);
    boolean b19 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 4+ "'", i18.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test002"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    pC0.old_the_right_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test003"); }


    PC pC0 = new PC();
    pC0.the_command_in_control_output = (byte)1;
    boolean b3 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test004"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    boolean b12 = pC0.old_the_right_priority_button;
    boolean b13 = pC0.old_the_left_priority_button;
    boolean b14 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test005"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    pC0.old_the_right_priority_button = true;
    int i16 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test006"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    pC0.the_command_in_control_output = '#';
    boolean b14 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test007"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    boolean b8 = pC0.old_the_left_priority_button;
    pC0.the_command_in_control_output = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test008"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    int i10 = pC0.the_command_in_control_output;
    int i11 = pC0.the_command_in_control_output;
    pC0.the_command_in_control_output = '4';
    boolean b14 = pC0.old_the_left_priority_button;
    pC0.the_command_in_control_output = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test009"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    int i2 = pC0.the_command_in_control_output;
    boolean b3 = pC0.old_the_right_priority_button;
    java.lang.Integer i8 = pC0.run(false, false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 2+ "'", i8.equals(2));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test010"); }


    PC pC0 = new PC();
    pC0.the_command_in_control_output = (byte)1;
    pC0.the_command_in_control_output = (short)(-1);
    pC0.the_command_in_control_output = 0;

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test011"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 3;
    java.lang.Integer i9 = pC0.run(false, true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test012"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    int i8 = pC0.the_command_in_control_output;
    pC0.the_command_in_control_output = (short)10;
    java.lang.Integer i15 = pC0.run(true, false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 4+ "'", i15.equals(4));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test013"); }


    PC pC0 = new PC();
    pC0.the_command_in_control_output = (short)1;
    pC0.old_the_left_priority_button = false;

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test014"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    int i2 = pC0.the_command_in_control_output;
    java.lang.Integer i7 = pC0.run(false, true, false, false);
    pC0.old_the_right_priority_button = true;
    boolean b10 = pC0.old_the_right_priority_button;
    pC0.the_command_in_control_output = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test015"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    boolean b2 = pC0.old_the_left_priority_button;
    java.lang.Integer i7 = pC0.run(false, true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 5+ "'", i7.equals(5));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test016"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    int i11 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 4);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test017"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    boolean b8 = pC0.old_the_left_priority_button;
    pC0.old_the_left_priority_button = false;
    pC0.old_the_left_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test018"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, true, false);
    boolean b13 = pC0.old_the_right_priority_button;
    pC0.old_the_left_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test019"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    boolean b8 = pC0.old_the_left_priority_button;
    pC0.old_the_right_priority_button = true;
    int i11 = pC0.the_command_in_control_output;
    pC0.the_command_in_control_output = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 4);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test020"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    boolean b8 = pC0.old_the_left_priority_button;
    pC0.old_the_right_priority_button = true;
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i17 = pC0.run(true, true, true, false);
    pC0.old_the_left_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 4+ "'", i17.equals(4));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test021"); }


    PC pC0 = new PC();
    pC0.the_command_in_control_output = (byte)1;
    pC0.the_command_in_control_output = 'a';

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test022"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    pC0.old_the_left_priority_button = true;
    pC0.old_the_left_priority_button = false;
    pC0.old_the_right_priority_button = true;
    pC0.old_the_left_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test023"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    boolean b11 = pC0.old_the_right_priority_button;
    pC0.the_command_in_control_output = 3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test024"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    pC0.old_the_right_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test025"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    boolean b3 = pC0.old_the_left_priority_button;
    int i4 = pC0.the_command_in_control_output;
    boolean b5 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test026"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    int i8 = pC0.the_command_in_control_output;
    pC0.the_command_in_control_output = (short)10;
    int i11 = pC0.the_command_in_control_output;
    pC0.old_the_left_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test027"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    pC0.old_the_left_priority_button = true;
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i19 = pC0.run(true, false, true, false);
    boolean b20 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 4+ "'", i19.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test028"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    boolean b8 = pC0.old_the_left_priority_button;
    int i9 = pC0.the_command_in_control_output;
    pC0.old_the_right_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test029"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    pC0.old_the_right_priority_button = true;
    pC0.old_the_left_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test030"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    int i8 = pC0.the_command_in_control_output;
    pC0.old_the_right_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test031"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, true, false);
    boolean b13 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test032"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    int i10 = pC0.the_command_in_control_output;
    int i11 = pC0.the_command_in_control_output;
    pC0.the_command_in_control_output = '4';
    boolean b14 = pC0.old_the_left_priority_button;
    pC0.the_command_in_control_output = (-1);
    pC0.old_the_left_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test033"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    pC0.the_command_in_control_output = 5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test034"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    pC0.old_the_left_priority_button = true;
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i19 = pC0.run(true, false, true, false);
    pC0.the_command_in_control_output = 3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 4+ "'", i19.equals(4));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test035"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    boolean b3 = pC0.old_the_left_priority_button;
    boolean b4 = pC0.old_the_right_priority_button;
    pC0.old_the_left_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test036"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    pC0.old_the_left_priority_button = true;
    boolean b13 = pC0.old_the_right_priority_button;
    boolean b14 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test037"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    boolean b3 = pC0.old_the_right_priority_button;
    boolean b4 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test038"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    boolean b12 = pC0.old_the_right_priority_button;
    pC0.old_the_left_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test039"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    int i2 = pC0.the_command_in_control_output;
    java.lang.Integer i7 = pC0.run(false, true, false, false);
    pC0.old_the_right_priority_button = true;
    boolean b10 = pC0.old_the_right_priority_button;
    int i11 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test040"); }


    PC pC0 = new PC();
    java.lang.Integer i5 = pC0.run(true, true, false, false);
    boolean b6 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 4+ "'", i5.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test041"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test042"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    boolean b12 = pC0.old_the_right_priority_button;
    boolean b13 = pC0.old_the_left_priority_button;
    pC0.old_the_left_priority_button = true;
    pC0.old_the_right_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test043"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    pC0.old_the_left_priority_button = true;
    pC0.the_command_in_control_output = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test044"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    boolean b3 = pC0.old_the_right_priority_button;
    pC0.the_command_in_control_output = 4;
    boolean b6 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test045"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    boolean b14 = pC0.old_the_right_priority_button;
    java.lang.Integer i19 = pC0.run(false, false, false, false);
    pC0.the_command_in_control_output = (byte)1;
    pC0.old_the_right_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 3+ "'", i19.equals(3));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test046"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    boolean b2 = pC0.old_the_left_priority_button;
    pC0.old_the_left_priority_button = true;
    pC0.the_command_in_control_output = (byte)(-1);
    pC0.old_the_right_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test047"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    java.lang.Integer i15 = pC0.run(false, true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 5+ "'", i15.equals(5));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test048"); }


    PC pC0 = new PC();
    pC0.the_command_in_control_output = (short)1;
    pC0.the_command_in_control_output = (short)(-1);
    boolean b5 = pC0.old_the_right_priority_button;
    java.lang.Integer i10 = pC0.run(true, true, false, false);
    boolean b11 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 4+ "'", i10.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test049"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    int i10 = pC0.the_command_in_control_output;
    pC0.old_the_left_priority_button = true;
    boolean b13 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test050"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    boolean b11 = pC0.old_the_left_priority_button;
    boolean b12 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test051"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    boolean b8 = pC0.old_the_left_priority_button;
    int i9 = pC0.the_command_in_control_output;
    java.lang.Integer i14 = pC0.run(true, true, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 4+ "'", i14.equals(4));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test052"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    boolean b3 = pC0.old_the_left_priority_button;
    pC0.the_command_in_control_output = (short)0;
    pC0.the_command_in_control_output = (byte)0;
    pC0.the_command_in_control_output = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test053"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    pC0.old_the_right_priority_button = true;
    java.lang.Integer i20 = pC0.run(true, true, true, true);
    java.lang.Integer i25 = pC0.run(false, false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 5+ "'", i20.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 3+ "'", i25.equals(3));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test054"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    boolean b3 = pC0.old_the_left_priority_button;
    pC0.the_command_in_control_output = (short)0;
    pC0.the_command_in_control_output = (byte)0;
    boolean b8 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test055"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    boolean b11 = pC0.old_the_right_priority_button;
    java.lang.Integer i16 = pC0.run(true, true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 4+ "'", i16.equals(4));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test056"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    pC0.old_the_right_priority_button = true;
    pC0.the_command_in_control_output = 5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test057"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    boolean b3 = pC0.old_the_right_priority_button;
    java.lang.Integer i8 = pC0.run(true, true, false, true);
    boolean b9 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 3+ "'", i8.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test058"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    int i8 = pC0.the_command_in_control_output;
    pC0.the_command_in_control_output = (short)10;
    int i11 = pC0.the_command_in_control_output;
    java.lang.Integer i16 = pC0.run(true, false, true, true);
    pC0.the_command_in_control_output = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test059"); }


    PC pC0 = new PC();
    pC0.the_command_in_control_output = (short)1;
    pC0.the_command_in_control_output = (short)(-1);
    boolean b5 = pC0.old_the_right_priority_button;
    java.lang.Integer i10 = pC0.run(true, true, false, false);
    boolean b11 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 4+ "'", i10.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test060"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    boolean b3 = pC0.old_the_left_priority_button;
    int i4 = pC0.the_command_in_control_output;
    int i5 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test061"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    boolean b2 = pC0.old_the_left_priority_button;
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test062"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    boolean b12 = pC0.old_the_right_priority_button;
    int i13 = pC0.the_command_in_control_output;
    pC0.old_the_right_priority_button = false;
    boolean b16 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test063"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, true, false);
    java.lang.Integer i17 = pC0.run(false, false, true, true);
    java.lang.Integer i22 = pC0.run(true, true, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 5+ "'", i17.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 5+ "'", i22.equals(5));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test064"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    java.lang.Integer i14 = pC0.run(false, true, false, false);
    pC0.the_command_in_control_output = (byte)100;
    java.lang.Integer i21 = pC0.run(false, false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 3+ "'", i21.equals(3));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test065"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    java.lang.Integer i16 = pC0.run(false, true, true, false);
    boolean b17 = pC0.old_the_left_priority_button;
    pC0.the_command_in_control_output = 4;
    int i20 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 4);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test066"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    boolean b13 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test067"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    boolean b3 = pC0.old_the_left_priority_button;
    pC0.the_command_in_control_output = (short)0;
    int i6 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test068"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    int i2 = pC0.the_command_in_control_output;
    boolean b3 = pC0.old_the_left_priority_button;
    java.lang.Integer i8 = pC0.run(false, false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 2+ "'", i8.equals(2));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test069"); }


    PC pC0 = new PC();
    pC0.the_command_in_control_output = (byte)1;
    java.lang.Integer i7 = pC0.run(false, false, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 2+ "'", i7.equals(2));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test070"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    pC0.old_the_left_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test071"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    boolean b12 = pC0.old_the_right_priority_button;
    java.lang.Integer i17 = pC0.run(false, true, true, true);
    java.lang.Integer i22 = pC0.run(false, true, false, true);
    java.lang.Integer i27 = pC0.run(false, false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 5+ "'", i17.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 5+ "'", i22.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 3+ "'", i27.equals(3));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test072"); }


    PC pC0 = new PC();
    pC0.the_command_in_control_output = (byte)1;
    pC0.the_command_in_control_output = (short)(-1);
    boolean b5 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test073"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 3;
    pC0.the_command_in_control_output = 0;
    int i7 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test074"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    boolean b14 = pC0.old_the_right_priority_button;
    java.lang.Integer i19 = pC0.run(false, false, false, false);
    pC0.the_command_in_control_output = (byte)1;
    boolean b22 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 3+ "'", i19.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test075"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    java.lang.Integer i6 = pC0.run(true, false, true, false);
    pC0.the_command_in_control_output = 4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 4+ "'", i6.equals(4));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test076"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, true, false);
    pC0.old_the_right_priority_button = true;
    pC0.old_the_left_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test077"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    int i2 = pC0.the_command_in_control_output;
    java.lang.Integer i7 = pC0.run(false, true, false, false);
    pC0.the_command_in_control_output = 2;
    boolean b10 = pC0.old_the_right_priority_button;
    pC0.old_the_right_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test078"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    boolean b12 = pC0.old_the_right_priority_button;
    boolean b13 = pC0.old_the_left_priority_button;
    boolean b14 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test079"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    boolean b3 = pC0.old_the_right_priority_button;
    pC0.the_command_in_control_output = 4;
    pC0.old_the_left_priority_button = true;
    int i8 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test080"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    pC0.old_the_left_priority_button = false;
    pC0.old_the_left_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test081"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    boolean b8 = pC0.old_the_left_priority_button;
    pC0.the_command_in_control_output = 2;
    pC0.old_the_left_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test082"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    java.lang.Integer i18 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 4+ "'", i18.equals(4));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test083"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    boolean b12 = pC0.old_the_right_priority_button;
    boolean b13 = pC0.old_the_left_priority_button;
    pC0.old_the_left_priority_button = true;
    boolean b16 = pC0.old_the_left_priority_button;
    boolean b17 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test084"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    int i8 = pC0.the_command_in_control_output;
    pC0.the_command_in_control_output = (short)10;
    java.lang.Integer i15 = pC0.run(false, true, false, true);
    java.lang.Integer i20 = pC0.run(true, false, true, true);
    int i21 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 5+ "'", i15.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 5+ "'", i20.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test085"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    pC0.the_command_in_control_output = '#';
    pC0.old_the_left_priority_button = true;
    pC0.the_command_in_control_output = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test086"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    int i2 = pC0.the_command_in_control_output;
    java.lang.Integer i7 = pC0.run(false, true, false, false);
    pC0.old_the_right_priority_button = true;
    pC0.old_the_left_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test087"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    boolean b12 = pC0.old_the_right_priority_button;
    java.lang.Integer i17 = pC0.run(false, true, true, true);
    java.lang.Integer i22 = pC0.run(false, true, false, true);
    java.lang.Integer i27 = pC0.run(false, true, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 5+ "'", i17.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 5+ "'", i22.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 1+ "'", i27.equals(1));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test088"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    java.lang.Integer i6 = pC0.run(true, false, true, false);
    int i7 = pC0.the_command_in_control_output;
    pC0.old_the_right_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 4+ "'", i6.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 4);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test089"); }


    PC pC0 = new PC();
    java.lang.Integer i5 = pC0.run(true, false, true, true);
    pC0.old_the_left_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 3+ "'", i5.equals(3));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test090"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    boolean b12 = pC0.old_the_right_priority_button;
    int i13 = pC0.the_command_in_control_output;
    boolean b14 = pC0.old_the_left_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test091"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    pC0.old_the_left_priority_button = true;
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i19 = pC0.run(true, false, true, false);
    java.lang.Integer i24 = pC0.run(false, false, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 4+ "'", i19.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test092"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    int i2 = pC0.the_command_in_control_output;
    java.lang.Integer i7 = pC0.run(false, true, false, false);
    pC0.the_command_in_control_output = 2;
    boolean b10 = pC0.old_the_right_priority_button;
    int i11 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test093"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    pC0.old_the_right_priority_button = true;
    pC0.old_the_left_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test094"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_left_priority_button = false;
    pC0.the_command_in_control_output = 10;
    boolean b12 = pC0.old_the_right_priority_button;
    java.lang.Integer i17 = pC0.run(false, true, true, true);
    pC0.old_the_left_priority_button = false;
    pC0.old_the_left_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 5+ "'", i17.equals(5));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test095"); }


    PC pC0 = new PC();
    pC0.the_command_in_control_output = (byte)1;
    java.lang.Integer i7 = pC0.run(true, false, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test096"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    int i10 = pC0.the_command_in_control_output;
    boolean b11 = pC0.old_the_right_priority_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test097"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, false, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 3+ "'", i12.equals(3));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test098"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    java.lang.Integer i12 = pC0.run(false, true, false, false);
    int i13 = pC0.the_command_in_control_output;
    java.lang.Integer i18 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 4+ "'", i18.equals(4));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test099"); }


    PC pC0 = new PC();
    pC0.old_the_left_priority_button = false;
    java.lang.Integer i7 = pC0.run(true, false, false, false);
    pC0.old_the_right_priority_button = false;
    boolean b10 = pC0.old_the_right_priority_button;
    pC0.old_the_left_priority_button = true;
    int i13 = pC0.the_command_in_control_output;
    int i14 = pC0.the_command_in_control_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 4+ "'", i7.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test100"); }


    PC pC0 = new PC();
    int i1 = pC0.the_command_in_control_output;
    java.lang.Integer i6 = pC0.run(true, false, true, false);
    pC0.old_the_right_priority_button = false;
    pC0.old_the_left_priority_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 4+ "'", i6.equals(4));

  }

}
