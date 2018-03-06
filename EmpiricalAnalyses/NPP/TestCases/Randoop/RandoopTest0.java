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


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.old_the_water_pressure = (short)10;
    nPP0.old_the_pressure_mode = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test002"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    nPP0.primed_the_overridden_mode = false;
    java.lang.String str13 = nPP0.run(true, 0, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1 true 1"+ "'", str13.equals("1 true 1"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test003"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_pressure_mode = 'a';
    boolean b6 = nPP0.the_overridden_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test004"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.old_the_water_pressure = (short)10;
    nPP0.primed_the_pressure_mode = (short)(-1);
    int i9 = nPP0.primed_the_safety_injection_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test005"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    boolean b2 = nPP0.primed_the_overridden_mode;
    int i3 = nPP0.primed_the_safety_injection_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test006"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    nPP0.the_overridden_mode = false;
    nPP0.old_the_pressure_mode = ' ';
    nPP0.old_the_water_pressure = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test007"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_overridden_mode = false;
    boolean b6 = nPP0.old_the_blockage_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test008"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.old_the_water_pressure;
    int i6 = nPP0.the_pressure_mode;
    nPP0.the_pressure_mode = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test009"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    nPP0.the_overridden_mode = false;
    nPP0.old_the_pressure_mode = ' ';
    int i9 = nPP0.old_the_pressure_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test010"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    nPP0.the_pressure_mode = 'a';
    boolean b7 = nPP0.old_the_blockage_button;
    nPP0.primed_the_pressure_mode = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test011"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.old_the_water_pressure;
    int i6 = nPP0.primed_the_safety_injection_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test012"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    boolean b4 = nPP0.old_the_blockage_button;
    java.lang.String str8 = nPP0.run(false, 0, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1 false 1"+ "'", str8.equals("1 false 1"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test013"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_pressure_mode = 'a';
    nPP0.the_pressure_mode = (-1);
    boolean b8 = nPP0.the_overridden_mode;
    nPP0.the_pressure_mode = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test014"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    boolean b2 = nPP0.primed_the_overridden_mode;
    nPP0.the_pressure_mode = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test015"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.old_the_water_pressure = (short)10;
    nPP0.primed_the_pressure_mode = (short)(-1);
    int i9 = nPP0.the_safety_injection_mode;
    boolean b10 = nPP0.primed_the_overridden_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test016"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.old_the_water_pressure;
    boolean b6 = nPP0.old_the_reset_button;
    nPP0.old_the_reset_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test017"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.old_the_water_pressure;
    int i6 = nPP0.old_the_water_pressure;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test018"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    int i5 = nPP0.the_pressure_mode;
    boolean b6 = nPP0.primed_the_overridden_mode;
    java.lang.String str10 = nPP0.run(false, 1, true);
    boolean b11 = nPP0.primed_the_overridden_mode;
    nPP0.the_pressure_mode = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1 false 1"+ "'", str10.equals("1 false 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test019"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.old_the_reset_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test020"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    nPP0.primed_the_overridden_mode = false;
    boolean b10 = nPP0.primed_the_overridden_mode;
    nPP0.the_safety_injection_mode = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test021"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    int i8 = nPP0.primed_the_pressure_mode;
    boolean b9 = nPP0.the_overridden_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test022"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_pressure_mode = 'a';
    nPP0.the_pressure_mode = (-1);
    boolean b8 = nPP0.the_overridden_mode;
    nPP0.primed_the_pressure_mode = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test023"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.old_the_water_pressure;
    int i6 = nPP0.the_pressure_mode;
    int i7 = nPP0.the_safety_injection_mode;
    int i8 = nPP0.primed_the_safety_injection_mode;
    boolean b9 = nPP0.old_the_blockage_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test024"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    nPP0.the_pressure_mode = (short)10;
    int i7 = nPP0.the_pressure_mode;
    nPP0.primed_the_pressure_mode = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test025"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    int i5 = nPP0.primed_the_safety_injection_mode;
    nPP0.old_the_water_pressure = (short)(-1);
    nPP0.primed_the_safety_injection_mode = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test026"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_pressure_mode = (byte)0;
    java.lang.String str15 = nPP0.run(true, 0, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "0 false 1"+ "'", str15.equals("0 false 1"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test027"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.old_the_water_pressure = (short)10;
    nPP0.primed_the_pressure_mode = (short)(-1);
    int i9 = nPP0.the_safety_injection_mode;
    nPP0.the_safety_injection_mode = (short)(-1);
    nPP0.old_the_reset_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test028"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_pressure_mode = 'a';
    nPP0.the_pressure_mode = (-1);
    boolean b8 = nPP0.primed_the_overridden_mode;
    boolean b9 = nPP0.the_overridden_mode;
    nPP0.the_safety_injection_mode = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test029"); }


    NPP nPP0 = new NPP();
    nPP0.the_safety_injection_mode = (short)1;
    int i3 = nPP0.the_safety_injection_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test030"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_pressure_mode = 'a';
    nPP0.the_pressure_mode = (-1);
    nPP0.old_the_pressure_mode = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test031"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_overridden_mode = false;
    nPP0.old_the_reset_button = false;
    nPP0.old_the_water_pressure = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test032"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    boolean b8 = nPP0.old_the_reset_button;
    nPP0.the_pressure_mode = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test033"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.old_the_water_pressure;
    int i6 = nPP0.the_safety_injection_mode;
    nPP0.the_safety_injection_mode = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test034"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_pressure_mode = (byte)0;
    nPP0.old_the_water_pressure = ' ';
    nPP0.old_the_water_pressure = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test035"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    nPP0.the_pressure_mode = 'a';
    int i7 = nPP0.old_the_pressure_mode;
    int i8 = nPP0.old_the_water_pressure;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test036"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_safety_injection_mode = 'a';
    java.lang.String str11 = nPP0.run(true, (int)(short)1, false);
    nPP0.old_the_water_pressure = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1 true 1"+ "'", str11.equals("1 true 1"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test037"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.the_pressure_mode = (short)10;
    int i6 = nPP0.primed_the_pressure_mode;
    boolean b7 = nPP0.old_the_blockage_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test038"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    nPP0.the_pressure_mode = 'a';
    int i7 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test039"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_overridden_mode = true;
    nPP0.old_the_pressure_mode = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test040"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.old_the_water_pressure = (short)10;
    nPP0.primed_the_pressure_mode = (short)(-1);
    int i9 = nPP0.the_safety_injection_mode;
    int i10 = nPP0.primed_the_safety_injection_mode;
    nPP0.primed_the_pressure_mode = (short)1;
    nPP0.old_the_water_pressure = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test041"); }


    NPP nPP0 = new NPP();
    nPP0.the_safety_injection_mode = (short)1;
    int i3 = nPP0.primed_the_safety_injection_mode;
    nPP0.the_pressure_mode = (short)0;
    int i6 = nPP0.the_pressure_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test042"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_pressure_mode = (byte)0;
    nPP0.old_the_water_pressure = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test043"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    boolean b5 = nPP0.old_the_blockage_button;
    nPP0.the_overridden_mode = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test044"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    boolean b8 = nPP0.old_the_reset_button;
    nPP0.primed_the_pressure_mode = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test045"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_pressure_mode = 'a';
    nPP0.the_pressure_mode = (-1);
    nPP0.primed_the_pressure_mode = (short)0;
    boolean b10 = nPP0.the_overridden_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test046"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    int i5 = nPP0.the_pressure_mode;
    boolean b6 = nPP0.primed_the_overridden_mode;
    java.lang.String str10 = nPP0.run(false, 1, true);
    boolean b11 = nPP0.primed_the_overridden_mode;
    nPP0.the_safety_injection_mode = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1 false 1"+ "'", str10.equals("1 false 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test047"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    int i4 = nPP0.old_the_pressure_mode;
    nPP0.primed_the_overridden_mode = true;
    int i7 = nPP0.primed_the_safety_injection_mode;
    nPP0.primed_the_pressure_mode = (short)10;
    nPP0.the_safety_injection_mode = 0;
    int i12 = nPP0.primed_the_pressure_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test048"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_safety_injection_mode = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test049"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    int i5 = nPP0.primed_the_safety_injection_mode;
    nPP0.old_the_pressure_mode = 10;
    nPP0.primed_the_safety_injection_mode = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test050"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    int i4 = nPP0.old_the_pressure_mode;
    nPP0.primed_the_overridden_mode = true;
    nPP0.the_pressure_mode = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test051"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    boolean b4 = nPP0.old_the_blockage_button;
    boolean b5 = nPP0.the_overridden_mode;
    java.lang.String str9 = nPP0.run(false, (int)(byte)100, false);
    int i10 = nPP0.primed_the_safety_injection_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1 false 1"+ "'", str9.equals("1 false 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test052"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    boolean b4 = nPP0.old_the_blockage_button;
    nPP0.the_overridden_mode = true;
    nPP0.primed_the_pressure_mode = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test053"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    int i4 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = true;
    nPP0.primed_the_overridden_mode = false;
    int i9 = nPP0.old_the_water_pressure;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test054"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_pressure_mode = 'a';
    nPP0.the_pressure_mode = (-1);
    boolean b8 = nPP0.primed_the_overridden_mode;
    nPP0.primed_the_overridden_mode = true;
    int i11 = nPP0.old_the_water_pressure;
    nPP0.the_pressure_mode = (short)(-1);
    nPP0.primed_the_overridden_mode = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test055"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = true;
    int i4 = nPP0.old_the_water_pressure;
    nPP0.primed_the_overridden_mode = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test056"); }


    NPP nPP0 = new NPP();
    nPP0.the_safety_injection_mode = (short)1;
    boolean b3 = nPP0.old_the_reset_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test057"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_overridden_mode = false;
    boolean b6 = nPP0.primed_the_overridden_mode;
    int i7 = nPP0.the_pressure_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test058"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.old_the_water_pressure;
    int i6 = nPP0.the_pressure_mode;
    int i7 = nPP0.old_the_water_pressure;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test059"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    int i4 = nPP0.old_the_pressure_mode;
    nPP0.primed_the_overridden_mode = true;
    int i7 = nPP0.primed_the_safety_injection_mode;
    nPP0.primed_the_pressure_mode = (short)10;
    boolean b10 = nPP0.the_overridden_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test060"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_safety_injection_mode = 'a';
    java.lang.String str11 = nPP0.run(true, (int)(short)1, false);
    nPP0.primed_the_safety_injection_mode = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1 true 1"+ "'", str11.equals("1 true 1"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test061"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_safety_injection_mode = (byte)1;
    boolean b8 = nPP0.old_the_reset_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test062"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_pressure_mode = (byte)0;
    boolean b12 = nPP0.old_the_blockage_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test063"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_pressure_mode = (byte)0;
    nPP0.old_the_water_pressure = ' ';
    nPP0.primed_the_safety_injection_mode = (byte)1;
    boolean b16 = nPP0.primed_the_overridden_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test064"); }


    NPP nPP0 = new NPP();
    nPP0.the_safety_injection_mode = (short)1;
    int i3 = nPP0.primed_the_safety_injection_mode;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test065"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    nPP0.the_overridden_mode = false;
    nPP0.old_the_pressure_mode = ' ';
    nPP0.primed_the_overridden_mode = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test066"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_pressure_mode = (byte)0;
    nPP0.old_the_water_pressure = ' ';
    nPP0.primed_the_safety_injection_mode = (byte)1;
    nPP0.old_the_pressure_mode = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test067"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    int i4 = nPP0.old_the_pressure_mode;
    nPP0.primed_the_overridden_mode = true;
    int i7 = nPP0.primed_the_safety_injection_mode;
    nPP0.primed_the_overridden_mode = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test068"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_overridden_mode = true;
    nPP0.old_the_reset_button = true;
    nPP0.old_the_pressure_mode = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test069"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = true;
    int i4 = nPP0.old_the_water_pressure;
    boolean b5 = nPP0.old_the_blockage_button;
    nPP0.primed_the_pressure_mode = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test070"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.the_safety_injection_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test071"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.the_overridden_mode = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test072"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    int i4 = nPP0.old_the_pressure_mode;
    nPP0.primed_the_overridden_mode = true;
    int i7 = nPP0.primed_the_safety_injection_mode;
    int i8 = nPP0.old_the_water_pressure;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test073"); }


    NPP nPP0 = new NPP();
    nPP0.primed_the_pressure_mode = 10;
    int i3 = nPP0.the_pressure_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test074"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = true;
    int i4 = nPP0.the_pressure_mode;
    int i5 = nPP0.old_the_pressure_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test075"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_safety_injection_mode = 'a';
    java.lang.String str11 = nPP0.run(true, (int)(short)1, false);
    nPP0.the_overridden_mode = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1 true 1"+ "'", str11.equals("1 true 1"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test076"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    int i4 = nPP0.old_the_pressure_mode;
    nPP0.primed_the_overridden_mode = true;
    int i7 = nPP0.primed_the_safety_injection_mode;
    nPP0.primed_the_pressure_mode = (short)10;
    nPP0.the_safety_injection_mode = 0;
    nPP0.old_the_pressure_mode = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test077"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    int i5 = nPP0.primed_the_safety_injection_mode;
    nPP0.old_the_reset_button = false;
    int i8 = nPP0.primed_the_safety_injection_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test078"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    int i5 = nPP0.primed_the_safety_injection_mode;
    nPP0.old_the_reset_button = false;
    nPP0.old_the_pressure_mode = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test079"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    nPP0.the_pressure_mode = 'a';
    int i7 = nPP0.old_the_pressure_mode;
    boolean b8 = nPP0.old_the_blockage_button;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test080"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.old_the_water_pressure;
    boolean b6 = nPP0.old_the_reset_button;
    int i7 = nPP0.the_pressure_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test081"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    int i4 = nPP0.old_the_pressure_mode;
    java.lang.String str8 = nPP0.run(true, 10, true);
    java.lang.String str12 = nPP0.run(true, (int)(byte)(-1), false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1 false 1"+ "'", str8.equals("1 false 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1 true 1"+ "'", str12.equals("1 true 1"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test082"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    boolean b4 = nPP0.old_the_blockage_button;
    boolean b5 = nPP0.the_overridden_mode;
    int i6 = nPP0.the_safety_injection_mode;
    nPP0.the_overridden_mode = false;
    nPP0.the_overridden_mode = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test083"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.old_the_water_pressure;
    int i6 = nPP0.the_pressure_mode;
    int i7 = nPP0.the_safety_injection_mode;
    int i8 = nPP0.primed_the_safety_injection_mode;
    int i9 = nPP0.the_pressure_mode;
    nPP0.old_the_water_pressure = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test084"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    nPP0.the_overridden_mode = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test085"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = true;
    int i4 = nPP0.old_the_water_pressure;
    boolean b5 = nPP0.old_the_blockage_button;
    nPP0.old_the_water_pressure = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test086"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_pressure_mode = 'a';
    nPP0.the_pressure_mode = (byte)1;
    nPP0.old_the_water_pressure = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test087"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    nPP0.the_overridden_mode = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test088"); }


    NPP nPP0 = new NPP();
    nPP0.the_pressure_mode = (short)10;

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test089"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    int i5 = nPP0.the_pressure_mode;
    boolean b6 = nPP0.old_the_reset_button;
    boolean b7 = nPP0.the_overridden_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test090"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_pressure_mode = 'a';
    nPP0.the_pressure_mode = (-1);
    boolean b8 = nPP0.primed_the_overridden_mode;
    nPP0.primed_the_overridden_mode = true;
    nPP0.the_safety_injection_mode = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test091"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    int i7 = nPP0.the_pressure_mode;
    nPP0.primed_the_overridden_mode = false;
    nPP0.the_pressure_mode = (byte)0;
    nPP0.old_the_water_pressure = ' ';
    nPP0.primed_the_overridden_mode = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test092"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.primed_the_safety_injection_mode = 100;
    boolean b7 = nPP0.old_the_blockage_button;
    nPP0.old_the_reset_button = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test093"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_pressure_mode = 'a';
    nPP0.the_pressure_mode = (-1);
    boolean b8 = nPP0.primed_the_overridden_mode;
    boolean b9 = nPP0.the_overridden_mode;
    nPP0.old_the_reset_button = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test094"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    int i2 = nPP0.old_the_water_pressure;
    int i3 = nPP0.the_pressure_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test095"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.the_safety_injection_mode = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test096"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.old_the_water_pressure = (short)10;
    nPP0.primed_the_pressure_mode = (short)(-1);
    int i9 = nPP0.the_safety_injection_mode;
    int i10 = nPP0.the_pressure_mode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test097"); }


    NPP nPP0 = new NPP();
    boolean b1 = nPP0.old_the_blockage_button;
    nPP0.the_pressure_mode = 'a';
    nPP0.primed_the_overridden_mode = false;
    boolean b6 = nPP0.primed_the_overridden_mode;
    nPP0.the_safety_injection_mode = '#';
    nPP0.the_overridden_mode = false;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test098"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    int i4 = nPP0.primed_the_safety_injection_mode;
    nPP0.the_overridden_mode = false;
    nPP0.primed_the_safety_injection_mode = 'a';
    nPP0.the_safety_injection_mode = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test099"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    int i5 = nPP0.old_the_water_pressure;
    int i6 = nPP0.the_safety_injection_mode;
    nPP0.primed_the_overridden_mode = true;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RandoopTest0.test100"); }


    NPP nPP0 = new NPP();
    int i1 = nPP0.old_the_pressure_mode;
    nPP0.old_the_blockage_button = false;
    boolean b4 = nPP0.old_the_reset_button;
    nPP0.old_the_water_pressure = (short)10;
    nPP0.primed_the_safety_injection_mode = (byte)1;
    int i9 = nPP0.old_the_pressure_mode;
    int i10 = nPP0.old_the_water_pressure;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

}
