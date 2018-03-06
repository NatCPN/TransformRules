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


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = '#';
    int i7 = tIS0.the_flashing_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test002"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    int i8 = tIS0.the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test003"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.old_the_emergency_flashing = (byte)(-1);
    tIS0.old_the_flashing_mode = (short)10;
    int i9 = tIS0.primed_the_flashing_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test004"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.old_the_emergency_flashing = (byte)(-1);
    tIS0.primed_the_flashing_timer = '#';
    int i9 = tIS0.primed_the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test005"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    tIS0.primed_the_flashing_mode = '#';
    int i10 = tIS0.primed_the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test006"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.the_flashing_timer = 79;
    int i6 = tIS0.old_the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test007"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = (short)100;
    int i7 = tIS0.old_the_turn_indicator_lever;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test008"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    int i5 = tIS0.the_flashing_timer;
    int i6 = tIS0.primed_the_flashing_mode;
    java.lang.String str11 = tIS0.run((int)(byte)10, (int)(byte)10, (-1), (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2 2"+ "'", str11.equals("2 2"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test009"); }


    TIS tIS0 = new TIS();
    tIS0.the_indication_lights = (-1);
    tIS0.old_the_flashing_mode = 1;
    java.lang.String str9 = tIS0.run(1, (int)(byte)100, 0, 79);
    int i10 = tIS0.the_flashing_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2 2"+ "'", str9.equals("2 2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test010"); }


    TIS tIS0 = new TIS();
    tIS0.the_indication_lights = (-1);
    int i3 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_mode = (byte)(-1);
    tIS0.the_indication_lights = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test011"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    tIS0.primed_the_flashing_timer = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test012"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.old_the_voltage = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test013"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    tIS0.primed_the_flashing_mode = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test014"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_timer = (byte)10;
    tIS0.the_flashing_timer = (byte)100;
    tIS0.primed_the_flashing_timer = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test015"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    int i5 = tIS0.primed_the_flashing_mode;
    tIS0.old_the_emergency_flashing = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test016"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    int i5 = tIS0.primed_the_flashing_mode;
    int i6 = tIS0.the_indication_lights;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test017"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    int i8 = tIS0.old_the_voltage;
    tIS0.old_the_emergency_flashing = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 79);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test018"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = (short)100;
    int i7 = tIS0.old_the_flashing_mode;
    tIS0.primed_the_flashing_timer = (short)100;
    tIS0.the_indication_lights = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test019"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_mode = (byte)100;
    int i6 = tIS0.the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test020"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_mode = (byte)1;
    int i7 = tIS0.primed_the_flashing_mode;
    int i8 = tIS0.old_the_emergency_flashing;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test021"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.the_flashing_timer = 79;
    int i6 = tIS0.primed_the_flashing_timer;
    tIS0.old_the_flashing_mode = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test022"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = (byte)1;
    int i4 = tIS0.old_the_emergency_flashing;
    int i5 = tIS0.old_the_voltage;
    tIS0.the_flashing_mode = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 79);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test023"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    int i4 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_mode = (byte)0;
    tIS0.old_the_emergency_flashing = 1;
    tIS0.old_the_voltage = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test024"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = (byte)1;
    tIS0.old_the_turn_indicator_lever = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test025"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    int i8 = tIS0.old_the_turn_indicator_lever;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test026"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_timer = (byte)10;
    tIS0.the_flashing_timer = (byte)100;
    int i8 = tIS0.primed_the_flashing_mode;
    tIS0.primed_the_flashing_timer = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test027"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = (short)100;
    int i7 = tIS0.old_the_flashing_mode;
    tIS0.primed_the_flashing_timer = (short)100;
    int i10 = tIS0.primed_the_flashing_mode;
    tIS0.primed_the_indication_lights = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test028"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    int i5 = tIS0.old_the_emergency_flashing;
    int i6 = tIS0.old_the_voltage;
    tIS0.old_the_voltage = (byte)1;
    tIS0.old_the_emergency_flashing = ' ';
    int i11 = tIS0.the_indication_lights;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test029"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_mode = (byte)100;
    int i6 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_indication_lights = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test030"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_mode = (byte)100;
    tIS0.the_indication_lights = (short)100;
    int i8 = tIS0.old_the_emergency_flashing;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test031"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    int i8 = tIS0.the_flashing_timer;
    int i9 = tIS0.primed_the_indication_lights;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test032"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    int i5 = tIS0.primed_the_flashing_mode;
    tIS0.primed_the_flashing_mode = (short)0;
    tIS0.the_indication_lights = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test033"); }


    TIS tIS0 = new TIS();
    tIS0.the_indication_lights = (-1);
    int i3 = tIS0.the_indication_lights;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test034"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_timer = (byte)10;
    tIS0.the_flashing_timer = (byte)100;
    tIS0.old_the_flashing_mode = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test035"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_timer = (byte)10;
    int i6 = tIS0.the_flashing_mode;
    tIS0.old_the_emergency_flashing = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test036"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    int i8 = tIS0.old_the_voltage;
    tIS0.the_flashing_timer = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 79);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test037"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.the_flashing_timer = 79;
    int i6 = tIS0.primed_the_flashing_timer;
    tIS0.primed_the_flashing_timer = 'a';
    tIS0.old_the_turn_indicator_lever = 35;
    tIS0.the_indication_lights = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test038"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_timer = (byte)10;
    tIS0.the_flashing_timer = (byte)100;
    int i8 = tIS0.primed_the_flashing_mode;
    int i9 = tIS0.the_indication_lights;
    tIS0.old_the_emergency_flashing = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test039"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = (short)100;
    int i7 = tIS0.old_the_flashing_mode;
    int i8 = tIS0.old_the_emergency_flashing;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test040"); }


    TIS tIS0 = new TIS();
    tIS0.the_indication_lights = (-1);
    tIS0.old_the_flashing_mode = 1;
    java.lang.String str9 = tIS0.run(1, (int)(byte)100, 0, 79);
    tIS0.old_the_emergency_flashing = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2 2"+ "'", str9.equals("2 2"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test041"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    int i2 = tIS0.old_the_emergency_flashing;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test042"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.the_flashing_timer = 79;
    int i6 = tIS0.primed_the_flashing_timer;
    int i7 = tIS0.old_the_turn_indicator_lever;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test043"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = (short)100;
    int i7 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test044"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    int i2 = tIS0.primed_the_flashing_mode;
    int i3 = tIS0.primed_the_flashing_mode;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.old_the_flashing_mode = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test045"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    int i5 = tIS0.old_the_emergency_flashing;
    int i6 = tIS0.old_the_voltage;
    tIS0.old_the_voltage = (byte)1;
    tIS0.primed_the_flashing_timer = 'a';
    tIS0.old_the_emergency_flashing = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 79);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test046"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    int i5 = tIS0.the_flashing_timer;
    java.lang.String str10 = tIS0.run((int)(byte)(-1), 2, (int)(short)1, (-1));
    int i11 = tIS0.the_flashing_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "2 2"+ "'", str10.equals("2 2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test047"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = (short)100;
    java.lang.String str11 = tIS0.run(2, (int)'a', (int)(byte)(-1), (int)(byte)100);
    tIS0.old_the_emergency_flashing = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2 2"+ "'", str11.equals("2 2"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test048"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_mode = (byte)100;
    int i6 = tIS0.primed_the_flashing_mode;
    tIS0.the_indication_lights = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test049"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    int i5 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_mode = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test050"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    int i8 = tIS0.old_the_voltage;
    tIS0.primed_the_flashing_timer = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 79);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test051"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_timer = (byte)10;
    tIS0.the_flashing_timer = (byte)100;
    tIS0.primed_the_flashing_timer = (byte)1;
    int i10 = tIS0.the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test052"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = (short)100;
    int i7 = tIS0.old_the_flashing_mode;
    tIS0.primed_the_flashing_timer = (short)100;
    int i10 = tIS0.primed_the_flashing_mode;
    tIS0.the_indication_lights = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test053"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.old_the_emergency_flashing = (byte)(-1);
    tIS0.primed_the_flashing_timer = '#';
    int i9 = tIS0.old_the_emergency_flashing;
    java.lang.String str14 = tIS0.run((int)(short)10, (int)'a', (int)(short)0, 2);
    int i15 = tIS0.primed_the_flashing_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2 2"+ "'", str14.equals("2 2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test054"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_indication_lights = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test055"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    int i5 = tIS0.old_the_emergency_flashing;
    int i6 = tIS0.the_flashing_timer;
    int i7 = tIS0.the_indication_lights;
    int i8 = tIS0.primed_the_indication_lights;
    int i9 = tIS0.the_flashing_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test056"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    tIS0.old_the_voltage = 2;
    tIS0.primed_the_indication_lights = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test057"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = (byte)1;
    int i4 = tIS0.old_the_emergency_flashing;
    int i5 = tIS0.old_the_voltage;
    tIS0.the_flashing_timer = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 79);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test058"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_mode = (byte)100;
    int i6 = tIS0.old_the_turn_indicator_lever;
    int i7 = tIS0.the_flashing_timer;
    int i8 = tIS0.primed_the_indication_lights;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test059"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    int i4 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_mode = (byte)0;
    tIS0.primed_the_flashing_timer = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test060"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    int i4 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 79;
    tIS0.primed_the_flashing_mode = 0;
    int i9 = tIS0.old_the_emergency_flashing;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test061"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_timer = (byte)10;
    tIS0.the_flashing_timer = (byte)100;
    int i8 = tIS0.primed_the_flashing_mode;
    int i9 = tIS0.the_indication_lights;
    int i10 = tIS0.primed_the_flashing_timer;
    tIS0.primed_the_flashing_mode = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test062"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = (byte)1;
    int i4 = tIS0.old_the_emergency_flashing;
    tIS0.primed_the_flashing_mode = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test063"); }


    TIS tIS0 = new TIS();
    tIS0.the_indication_lights = (-1);
    int i3 = tIS0.old_the_voltage;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 79);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test064"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_mode = (byte)1;
    int i7 = tIS0.primed_the_flashing_mode;
    int i8 = tIS0.old_the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test065"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_mode = (byte)100;
    int i6 = tIS0.primed_the_flashing_mode;
    int i7 = tIS0.the_flashing_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test066"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    int i5 = tIS0.old_the_emergency_flashing;
    int i6 = tIS0.the_flashing_timer;
    int i7 = tIS0.old_the_emergency_flashing;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test067"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    tIS0.primed_the_flashing_mode = '#';
    java.lang.String str14 = tIS0.run((int)(short)10, 0, (int)(byte)1, 79);
    int i15 = tIS0.the_flashing_timer;
    int i16 = tIS0.the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "100 1"+ "'", str14.equals("100 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test068"); }


    TIS tIS0 = new TIS();
    tIS0.the_indication_lights = (-1);
    tIS0.old_the_flashing_mode = 1;
    java.lang.String str9 = tIS0.run(1, (int)(byte)100, 0, 79);
    tIS0.primed_the_indication_lights = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2 2"+ "'", str9.equals("2 2"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test069"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_mode = (byte)100;
    tIS0.the_indication_lights = (short)100;
    int i8 = tIS0.old_the_voltage;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 79);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test070"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = (short)100;
    java.lang.String str11 = tIS0.run(2, (int)'a', (int)(byte)(-1), (int)(byte)100);
    int i12 = tIS0.old_the_turn_indicator_lever;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2 2"+ "'", str11.equals("2 2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test071"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_timer = (byte)10;
    tIS0.the_flashing_timer = (byte)100;
    int i8 = tIS0.primed_the_flashing_mode;
    int i9 = tIS0.the_indication_lights;
    tIS0.primed_the_indication_lights = (byte)(-1);
    int i12 = tIS0.primed_the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test072"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_mode = (byte)1;
    tIS0.old_the_flashing_mode = '4';
    tIS0.primed_the_flashing_mode = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test073"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_timer = (byte)10;
    tIS0.the_flashing_timer = (byte)100;
    int i8 = tIS0.primed_the_flashing_mode;
    int i9 = tIS0.the_indication_lights;
    tIS0.primed_the_indication_lights = (byte)(-1);
    tIS0.old_the_flashing_mode = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test074"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.old_the_emergency_flashing = (byte)(-1);
    tIS0.primed_the_flashing_timer = '#';
    int i9 = tIS0.old_the_emergency_flashing;
    int i10 = tIS0.old_the_emergency_flashing;
    tIS0.primed_the_flashing_mode = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test075"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    int i2 = tIS0.primed_the_flashing_mode;
    int i3 = tIS0.primed_the_flashing_mode;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.old_the_voltage = (byte)10;
    tIS0.old_the_flashing_mode = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test076"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    int i4 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_mode = (byte)0;
    tIS0.old_the_emergency_flashing = 1;
    tIS0.primed_the_flashing_timer = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test077"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    int i5 = tIS0.the_indication_lights;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test078"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.the_flashing_mode = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test079"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.old_the_emergency_flashing = (byte)(-1);
    tIS0.primed_the_flashing_timer = '#';
    int i9 = tIS0.old_the_emergency_flashing;
    int i10 = tIS0.old_the_emergency_flashing;
    int i11 = tIS0.old_the_emergency_flashing;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test080"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = '#';
    int i7 = tIS0.old_the_emergency_flashing;
    int i8 = tIS0.the_flashing_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test081"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    int i5 = tIS0.old_the_emergency_flashing;
    int i6 = tIS0.old_the_voltage;
    tIS0.old_the_voltage = (byte)1;
    tIS0.old_the_emergency_flashing = ' ';
    int i11 = tIS0.old_the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test082"); }


    TIS tIS0 = new TIS();
    tIS0.the_indication_lights = (-1);
    tIS0.old_the_flashing_mode = 1;
    java.lang.String str9 = tIS0.run(1, (int)(byte)100, 0, 79);
    tIS0.the_flashing_mode = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2 2"+ "'", str9.equals("2 2"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test083"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.old_the_emergency_flashing = (byte)(-1);
    tIS0.primed_the_flashing_timer = '#';
    int i9 = tIS0.old_the_emergency_flashing;
    java.lang.String str14 = tIS0.run((int)(short)10, (int)'a', (int)(short)0, 2);
    tIS0.old_the_flashing_mode = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2 2"+ "'", str14.equals("2 2"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test084"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    int i5 = tIS0.the_flashing_timer;
    tIS0.the_flashing_mode = 35;
    int i8 = tIS0.primed_the_indication_lights;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test085"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    int i5 = tIS0.the_flashing_timer;
    tIS0.the_flashing_mode = 35;
    tIS0.old_the_flashing_mode = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test086"); }


    TIS tIS0 = new TIS();
    tIS0.the_indication_lights = (-1);
    int i3 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_mode = (byte)(-1);
    int i6 = tIS0.primed_the_indication_lights;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test087"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = (byte)1;
    int i4 = tIS0.old_the_turn_indicator_lever;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test088"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.the_flashing_timer = 79;
    int i6 = tIS0.primed_the_flashing_timer;
    tIS0.the_flashing_mode = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test089"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    tIS0.primed_the_flashing_mode = '#';
    int i10 = tIS0.the_flashing_timer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test090"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    tIS0.the_flashing_timer = (short)100;
    int i7 = tIS0.old_the_flashing_mode;
    tIS0.primed_the_flashing_timer = (short)100;
    int i10 = tIS0.primed_the_flashing_mode;
    int i11 = tIS0.old_the_turn_indicator_lever;
    java.lang.String str16 = tIS0.run((int)'4', 100, 0, (int)(short)0);
    java.lang.String str21 = tIS0.run(0, 100, (int)(short)0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "2 2"+ "'", str16.equals("2 2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "2 2"+ "'", str21.equals("2 2"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test091"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = (byte)1;
    int i4 = tIS0.old_the_emergency_flashing;
    int i5 = tIS0.the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test092"); }


    TIS tIS0 = new TIS();
    tIS0.the_indication_lights = (-1);
    int i3 = tIS0.primed_the_indication_lights;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)(-1);
    tIS0.old_the_emergency_flashing = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test093"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    int i5 = tIS0.the_flashing_timer;
    tIS0.the_flashing_mode = 35;
    int i8 = tIS0.old_the_flashing_mode;
    tIS0.old_the_emergency_flashing = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test094"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    int i5 = tIS0.the_flashing_timer;
    tIS0.the_flashing_mode = 35;
    int i8 = tIS0.primed_the_flashing_mode;
    tIS0.old_the_emergency_flashing = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test095"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.primed_the_flashing_timer = (byte)10;
    tIS0.the_flashing_timer = (byte)100;
    int i8 = tIS0.primed_the_flashing_mode;
    int i9 = tIS0.the_indication_lights;
    int i10 = tIS0.primed_the_flashing_timer;
    tIS0.the_flashing_mode = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test096"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    int i4 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_mode = (byte)0;
    tIS0.old_the_emergency_flashing = 1;
    tIS0.the_flashing_mode = 100;
    tIS0.the_flashing_timer = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test097"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.old_the_voltage;
    tIS0.primed_the_indication_lights = (short)100;
    int i7 = tIS0.the_flashing_timer;
    tIS0.primed_the_flashing_mode = '#';
    java.lang.String str14 = tIS0.run((int)(short)10, 0, (int)(byte)1, 79);
    int i15 = tIS0.the_flashing_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "100 1"+ "'", str14.equals("100 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test098"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    tIS0.the_flashing_timer = 79;
    int i6 = tIS0.primed_the_flashing_timer;
    tIS0.primed_the_flashing_timer = 'a';
    tIS0.old_the_turn_indicator_lever = 35;
    tIS0.the_indication_lights = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test099"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_turn_indicator_lever;
    tIS0.the_flashing_timer = (-1);
    int i4 = tIS0.old_the_turn_indicator_lever;
    int i5 = tIS0.the_flashing_mode;
    tIS0.primed_the_flashing_mode = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test100"); }


    TIS tIS0 = new TIS();
    int i1 = tIS0.old_the_flashing_mode;
    tIS0.old_the_turn_indicator_lever = 0;
    int i4 = tIS0.primed_the_indication_lights;
    int i5 = tIS0.the_flashing_timer;
    tIS0.the_flashing_mode = 35;
    int i8 = tIS0.primed_the_flashing_mode;
    tIS0.old_the_voltage = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

}
