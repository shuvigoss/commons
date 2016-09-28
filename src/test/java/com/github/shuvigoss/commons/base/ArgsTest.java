package com.github.shuvigoss.commons.base;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shuvigoss@gmail.com (Wei Shu)
 */
public class ArgsTest {

  private ArgsBean a = new ArgsBean();

  @Test(expected = IllegalArgumentException.class)
  public void isTrueTest() {
    a.isTrue(false);
  }

  @Test
  public void isTrueTest1() {
    a.isTrue(true);
  }

  @Test(expected = IllegalArgumentException.class)
  public void isFalseTest() {
    a.isFalse(true);
  }

  @Test
  public void isFalseTest1() {
    a.isFalse(false);
  }

  @Test(expected = IllegalArgumentException.class)
  public void notNullTest() {
    a.notNull(null);
  }

  @Test
  public void notNullTest1() {
    a.notNull(a);
  }

  @Test(expected = IllegalArgumentException.class)
  public void notNullNotEmptyTest() {
    a.notNullNotEmpty(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void notNullNotEmptyTest1() {
    a.notNullNotEmpty("");
  }

  @Test
  public void notNullNotEmptyTest1_1() {
    a.notNullNotEmpty("a");
  }

  @Test(expected = IllegalArgumentException.class)
  public void notNullNotEmptyTest2() {
    a.notNullNotEmpty(Collections.EMPTY_LIST);
  }

  @Test
  public void notNullNotEmptyTest2_1() {
    a.notNullNotEmpty(Collections.singletonList(new Object()));
  }

  @Test(expected = IllegalArgumentException.class)
  public void notNullNotEmptyTest3() {
    a.notNullNotEmpty(new HashMap<>());
  }

  @Test
  public void notNullNotEmptyTest3_1() {
    Map<Object, Object> map = Maps.newHashMap();
    map.put("a", "a");
    a.notNullNotEmpty(map);
  }

  @Test(expected = IllegalArgumentException.class)
  public void notNullNotEmptyTest4() {
    int[] i = new int[]{};
    a.notNullNotEmpty(i);
  }
  @Test
  public void notNullNotEmptyTest4_1() {
    int[] i = new int[1];
    a.notNullNotEmpty(i);
  }

  @Test(expected = IllegalArgumentException.class)
  public void notNullNotEmptyTest5() {
    Object[] objs = new Object[]{};
    a.notNullNotEmpty(objs);
  }

  @Test
  public void notNullNotEmptyTest5_1() {
    Object[] objs = new Object[]{new Object()};
    a.notNullNotEmpty(objs);
  }
}
