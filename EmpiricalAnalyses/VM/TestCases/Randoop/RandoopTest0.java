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


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    vM0.the_coffee_machine_output = 0;
    vM0.old_the_coffee_request_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test002"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    vM0.primed_the_coffee_machine_output = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test003"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    int i4 = vM0.primed_the_system_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test004"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.old_the_coin_sensor = false;
    float f6 = vM0.primed_the_request_timer;
    vM0.primed_the_coffee_machine_output = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test005"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = (-1.0f);
    boolean b6 = vM0.old_the_coffee_request_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test006"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    java.lang.String str11 = vM0.run(false, false, 100.0f);
    vM0.the_system_mode = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "52 0"+ "'", str11.equals("52 0"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test007"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.the_coffee_machine_output = (byte)(-1);
    int i8 = vM0.the_coffee_machine_output;
    vM0.the_coffee_machine_output = (short)0;
    java.lang.String str14 = vM0.run(false, true, (float)(-1L));
    int i15 = vM0.primed_the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1 0"+ "'", str14.equals("1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test008"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    float f4 = vM0.primed_the_request_timer;
    java.lang.String str8 = vM0.run(true, false, (float)1L);
    vM0.primed_the_request_timer = 0.0f;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1 0"+ "'", str8.equals("1 0"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test009"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    float f4 = vM0.primed_the_request_timer;
    java.lang.String str8 = vM0.run(true, false, (float)1L);
    int i9 = vM0.the_coffee_machine_output;
    float f10 = vM0.the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1 0"+ "'", str8.equals("1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.0f);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test010"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.the_request_timer = (-1);
    int i6 = vM0.the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test011"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_coffee_machine_output = (byte)1;
    boolean b8 = vM0.old_the_coin_sensor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test012"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.old_the_coffee_request_button = false;
    vM0.old_the_coin_sensor = true;
    float f12 = vM0.primed_the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == (-1.0f));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test013"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    vM0.the_request_timer = (short)10;
    int i7 = vM0.the_coffee_machine_output;
    vM0.the_system_mode = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test014"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.old_the_coffee_request_button = false;
    vM0.old_the_coin_sensor = true;
    int i12 = vM0.the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test015"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    boolean b3 = vM0.old_the_coin_sensor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test016"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.old_the_coffee_request_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test017"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    float f4 = vM0.primed_the_request_timer;
    java.lang.String str8 = vM0.run(true, false, (float)1L);
    vM0.old_the_coffee_request_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1 0"+ "'", str8.equals("1 0"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test018"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_coffee_machine_output = (byte)1;
    vM0.primed_the_request_timer = 100L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test019"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.old_the_coin_sensor = false;
    boolean b6 = vM0.old_the_coffee_request_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test020"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.primed_the_request_timer = (-1L);
    vM0.the_request_timer = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test021"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.old_the_coin_sensor = false;
    vM0.the_system_mode = ' ';
    int i8 = vM0.primed_the_coffee_machine_output;
    vM0.old_the_coffee_request_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test022"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.the_request_timer = 0L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test023"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    vM0.primed_the_request_timer = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test024"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.old_the_coffee_request_button = false;
    float f10 = vM0.the_request_timer;
    boolean b11 = vM0.old_the_coin_sensor;
    vM0.primed_the_coffee_machine_output = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test025"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.primed_the_request_timer = (-1L);
    vM0.the_system_mode = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test026"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    vM0.the_request_timer = (short)10;
    vM0.the_system_mode = (byte)100;
    float f9 = vM0.primed_the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == (-1.0f));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test027"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.old_the_coin_sensor = false;
    float f6 = vM0.primed_the_request_timer;
    int i7 = vM0.primed_the_system_mode;
    int i8 = vM0.primed_the_system_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test028"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = (-1.0f);
    java.lang.String str9 = vM0.run(false, true, (float)10);
    int i10 = vM0.primed_the_system_mode;
    vM0.the_coffee_machine_output = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1 0"+ "'", str9.equals("1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test029"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.the_coffee_machine_output = (byte)(-1);
    int i8 = vM0.the_coffee_machine_output;
    vM0.the_coffee_machine_output = (short)0;
    java.lang.String str14 = vM0.run(false, true, (float)(-1L));
    vM0.the_coffee_machine_output = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1 0"+ "'", str14.equals("1 0"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test030"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    java.lang.String str8 = vM0.run(false, false, (float)100L);
    int i9 = vM0.primed_the_coffee_machine_output;
    int i10 = vM0.primed_the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0 0"+ "'", str8.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test031"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.old_the_coffee_request_button = false;
    int i10 = vM0.the_system_mode;
    vM0.primed_the_request_timer = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test032"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    float f6 = vM0.primed_the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test033"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    int i6 = vM0.the_system_mode;
    vM0.old_the_coffee_request_button = true;
    boolean b9 = vM0.old_the_coffee_request_button;
    vM0.the_system_mode = (byte)10;
    int i12 = vM0.primed_the_coffee_machine_output;
    vM0.the_system_mode = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test034"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = (-1.0f);
    java.lang.String str9 = vM0.run(false, true, (float)10);
    boolean b10 = vM0.old_the_coin_sensor;
    vM0.primed_the_request_timer = (-1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1 0"+ "'", str9.equals("1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test035"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.old_the_coffee_request_button = false;
    vM0.primed_the_request_timer = 1L;
    vM0.primed_the_request_timer = (-1);
    int i14 = vM0.the_system_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test036"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = (-1.0f);
    java.lang.String str9 = vM0.run(false, true, (float)10);
    boolean b10 = vM0.old_the_coin_sensor;
    vM0.primed_the_system_mode = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1 0"+ "'", str9.equals("1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test037"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.the_request_timer = 'a';
    vM0.primed_the_system_mode = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test038"); }


    VM vM0 = new VM();
    boolean b1 = vM0.old_the_coffee_request_button;
    boolean b2 = vM0.old_the_coin_sensor;
    vM0.primed_the_coffee_machine_output = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test039"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    int i6 = vM0.the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test040"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    java.lang.String str11 = vM0.run(false, false, 100.0f);
    int i12 = vM0.the_system_mode;
    int i13 = vM0.primed_the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "52 0"+ "'", str11.equals("52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test041"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.the_coffee_machine_output = (byte)100;
    float f4 = vM0.the_request_timer;
    vM0.primed_the_request_timer = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test042"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    boolean b2 = vM0.old_the_coffee_request_button;
    int i3 = vM0.the_coffee_machine_output;
    boolean b4 = vM0.old_the_coin_sensor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test043"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.the_coffee_machine_output = (byte)(-1);
    float f8 = vM0.the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test044"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.the_coffee_machine_output = (byte)(-1);
    int i8 = vM0.the_coffee_machine_output;
    vM0.the_request_timer = 100.0f;
    vM0.primed_the_system_mode = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test045"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    int i6 = vM0.the_system_mode;
    vM0.old_the_coffee_request_button = true;
    boolean b9 = vM0.old_the_coffee_request_button;
    float f10 = vM0.the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 52.0f);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test046"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    boolean b2 = vM0.old_the_coffee_request_button;
    vM0.the_system_mode = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test047"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.old_the_coffee_request_button = false;
    vM0.primed_the_request_timer = 1L;
    int i12 = vM0.the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test048"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.primed_the_request_timer = (short)(-1);
    vM0.the_coffee_machine_output = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test049"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.old_the_coin_sensor = false;
    float f6 = vM0.primed_the_request_timer;
    int i7 = vM0.primed_the_system_mode;
    vM0.primed_the_coffee_machine_output = (short)(-1);
    vM0.old_the_coin_sensor = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test050"); }


    VM vM0 = new VM();
    boolean b1 = vM0.old_the_coffee_request_button;
    boolean b2 = vM0.old_the_coin_sensor;
    vM0.primed_the_system_mode = 35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test051"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    vM0.the_request_timer = (short)10;
    int i7 = vM0.primed_the_system_mode;
    vM0.primed_the_request_timer = 1;
    vM0.primed_the_system_mode = 'a';
    int i12 = vM0.primed_the_coffee_machine_output;
    vM0.primed_the_request_timer = 52;
    int i15 = vM0.the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test052"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    java.lang.String str8 = vM0.run(false, false, (float)100L);
    int i9 = vM0.primed_the_coffee_machine_output;
    vM0.the_coffee_machine_output = '#';
    int i12 = vM0.the_system_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0 0"+ "'", str8.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test053"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    java.lang.String str11 = vM0.run(false, false, 100.0f);
    int i12 = vM0.the_system_mode;
    vM0.primed_the_system_mode = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "52 0"+ "'", str11.equals("52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test054"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    vM0.the_request_timer = (short)10;
    boolean b7 = vM0.old_the_coin_sensor;
    vM0.the_request_timer = 10.0f;
    int i10 = vM0.the_coffee_machine_output;
    int i11 = vM0.the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test055"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    java.lang.String str11 = vM0.run(false, false, 100.0f);
    int i12 = vM0.primed_the_system_mode;
    vM0.the_system_mode = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "52 0"+ "'", str11.equals("52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test056"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.old_the_coffee_request_button = false;
    vM0.primed_the_request_timer = 1L;
    vM0.the_request_timer = 35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test057"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.the_coffee_machine_output = (byte)100;
    vM0.the_request_timer = (-1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test058"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.the_coffee_machine_output = (byte)100;
    float f4 = vM0.the_request_timer;
    boolean b5 = vM0.old_the_coffee_request_button;
    vM0.old_the_coffee_request_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test059"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    vM0.the_request_timer = (short)10;
    vM0.the_system_mode = (byte)100;
    vM0.old_the_coffee_request_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test060"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    float f4 = vM0.primed_the_request_timer;
    vM0.the_coffee_machine_output = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test061"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.the_coffee_machine_output = (byte)(-1);
    int i8 = vM0.the_coffee_machine_output;
    vM0.the_request_timer = 100.0f;
    int i11 = vM0.primed_the_system_mode;
    vM0.primed_the_system_mode = (byte)1;
    vM0.old_the_coin_sensor = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test062"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.the_request_timer = 'a';
    java.lang.String str9 = vM0.run(false, true, (float)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0 0"+ "'", str9.equals("0 0"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test063"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.primed_the_request_timer = (-1L);
    vM0.the_request_timer = 52.0f;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test064"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    vM0.the_request_timer = (short)10;
    int i7 = vM0.the_coffee_machine_output;
    vM0.primed_the_system_mode = (byte)0;
    vM0.old_the_coin_sensor = false;
    float f12 = vM0.the_request_timer;
    int i13 = vM0.primed_the_system_mode;
    int i14 = vM0.the_system_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test065"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    float f8 = vM0.the_request_timer;
    vM0.the_request_timer = 'a';
    vM0.primed_the_system_mode = (-1);
    int i13 = vM0.primed_the_system_mode;
    vM0.the_request_timer = 52.0f;
    vM0.the_request_timer = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test066"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    int i6 = vM0.the_system_mode;
    vM0.the_system_mode = (-1);
    boolean b9 = vM0.old_the_coin_sensor;
    vM0.primed_the_system_mode = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test067"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.old_the_coffee_request_button = false;
    vM0.primed_the_request_timer = 1L;
    float f12 = vM0.the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 0.0f);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test068"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    vM0.the_request_timer = (short)10;
    int i7 = vM0.primed_the_system_mode;
    vM0.primed_the_request_timer = 1;
    vM0.primed_the_system_mode = 'a';
    int i12 = vM0.primed_the_coffee_machine_output;
    java.lang.String str16 = vM0.run(true, true, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "0 0"+ "'", str16.equals("0 0"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test069"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    float f6 = vM0.the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test070"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_coffee_machine_output = (byte)1;
    vM0.old_the_coin_sensor = false;
    vM0.primed_the_system_mode = 0;
    int i12 = vM0.the_system_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test071"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.old_the_coin_sensor = false;
    boolean b6 = vM0.old_the_coin_sensor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test072"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    boolean b2 = vM0.old_the_coffee_request_button;
    int i3 = vM0.the_coffee_machine_output;
    int i4 = vM0.the_system_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test073"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    float f4 = vM0.primed_the_request_timer;
    java.lang.String str8 = vM0.run(true, false, (float)1L);
    int i9 = vM0.primed_the_system_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1 0"+ "'", str8.equals("1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test074"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    vM0.the_request_timer = (short)10;
    int i7 = vM0.the_coffee_machine_output;
    float f8 = vM0.primed_the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == (-1.0f));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test075"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.the_coffee_machine_output = (byte)(-1);
    int i8 = vM0.the_coffee_machine_output;
    vM0.the_coffee_machine_output = (short)0;
    boolean b11 = vM0.old_the_coffee_request_button;
    vM0.old_the_coffee_request_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test076"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    int i6 = vM0.the_system_mode;
    vM0.old_the_coffee_request_button = true;
    boolean b9 = vM0.old_the_coffee_request_button;
    vM0.the_system_mode = (byte)10;
    boolean b12 = vM0.old_the_coffee_request_button;
    int i13 = vM0.the_coffee_machine_output;
    vM0.primed_the_coffee_machine_output = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test077"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    int i6 = vM0.the_system_mode;
    vM0.the_system_mode = (-1);
    boolean b9 = vM0.old_the_coin_sensor;
    vM0.the_coffee_machine_output = 35;
    vM0.old_the_coin_sensor = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test078"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    vM0.old_the_coffee_request_button = false;
    vM0.old_the_coin_sensor = true;
    vM0.primed_the_request_timer = 0.0f;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test079"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    boolean b6 = vM0.old_the_coffee_request_button;
    float f7 = vM0.primed_the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == (-1.0f));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test080"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.the_coffee_machine_output = (byte)(-1);
    int i8 = vM0.the_coffee_machine_output;
    vM0.the_request_timer = 100.0f;
    vM0.the_system_mode = (short)0;
    float f13 = vM0.primed_the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.0f);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test081"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.old_the_coin_sensor = false;
    float f6 = vM0.primed_the_request_timer;
    float f7 = vM0.the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test082"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.old_the_coin_sensor = false;
    float f6 = vM0.primed_the_request_timer;
    vM0.the_coffee_machine_output = 0;
    vM0.old_the_coffee_request_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test083"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    vM0.the_request_timer = (short)10;
    int i7 = vM0.primed_the_system_mode;
    vM0.primed_the_request_timer = 1;
    int i10 = vM0.the_coffee_machine_output;
    vM0.the_system_mode = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test084"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.the_coffee_machine_output = 52;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test085"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    float f8 = vM0.the_request_timer;
    vM0.the_request_timer = 'a';
    vM0.primed_the_system_mode = (-1);
    int i13 = vM0.primed_the_system_mode;
    vM0.the_request_timer = 52.0f;
    float f16 = vM0.primed_the_request_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f16 == (-1.0f));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test086"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    int i6 = vM0.the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test087"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    float f8 = vM0.the_request_timer;
    vM0.the_request_timer = 'a';
    float f11 = vM0.primed_the_request_timer;
    int i12 = vM0.the_coffee_machine_output;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test088"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.the_coffee_machine_output = (byte)100;
    float f4 = vM0.the_request_timer;
    java.lang.String str8 = vM0.run(false, false, (float)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1 0"+ "'", str8.equals("1 0"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test089"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = (-1.0f);
    vM0.old_the_coin_sensor = false;
    vM0.the_request_timer = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test090"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    float f4 = vM0.primed_the_request_timer;
    java.lang.String str8 = vM0.run(false, false, (float)(byte)1);
    boolean b9 = vM0.old_the_coffee_request_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1 0"+ "'", str8.equals("1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test091"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.the_coffee_machine_output = (byte)(-1);
    int i8 = vM0.the_coffee_machine_output;
    vM0.the_request_timer = 100.0f;
    int i11 = vM0.primed_the_system_mode;
    int i12 = vM0.the_system_mode;
    vM0.the_coffee_machine_output = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test092"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = (-1.0f);
    java.lang.String str9 = vM0.run(false, true, (float)10);
    int i10 = vM0.primed_the_system_mode;
    vM0.primed_the_coffee_machine_output = '4';
    vM0.primed_the_coffee_machine_output = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1 0"+ "'", str9.equals("1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test093"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    float f8 = vM0.the_request_timer;
    vM0.the_request_timer = 'a';
    vM0.primed_the_system_mode = (-1);
    int i13 = vM0.primed_the_system_mode;
    vM0.the_request_timer = 52.0f;
    boolean b16 = vM0.old_the_coin_sensor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test094"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    float f8 = vM0.the_request_timer;
    int i9 = vM0.the_system_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test095"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.the_coffee_machine_output = (byte)100;
    vM0.primed_the_system_mode = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test096"); }


    VM vM0 = new VM();
    java.lang.String str4 = vM0.run(true, true, (float)(short)(-1));
    float f5 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '4';
    float f8 = vM0.the_request_timer;
    vM0.the_request_timer = 'a';
    vM0.primed_the_system_mode = (-1);
    int i13 = vM0.the_coffee_machine_output;
    vM0.old_the_coin_sensor = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0 0"+ "'", str4.equals("0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test097"); }


    VM vM0 = new VM();
    vM0.the_system_mode = '#';
    float f3 = vM0.primed_the_request_timer;
    vM0.the_request_timer = '4';
    int i6 = vM0.the_system_mode;
    vM0.old_the_coin_sensor = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test098"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.the_request_timer = (-1);
    float f6 = vM0.primed_the_request_timer;
    vM0.primed_the_system_mode = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test099"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coin_sensor = false;
    vM0.old_the_coin_sensor = false;
    float f6 = vM0.primed_the_request_timer;
    int i7 = vM0.the_system_mode;
    vM0.primed_the_request_timer = 52;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test100"); }


    VM vM0 = new VM();
    float f1 = vM0.primed_the_request_timer;
    vM0.old_the_coffee_request_button = true;
    vM0.old_the_coin_sensor = false;
    vM0.the_system_mode = ' ';
    int i8 = vM0.the_system_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);

  }

}
